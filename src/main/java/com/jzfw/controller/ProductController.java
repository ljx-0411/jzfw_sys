package com.jzfw.controller;

import com.jzfw.bean.Product;
import com.jzfw.bean.extend.ProductExtend;
import com.jzfw.service.IProductService;
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
   description = "jzfw-家政产品相关接口"
)
@Validated
@RestController
@RequestMapping({"/product"})
public class ProductController {
   @Autowired
   private IProductService productService;

   @ApiOperation("分页查询产品相关信息")
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
), @ApiImplicitParam(
   name = "status",
   value = "产品状态",
   paramType = "query"
), @ApiImplicitParam(
   name = "productCategoryId",
   value = "分类编号",
   paramType = "query"
)})
   public Message pageQuery(int page, int pageSize, String name, String status, Long productCategoryId) {
      PageVM<ProductExtend> pageVM = this.productService.pageQuery(page, pageSize, name, status, productCategoryId);
      return MessageUtil.success(pageVM);
   }

   /** @deprecated */
   @Deprecated
   @ApiOperation("通过id删除")
   @GetMapping({"deleteById"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "产品编号",
   required = true,
   paramType = "query"
)})
   public Message deleteById(long id) {
      this.productService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("上架")
   @GetMapping({"online"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "产品编号",
   required = true,
   paramType = "query"
)})
   public Message online(long id) {
      this.productService.changeStatus(id, 1);
      return MessageUtil.success("上架成功");
   }

   @ApiOperation("下架")
   @GetMapping({"offline"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "产品编号",
   required = true,
   paramType = "query"
)})
   public Message offline(long id) {
      this.productService.changeStatus(id, 0);
      return MessageUtil.success("下架成功");
   }

   @ApiOperation(
      value = "保存或更新产品信息",
      notes = "如果ID不为空，为修改操作，根据ID进行修改；如果ID为空，为保存操作"
   )
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(Product product) {
      this.productService.saveOrUpdate(product);
      return MessageUtil.success("操作成功");
   }
}
