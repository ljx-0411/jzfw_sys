package com.jzfw.controller;

import com.jzfw.bean.BasePrivilege;
import com.jzfw.bean.BaseUser;
import com.jzfw.bean.UserFaceReq;
import com.jzfw.bean.extend.BaseUserExtend;
import com.jzfw.service.IBasePrivilegeService;
import com.jzfw.service.IBaseUserService;
import com.jzfw.vm.UserRoleVM;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import com.jacky.base.utils.PageVM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(
   description = "jzfw-用户相关接口"
)
@Validated
@RestController
@RequestMapping({"/baseUser"})
public class BaseUserController {
   @Autowired
   private IBaseUserService baseUserService;
   @Autowired
   private IBasePrivilegeService basePrivilegeService;

   @ApiOperation("分页查询用户信息")
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
   name = "username",
   value = "用户名",
   paramType = "query"
), @ApiImplicitParam(
   name = "roleId",
   value = "角色ID",
   paramType = "query"
), @ApiImplicitParam(
   name = "status",
   value = "状态",
   paramType = "query"
)})
   public Message pageQuery(int page, int pageSize, String username, Long roleId, String status) {
      PageVM<BaseUser> pageVM = this.baseUserService.pageQuery(page, pageSize, username, roleId, status);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation("通过ID查询权限信息")
   @GetMapping({"findMenuByUserId"})
   public Message findMenuByUserId(long id) {
      List<BasePrivilege> list = this.basePrivilegeService.findMenuByUserId(id);
      return MessageUtil.success(list);
   }

   @ApiOperation("通过ID查询用户详情")
   @GetMapping({"findUserDetailsById"})
   public Message findUserDetailsById(long id) {
      BaseUserExtend user = this.baseUserService.findById(id);
      return MessageUtil.success(user);
   }

   @ApiOperation(
      value = "查询所有",
      notes = "级联用户角色"
   )
   @GetMapping({"cascadeRoleFindAll"})
   public Message cascadeRoleFindAll() {
      List<BaseUserExtend> list = this.baseUserService.cascadeRoleFindAll();
      return MessageUtil.success(list);
   }

   @ApiOperation("保存或更新")
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(@RequestBody BaseUser baseUser) {
      this.baseUserService.saveOrUpdate(baseUser);
      return MessageUtil.success("更新成功");
   }

   @ApiOperation("保存用户并指定角色")
   @PostMapping({"addUserWidthRole"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "username",
   value = "用户名",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "password",
   value = "密码",
   required = true,
   paramType = "query"
), @ApiImplicitParam(
   name = "telephone",
   value = "手机号",
   required = false,
   paramType = "query"
), @ApiImplicitParam(
   name = "realname",
   value = "姓名",
   required = false,
   paramType = "query"
), @ApiImplicitParam(
   name = "gender",
   value = "性别",
   required = false,
   paramType = "query"
)})
   public Message addUserWidthRole(BaseUser baseUser, long roleId) {
      this.baseUserService.addUserWidthRole(baseUser, roleId);
      return MessageUtil.success("保存成功");
   }

   @ApiOperation("修改用户头像(wechat)")
   @PostMapping({"alterUserface1"})
   public Message alterUserface1(@RequestBody UserFaceReq userfaceReq) {
      this.baseUserService.alterUserface(userfaceReq.getId(), userfaceReq.getUserface());
      return MessageUtil.success("保存成功");
   }

   @ApiOperation("修改用户头像(sys)")
   @PostMapping({"alterUserface"})
   public Message alterUserface(long id, String userface) {
      this.baseUserService.alterUserface(id, userface);
      return MessageUtil.success("保存成功");
   }

   @ApiOperation("通过id删除")
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.baseUserService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("设置权限")
   @PostMapping({"setRoles"})
   public Message setRoles(UserRoleVM userRoleVM) {
      System.out.println(userRoleVM);
      this.baseUserService.setRoles(userRoleVM.getId(), userRoleVM.getRoles());
      return MessageUtil.success("设置成功");
   }
}
