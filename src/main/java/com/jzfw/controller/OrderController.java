package com.jzfw.controller;

import com.jzfw.bean.extend.OrderExtend;
import com.jzfw.service.IOrderService;
import com.jzfw.vm.OrderAndOrderLineVM;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import com.jacky.base.utils.PageVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-订单相关接口"
)
@Validated
@RestController
@RequestMapping({"/order"})
public class OrderController {
   @Autowired
   private IOrderService orderService;

   @ApiOperation("分页查询订单相关信息")
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
   name = "beginTime",
   value = "开始时间",
   paramType = "query"
), @ApiImplicitParam(
   name = "endTime",
   value = "结束时间",
   paramType = "query"
), @ApiImplicitParam(
   name = "status",
   value = "订单状态:待支付、待派单、待接单、待服务、待确认、已完成",
   paramType = "query"
), @ApiImplicitParam(
   name = "customerId",
   value = "顾客编号",
   paramType = "query"
), @ApiImplicitParam(
   name = "employeeId",
   value = "员工编号",
   paramType = "query"
)})
   public Message pageQuery(int page, int pageSize, Long beginTime, Long endTime, String status, Long customerId, Long employeeId) {
      PageVM<OrderExtend> pageVM = this.orderService.pageQuery(page, pageSize, beginTime, endTime, status, customerId, employeeId);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("通过id删除")
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.orderService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("提交订单")
   @PostMapping({"submitOrder"})
   public Message submitOrder(@RequestBody OrderAndOrderLineVM order) {
      this.orderService.submitOrder(order);
      return MessageUtil.success("操作成功");
   }

   @ApiOperation("通过id查询订单详情")
   @GetMapping({"findById"})
   public Message findById(long id) {
      OrderExtend order = this.orderService.findById(id);
      return MessageUtil.success(order);
   }

   @GetMapping({"sendOrder"})
   @ApiOperation("派单")
   public Message sendOrder(@NotNull @RequestParam("waiterId") Long waiterId, @NotNull @RequestParam("orderId") Long orderId) throws Exception {
      this.orderService.sendOrder(waiterId, orderId);
      return MessageUtil.success("派单成功");
   }

   @GetMapping({"takeOrder"})
   @ApiOperation("接单")
   public Message takeOrder(@NotNull @RequestParam("orderId") Long orderId) throws Exception {
      this.orderService.takeOrder(orderId);
      return MessageUtil.success("接单成功");
   }

   @GetMapping({"rejectOrder"})
   @ApiOperation("拒绝订单")
   public Message rejectOrder(@NotNull @RequestParam("orderId") Long orderId) throws Exception {
      this.orderService.rejectOrder(orderId);
      return MessageUtil.success("操作成功");
   }

   @GetMapping({"serviceCompleteOrder"})
   @ApiOperation("员工服务结束")
   public Message serviceCompleteOrder(@NotNull @RequestParam("orderId") Long orderId) throws Exception {
      this.orderService.serviceCompleted(orderId);
      return MessageUtil.success("服务完成");
   }

   @GetMapping({"confirmOrder"})
   @ApiOperation("确认订单")
   public Message confirmOrder(@NotNull @RequestParam("orderId") Long orderId) throws Exception {
      this.orderService.confirmOrder(orderId);
      return MessageUtil.success("确认订单成功");
   }

   @GetMapping({"cancelSendOrder"})
   @ApiOperation("取消派单")
   public Message cancelSendOrder(@NotNull @RequestParam("orderId") Long orderId) throws Exception {
      this.orderService.cancelSendOrder(orderId);
      return MessageUtil.success("取消成功");
   }
}
