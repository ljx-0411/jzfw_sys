package com.jzfw.controller;

import com.jzfw.bean.BaseUser;
import com.jzfw.bean.extend.BaseUserExtend;
import com.jzfw.service.IBaseUserService;
import com.jzfw.vm.UserVM;
import com.jacky.base.utils.JwtTokenUtil;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-用户登录相关接口"
)
@Validated
@RestController
@RequestMapping({"/user"})
public class UserController {
   @Autowired
   private IBaseUserService baseUserService;

   @PostMapping({"login"})
   public Message login(@RequestBody UserVM userVM) {
      BaseUser user = this.baseUserService.login(userVM);
      String token = JwtTokenUtil.createJWT(user.getId(), user.getUsername());
      Map<String, String> map = new HashMap();
      map.put("token", token);
      return MessageUtil.success(map);
   }

   @ApiOperation("通过token获取用户的基本信息")
   @GetMapping({"info"})
   public Message info(String token) {
      long id = Long.parseLong(JwtTokenUtil.getUserId(token, "MDk4ZjZiY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2I0ZjY="));
      BaseUserExtend baseUserExtend = this.baseUserService.findById(id);
      return MessageUtil.success(baseUserExtend);
   }

   @PostMapping({"logout"})
   public Message logout() {
      return MessageUtil.success("退出成功");
   }

   @ApiOperation("顾客注册")
   @PostMapping({"register"})
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
   public Message register(@RequestBody BaseUser user) {
      this.baseUserService.register(user, 6L);
      return MessageUtil.success("注册成功,请登录");
   }

   @ApiOperation("员工注册")
   @PostMapping({"registerEmployee"})
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
   public Message registerEmployee(BaseUser user) {
      this.baseUserService.register(user, 1L);
      return MessageUtil.success("注册成功,请登录");
   }
}
