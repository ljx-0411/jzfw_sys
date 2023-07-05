package com.jzfw.controller;

import com.jzfw.bean.BasePrivilege;
import com.jzfw.service.IBasePrivilegeService;
import com.jzfw.vm.PrivilegeTree;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-权限相关接口"
)
@Validated
@RestController
@RequestMapping({"/privilege"})
public class PrivilegeController {
   @Autowired
   private IBasePrivilegeService basePrivilegeService;

   @ApiOperation("查询所有")
   @GetMapping({"findAll"})
   public Message findAll() {
      List<BasePrivilege> list = this.basePrivilegeService.findAll();
      return MessageUtil.success(list);
   }

   @ApiOperation("根据ID删除")
   @DeleteMapping({"deleteById"})
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "编号",
   paramType = "query",
   required = true
)})
   public Message deleteById(long id) {
      this.basePrivilegeService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("通过parentId查询")
   @GetMapping({"findByParentId"})
   public Message findByParentId(Long id) {
      List<BasePrivilege> list = this.basePrivilegeService.findByParentId(id);
      return MessageUtil.success(list);
   }

   @ApiOperation("保存或更新")
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(BasePrivilege privilege) {
      this.basePrivilegeService.saveOrUpdate(privilege);
      return MessageUtil.success("更新成功");
   }

   @ApiOperation("查询树")
   @GetMapping({"findPrivilegeTree"})
   public Message findPrivilegeTree() {
      List<PrivilegeTree> list = this.basePrivilegeService.findPrivilegeTree();
      return MessageUtil.success(list);
   }
}
