package com.jzfw.controller;

import com.jzfw.bean.OrderComment;
import com.jzfw.service.IOrderCommentService;
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
   description = "jzfw-订单评论相关接口"
)
@Validated
@RestController
@RequestMapping({"/orderComment"})
public class OrderCommentController {
   @Autowired
   private IOrderCommentService orderCommentService;

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
   name = "content",
   value = "评论内容",
   paramType = "query"
), @ApiImplicitParam(
   name = "status",
   value = "状态",
   paramType = "query"
), @ApiImplicitParam(
   name = "orderId",
   value = "订单编号",
   paramType = "query"
)})
   public Message pageQuery(int page, int pageSize, String content, String status, Long orderId) {
      PageVM<OrderComment> pageVM = this.orderCommentService.pageQuery(page, pageSize, content, status, orderId);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("通过id删除")
   @GetMapping({"deleteById"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "编号",
   required = true,
   paramType = "query"
)})
   public Message deleteById(long id) {
      this.orderCommentService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("评论订单")
   @PostMapping({"submit"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "content",
   value = "评论内容",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "orderId",
   value = "订单编号",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "customerId",
   value = "顾客编号",
   required = true,
   paramType = "query"
)})
   public Message submit(OrderComment comment) {
      this.orderCommentService.submit(comment);
      return MessageUtil.success("评论成功");
   }

   @ApiOperation("审核通过")
   @PostMapping({"checkPass"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "编号",
   required = true,
   paramType = "query"
)})
   public Message checkPass(long id) {
      this.orderCommentService.check(id, "通过");
      return MessageUtil.success("操作成功");
   }

   @ApiOperation("审核不通过")
   @PostMapping({"checkNoPass"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "编号",
   required = true,
   paramType = "query"
)})
   public Message checkNoPass(long id) {
      this.orderCommentService.check(id, "不通过");
      return MessageUtil.success("操作成功");
   }
}
