package com.jzfw.controller;

import com.jzfw.bean.Category;
import com.jzfw.bean.extend.ArticleExtend;
import com.jzfw.service.IArticleService;
import com.jzfw.service.ICategoryService;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import com.jacky.base.utils.PageVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Api(
//   description = "门户接口"
//)
@Validated
//@RestController
@RequestMapping({"/index"})
public class IndexController {
   @Autowired
   private ICategoryService categoryService;
   @Autowired
   private IArticleService articleService;

   @ApiOperation("查询所有资讯分类")
   @GetMapping({"findAllCategory"})
   public Message findAllCategory() {
      List<Category> list = this.categoryService.findAll();
      return MessageUtil.success(list);
   }

   @ApiOperation("分页多条件获取资讯")
   @GetMapping({"pageQueryArticles"})
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
   public Message pageQueryArticles(int page, int pageSize, String title, String status, Long authorId, Long categoryId) {
      PageVM<ArticleExtend> pageVM = this.articleService.pageQuery(page, pageSize, title, status, authorId, categoryId);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("通过id查询资讯")
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "主键",
   paramType = "query"
)})
   @GetMapping({"readArticle"})
   public Message readArticle(long id) {
      ArticleExtend articleExtend = this.articleService.readArticle(id);
      return MessageUtil.success(articleExtend);
   }

   @ApiOperation("点赞")
   @GetMapping({"thumbUpArticle"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "文章id",
   required = true,
   paramType = "query"
)})
   public Message thumbUpArticle(@NotNull long id) {
      this.articleService.thumbUp(id);
      return MessageUtil.success("点赞成功");
   }
}
