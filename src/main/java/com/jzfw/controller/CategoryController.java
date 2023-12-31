package com.jzfw.controller;

import com.jzfw.bean.Category;
import com.jzfw.service.ICategoryService;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-资讯分类相关接口"
)
@Validated
@RestController
@RequestMapping({"/category"})
public class CategoryController {
   @Autowired
   private ICategoryService categoryService;

   @ApiOperation("查询所有资讯分类")
   @GetMapping({"findAll"})
   public Message findAll() {
      List<Category> list = this.categoryService.findAll();
      return MessageUtil.success(list);
   }

   @ApiOperation("通过id删除")
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.categoryService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("批量删除")
   @PostMapping({"batchDelete"})
   public Message batchDelete(long[] ids) {
      this.categoryService.batchDelete(ids);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("保存或更新")
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "主键",
   paramType = "form"
), @ApiImplicitParam(
   name = "name",
   value = "栏目名称",
   paramType = "form",
   required = true
), @ApiImplicitParam(
   name = "description",
   value = "栏目描述",
   paramType = "form"
), @ApiImplicitParam(
   name = "no",
   value = "序号",
   paramType = "form"
), @ApiImplicitParam(
   name = "parentId",
   value = "父栏目id",
   paramType = "form"
)})
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(Long id, @NotNull String name, String description, Integer no, Long parentId) {
      Category category = new Category();
      category.setId(id);
      category.setName(name);
      category.setDescription(description);
      category.setNo(no);
      category.setParentId(parentId);
      this.categoryService.saveOrUpdate(category);
      return MessageUtil.success("更新成功");
   }
}
