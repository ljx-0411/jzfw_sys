package com.jzfw.controller;

import com.jzfw.bean.Article;
import com.jzfw.bean.extend.ArticleExtend;
import com.jzfw.service.IArticleService;
import com.jacky.base.utils.ExcelUtils;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import com.jacky.base.utils.PageVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-风采相关接口"
)
@Validated
@RestController
@RequestMapping({"/article"})
public class ArticleController {
   @Autowired
   private IArticleService articleService;

   @ApiOperation("分页多条件获取学生风采信息")
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
   name = "title",
   value = "学生风采标题",
   paramType = "query"
), @ApiImplicitParam(
   name = "status",
   value = "风采状态",
   paramType = "query"
), @ApiImplicitParam(
   name = "authorId",
   value = "作者id",
   paramType = "query"
), @ApiImplicitParam(
   name = "categoryId",
   value = "分类id",
   paramType = "query"
)})
   public Message pageQuery(int page, int pageSize, String title, String status, Long authorId, Long categoryId) {
      PageVM<ArticleExtend> pageVM = this.articleService.pageQuery(page, pageSize, title, status, authorId, categoryId);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation(
      value = "将消息导入到Excel中",
      notes = "注意！测试的时候请将地址粘贴到浏览器地址栏测试",
      produces = "application/octet-stream"
   )
   @GetMapping({"download"})
   public void download(HttpServletResponse response) throws Exception {
      String excelName = "article_list";
      String[] headList = new String[]{"编号", "标题", "内容"};
      String[] fieldList = new String[]{"id", "title", "content"};
      List<Map<String, Object>> dataList = new ArrayList();
      List<Article> list = this.articleService.findAll();
      Iterator var7 = list.iterator();

      while(var7.hasNext()) {
         Article a = (Article)var7.next();
         Map<String, Object> map = new HashMap();
         map.put("id", a.getId());
         map.put("title", a.getTitle());
         map.put("content", a.getContent());
         dataList.add(map);
      }

      ExcelUtils.createExcel(response, excelName, headList, fieldList, dataList);
   }

   @ApiOperation("查询所有学生风采")
   @GetMapping({"findAll"})
   public Message findAll() {
      List<Article> list = this.articleService.findAll();
      return MessageUtil.success(list);
   }

   @ApiOperation(
      value = "级联查询学生风采",
      notes = "级联所属分类，作者，评论，项目，图片"
   )
   @GetMapping({"cascadeFindAll"})
   public Message cascadeFindAll() {
      List<ArticleExtend> list = this.articleService.cascadeFindAll();
      return MessageUtil.success(list);
   }

   @ApiOperation("通过id查询学生风采，阅读")
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "主键",
   paramType = "query"
)})
   @GetMapping({"findById"})
   public Message findById(long id) {
      ArticleExtend articleExtend = this.articleService.findById(id);
      return MessageUtil.success(articleExtend);
   }

   @ApiOperation("通过id删除")
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "主键",
   paramType = "query",
   required = true
)})
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.articleService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation(
      value = "保存或更新消息信息",
      notes = "如果参数中包含id后端认为是更新操作，如果参数中不包含id认为是插入操作"
   )
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(Article article) {
      this.articleService.saveOrUpdate(article);
      return MessageUtil.success("更新成功");
   }

   @ApiOperation("分页获取所有推荐学生风采信息")
   @GetMapping({"findAllRecommend"})
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
)})
   public Message findAllRecommend(int page, int pageSize) {
      PageVM<ArticleExtend> pageVM = this.articleService.findAllRecommend(page, pageSize);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("修改风采状态")
   @PostMapping({"changeStatus"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "风采编号",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "status",
   value = "状态",
   required = true,
   paramType = "query"
)})
   public Message changeStatus(@NotNull long id, @NotNull String status) {
      this.articleService.changeStatus(id, status);
      return MessageUtil.success("审核成功");
   }
}
