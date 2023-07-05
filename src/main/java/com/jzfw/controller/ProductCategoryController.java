package com.jzfw.controller;

import com.jzfw.bean.ProductCategory;
import com.jzfw.service.IProductCategoryService;
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
   description = "jzfw-家政服务分类相关接口"
)
@Validated
@RestController
@RequestMapping({"/productCategory"})
public class ProductCategoryController {
   @Autowired
   private IProductCategoryService productCategoryService;

   @ApiOperation("分页查询产品分类相关信息")
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
   name = "name",
   value = "产品名称",
   paramType = "query"
)})
   public Message pageQuery(int page, int pageSize, String name) {
      PageVM<ProductCategory> pageVM = this.productCategoryService.pageQuery(page, pageSize, name);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("通过id删除产品分类")
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.productCategoryService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation(
      value = "保存或更新产品分类信息",
      notes = "如果ID不为空，为修改操作，根据ID进行修改；如果ID为空，为保存操作"
   )
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(ProductCategory category) {
      this.productCategoryService.saveOrUpdate(category);
      return MessageUtil.success("操作成功");
   }
}
