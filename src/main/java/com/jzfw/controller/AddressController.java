package com.jzfw.controller;

import com.jzfw.bean.Address;
import com.jzfw.service.IAddressService;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import com.jacky.base.utils.PageVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(
   description = "jzwf-地址管理相关接口"
)
@Validated
@RestController
@RequestMapping({"/address"})
public class AddressController {
   @Autowired
   private IAddressService addressService;

   @ApiOperation("分页查询地址相关信息")
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
   name = "userId",
   value = "用户编号",
   paramType = "query"
)})
   public Message pageQuery(int page, int pageSize, Long userId) {
      PageVM<Address> pageVM = this.addressService.pageQuery(page, pageSize, userId);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("通过id删除")
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.addressService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation(
      value = "保存或更新地址信息",
      notes = "如果ID不为空，为修改操作，根据ID进行修改；如果ID为空，为保存操作"
   )
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(@RequestBody Address address) {
      this.addressService.saveOrUpdate(address);
      return MessageUtil.success("操作成功");
   }
}
