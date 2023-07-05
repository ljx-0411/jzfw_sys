package com.jzfw.controller;

import com.jzfw.bean.CertificationApply;
import com.jzfw.service.ICertificationService;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import com.jacky.base.utils.PageVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Api(
//   description = "jz- 实名认证申请相关接口"
//)
@Validated
//@RestController
@RequestMapping({"/certification"})
public class CertificationController {
   @Autowired
   private ICertificationService certificationService;

   @ApiOperation("撤销实名认证申请")
   @GetMapping({"revokeCertificationApply"})
   public Message revokeCertificationApply(long id) {
      this.certificationService.revoke(id);
      return MessageUtil.success("撤销成功！");
   }

   @ApiOperation("审核通过")
   @GetMapping({"checkPass"})
   public Message checkPass(long id) {
      this.certificationService.check(id, "通过", (String)null);
      return MessageUtil.success("操作成功！");
   }

   @ApiOperation("审核不通过")
   @GetMapping({"checkNoPass"})
   public Message checkNoPass(long id, String reason) {
      this.certificationService.check(id, "不通过", reason);
      return MessageUtil.success("操作成功！");
   }

   @ApiOperation("提交实名认证申请")
   @PostMapping({"submitCertificationApply"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "realname",
   value = "真实姓名",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "idCard",
   value = "身份证号",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "idcardPhotoPositive",
   value = "身份证正面照片",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "idcardPhotoNegative",
   value = "身份证反面照片",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "bankCard",
   value = "银行卡号",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "bankCardPhoto",
   value = "银行卡照片",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "userId",
   value = "用户编号",
   required = true,
   paramType = "query"
)})
   public Message submitCertificationApply(CertificationApply certificationApply) {
      this.certificationService.submit(certificationApply);
      return MessageUtil.success("提交成功");
   }

   @ApiOperation("分页查询实名认证申请")
   @GetMapping({"pageQueryCertificationApply"})
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
   name = "status",
   value = "状态[通过、不通过、未审核]",
   paramType = "query"
), @ApiImplicitParam(
   name = "userId",
   value = "用户编号",
   paramType = "query"
), @ApiImplicitParam(
   name = "beginTime",
   value = "开始时间",
   paramType = "query"
), @ApiImplicitParam(
   name = "endTime",
   value = "结束时间",
   paramType = "query"
)})
   public Message pageQueryCertificationApply(int page, int pageSize, String status, Long userId, Long beginTime, Long endTime) {
      PageVM<CertificationApply> pageVM = this.certificationService.pageQuery(page, pageSize, status, userId, beginTime, endTime);
      return MessageUtil.success(pageVM);
   }
}
