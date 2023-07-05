package com.jzfw.controller;

import com.jzfw.bean.Comment;
import com.jzfw.bean.extend.CommentExtend;
import com.jzfw.service.ICommentService;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-评论管理"
)
@RestController
@Validated
@RequestMapping({"/comment"})
public class CommentController {
   @Autowired
   private ICommentService commentService;

   @ApiOperation("分页所有评论信息")
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
   name = "keywords",
   value = "评论关键字",
   paramType = "query"
)})
   public Message pageQuery(@NotNull int page, @NotNull int pageSize, String keywords) {
      PageVM<CommentExtend> pageVM = this.commentService.pageQuery(page, pageSize, keywords);
      return MessageUtil.success("success", pageVM);
   }

   @ApiOperation(
      value = "保存或更新评论",
      notes = "如果参数中id不为空表示保存，否则表示更新"
   )
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(Comment comment) {
      try {
         this.commentService.saveOrUpdate(comment);
         return MessageUtil.success("操作成功", (Object)null);
      } catch (Exception var3) {
         var3.printStackTrace();
         return MessageUtil.error(var3.getMessage());
      }
   }

   @ApiOperation("批量删除评论")
   @PostMapping({"batchDelete"})
   public Message batchDelete(long[] ids) {
      try {
         this.commentService.batchDelete(ids);
         return MessageUtil.success("删除成功", (Object)null);
      } catch (Exception var3) {
         var3.printStackTrace();
         return MessageUtil.error(var3.getMessage());
      }
   }

   @ApiOperation("根据ID删除评论")
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      try {
         this.commentService.deleteById(id);
         return MessageUtil.success("删除成功", (Object)null);
      } catch (Exception var4) {
         var4.printStackTrace();
         return MessageUtil.error(var4.getMessage());
      }
   }

   @ApiOperation(
      value = "审核评论",
      notes = "status的取值只能为\"审核通过\"，\"审核未通过\""
   )
   @GetMapping({"check"})
   public Message check(long id, String status) {
      try {
         this.commentService.checkComment(id, status);
         return MessageUtil.success("操作成功", (Object)null);
      } catch (Exception var5) {
         var5.printStackTrace();
         return MessageUtil.error(var5.getMessage());
      }
   }
}
