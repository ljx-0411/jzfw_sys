package com.jzfw.controller;

import com.jzfw.bean.AccountCustomer;
import com.jzfw.bean.AccountEmployee;
import com.jzfw.bean.AccountSystem;
import com.jzfw.service.IAccountService;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-三方用户账单相关接口"
)
@Validated
@RestController
@RequestMapping({"/account"})
public class AccountController {
   @Autowired
   private IAccountService accountService;

   @ApiOperation("顾客充值")
   @GetMapping({"recharge"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "customerId",
   value = "顾客编号",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "money",
   value = "充值金额",
   required = true,
   paramType = "query"
)})
   public Message recharge(long customerId, double money) {
      this.accountService.recharge(customerId, money);
      return MessageUtil.success("充值成功!");
   }

   @ApiOperation("分页查询顾客账单")
   @GetMapping({"pageQueryCustomerAccount"})
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
   value = "状态[正常]",
   paramType = "query"
), @ApiImplicitParam(
   name = "type",
   value = "账务类型[消费、充值]",
   paramType = "query"
), @ApiImplicitParam(
   name = "beginTime",
   value = "开始时间",
   paramType = "query"
), @ApiImplicitParam(
   name = "endTime",
   value = "结束时间",
   paramType = "query"
), @ApiImplicitParam(
   name = "userId",
   value = "顾客编号",
   paramType = "query"
)})
   public Message pageQueryCustomerAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime, Long userId) {
      PageVM<AccountCustomer> pageVM = this.accountService.pageQueryCustomerAccount(page, pageSize, status, type, beginTime, endTime, userId);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("分页查询员工账单")
   @GetMapping({"pageQueryEmployeeAccount"})
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
   value = "状态[正常]",
   paramType = "query"
), @ApiImplicitParam(
   name = "type",
   value = "账务类型[消费、充值]",
   paramType = "query"
), @ApiImplicitParam(
   name = "beginTime",
   value = "开始时间",
   paramType = "query"
), @ApiImplicitParam(
   name = "endTime",
   value = "结束时间",
   paramType = "query"
), @ApiImplicitParam(
   name = "userId",
   value = "顾客编号",
   paramType = "query"
)})
   public Message pageQueryEmployeeAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime, Long userId) {
      PageVM<AccountEmployee> pageVM = this.accountService.pageQueryEmployeeAccount(page, pageSize, status, type, beginTime, endTime, userId);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("分页查询系统账单")
   @GetMapping({"pageQuerySystemAccount"})
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
   value = "状态[正常]",
   paramType = "query"
), @ApiImplicitParam(
   name = "type",
   value = "账务类型[消费、充值]",
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
   public Message pageQuerySystemAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime) {
      PageVM<AccountSystem> pageVM = this.accountService.pageQuerySystemAccount(page, pageSize, status, type, beginTime, endTime);
      return MessageUtil.success(pageVM);
   }
}
