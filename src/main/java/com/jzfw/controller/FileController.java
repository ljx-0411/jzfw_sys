package com.jzfw.controller;

import com.jzfw.bean.BaseFile;
import com.jzfw.obj.BaseEnum;
import com.jzfw.obj.UploadResp;
import com.jzfw.service.IBaseFileService;
import com.jacky.base.utils.FastDFS;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import com.jacky.base.utils.PageVM;
import com.jzfw.utils.OssComponent;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Api(
        description = "jzfw-文件上传相关接口"
)
@RestController
@RequestMapping({"/file"})
public class FileController {
    @Autowired
    private IBaseFileService baseFileService;

    @Resource
    private OssComponent ossComponent;

    @Value("${req.doMainUrl}")
    private String doMainUrl;

    @ApiOperation("分页查询附件信息")
    @GetMapping({"pageQuery"})
    @ApiImplicitParams({@ApiImplicitParam(
            name = "page",
            value = "当前页",
            required = true,
            paramType = "query"
    ), @ApiImplicitParam(
            name = "pageSize",
            value = "每页大小",
            required = true,
            paramType = "query"
    ), @ApiImplicitParam(
            name = "fileName",
            value = "文件名称",
            paramType = "query"
    ), @ApiImplicitParam(
            name = "datasetId",
            value = "数据集编号",
            paramType = "query"
    ), @ApiImplicitParam(
            name = "uploadDate",
            value = "上传日期",
            paramType = "query"
    )})
    public Message pageQuery(int page, int pageSize, String fileName, Long datasetId, String uploadDate) {
        PageVM<BaseFile> pageVM = this.baseFileService.pageQuery(page, pageSize, fileName, datasetId, uploadDate);
        return MessageUtil.success(pageVM);
    }

    private void downLoadFromUrl(String urlStr, OutputStream os) {
        try {
            URL url = null;
            HttpURLConnection conn = null;
            InputStream inputStream = null;

            try {
                url = new URL(urlStr);
                conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(3000);
                conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
                inputStream = conn.getInputStream();
                byte[] getData = this.readInputStream(inputStream);
                os.write(getData);
                os.flush();
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }

                if (os != null) {
                    os.close();
                }

            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }

    }

    private byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        while ((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }

        bos.close();
        return bos.toByteArray();
    }

    @ApiOperation(
            value = "下载文件",
            produces = "application/octet-stream"
    )
    @GetMapping({"download"})
    public void download(HttpServletResponse response, String url) throws Exception {
        response.setHeader("Content-Type", "application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(url, "utf-8"));
        OutputStream os = response.getOutputStream();
        this.downLoadFromUrl(url, os);
    }

    @ApiOperation("远程文件删除")
    @GetMapping({"deleteById"})
    public Message delete(@ApiParam(value = "文件id", required = true) String id) throws Exception {
        int code = FastDFS.delete(id);
        if (code == 0) {
            this.baseFileService.deleteById(id);
            return MessageUtil.success("删除成功");
        } else {
            return MessageUtil.error("删除失败");
        }
    }

/*    @ApiOperation(
            value = "文件上传",
            notes = "文件大小限制为3M, 上传完成后需要保存图片id与groupid，通过http://121.199.29.84/8888/group1/fileId 来访问图片"
    )
    @PostMapping({"upload"})
    public Message upload(@RequestParam("file") MultipartFile file, HttpServletRequest req, String fileType) throws Exception {
        String fileName = file.getOriginalFilename();
        String ext_name = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (ext_name.contains("?")) {
            ext_name = ext_name.substring(0, ext_name.indexOf("?"));
        }

        long fileSize = file.getSize();
        if (fileSize > 30145728L) {
            return MessageUtil.error("文件大小不能超过了3M");
        } else {
            String[] result = FastDFS.upload(file.getBytes(), ext_name);
            String s = ossComponent.uploadFile(BaseEnum.OSS_USER, file);
            if (result != null && result.length > 1) {
                String erpGroupName = result[0];
                String erpFileName = result[1];
                BaseFile baseFile = new BaseFile();
                baseFile.setFileName(fileName);
                baseFile.setId(erpFileName);
                baseFile.setGroupName(erpGroupName);
                baseFile.setExtName(ext_name);
                baseFile.setFileType(fileType);
                baseFile.setUploadTime((new Date()).getTime());
                baseFile.setFileSize(fileSize);
                this.baseFileService.save(baseFile);
                return MessageUtil.success("success", baseFile);
            } else {
                return MessageUtil.error("上传失败");
            }
        }
    }*/


    @PostMapping({"upload"})
    public Message uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest req, String fileType) throws Exception {
        long fileSize = file.getSize();
        if (fileSize > 30145728L) {
            return MessageUtil.error("文件大小不能超过了3M");
        } else {
            try {
                String url = ossComponent.uploadFile(BaseEnum.OSS_DIR, file);
                UploadResp uploadResp = new UploadResp();
                uploadResp.setUrl(url);
                return MessageUtil.success("success", uploadResp);
            } catch (Exception e) {
                return MessageUtil.error("上传失败");
            }
        }
    }
}
