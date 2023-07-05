package com.jzfw.controller;

import com.jzfw.bean.AccountApply;
import com.jzfw.service.IAccountApplyService;
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

@Api(
   description = "jzfw- 账户状态申请相关接口"
)
@Validated
//@RestController
@RequestMapping({"/accountApply"})
public class AccountApplyController {
   @Autowired
   private IAccountApplyService accountApplyService;

   @ApiOperation("撤销账户变动申请")
   @GetMapping({"revokeAccountApply"})
   public Message revokeAccountApply(long id) {
      this.accountApplyService.revoke(id);
      return MessageUtil.success("撤销成功！");
   }

   @ApiOperation("审核通过")
   @GetMapping({"checkPass"})
   public Message checkPass(long id) {
      this.accountApplyService.check(id, "通过", (String)null);
      return MessageUtil.success("操作成功！");
   }

   @ApiOperation("审核不通过")
   @GetMapping({"checkNoPass"})
   public Message checkNoPass(long id, String reason) {
      this.accountApplyService.check(id, "不通过", reason);
      return MessageUtil.success("操作成功！");
   }

   @ApiOperation("提交账户变动申请")
   @PostMapping({"submitAccountApply"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "money",
   value = "变动金额",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "applyType",
   value = "账户变动类型【提现】",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "userId",
   value = "用户编号",
   required = true,
   paramType = "query"
)})
   public Message submitAccountApply(AccountApply accountApplyApply) {
      this.accountApplyService.submit(accountApplyApply);
      return MessageUtil.success("提交成功");
   }

   @ApiOperation("分页查询账户变动申请")
   @GetMapping({"pageQueryAccountApply"})
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
   name = "applyType",
   value = "申请类型[提现、充值]",
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
   public Message pageQueryAccountApply(int page, int pageSize, String status, String applyType, Long userId, Long beginTime, Long endTime) {
      PageVM<AccountApply> pageVM = this.accountApplyService.pageQuery(page, pageSize, status, applyType, userId, beginTime, endTime);
      return MessageUtil.success(pageVM);
   }
}
