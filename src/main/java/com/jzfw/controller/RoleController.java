package com.jzfw.controller;

import com.jzfw.bean.BaseRole;
import com.jzfw.bean.extend.BaseRoleExtend;
import com.jzfw.service.IBaseRoleService;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-角色相关接口"
)
@Validated
@RestController
@RequestMapping({"/role"})
public class RoleController {
   @Autowired
   private IBaseRoleService baseRoleService;

   @ApiOperation("查询所有")
   @GetMapping({"findAll"})
   public Message findAll() {
      List<BaseRole> list = this.baseRoleService.findAll();
      return MessageUtil.success(list);
   }

   @ApiOperation(
      value = "查询所有",
      notes = "级联权限"
   )
   @GetMapping({"cascadePrivilegeFindAll"})
   public Message cascadePrivilegeFindAll() {
      List<BaseRoleExtend> list = this.baseRoleService.cascadePrivilegeFindAll();
      return MessageUtil.success(list);
   }

   @ApiOperation("通过id删除")
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.baseRoleService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("保存或更新")
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(BaseRole role) {
      this.baseRoleService.saveOrUpdate(role);
      return MessageUtil.success("更新成功");
   }

   @ApiOperation("为角色授权")
   @PostMapping({"authorization"})
   public Message authorization(long id, Long[] privileges) {
      List<Long> ids = Arrays.asList(privileges);
      this.baseRoleService.authorization(id, ids);
      return MessageUtil.success("授权成功");
   }
}
