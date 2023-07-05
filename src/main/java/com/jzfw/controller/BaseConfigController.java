package com.jzfw.controller;

import com.jzfw.bean.BaseConfig;
import com.jzfw.service.IBaseConfigService;
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
   description = "jzfw-系统配置模块相关接口"
)
@Validated
@RestController
@RequestMapping({"/baseConfig"})
public class BaseConfigController {
   @Autowired
   private IBaseConfigService baseConfigService;

   @ApiOperation("查询所有配置信息")
   @GetMapping({"/findAll"})
   public Message findAll() {
      List<BaseConfig> list = this.baseConfigService.findAll();
      return MessageUtil.success(list);
   }

   @ApiOperation("根据name查询配置信息")
   @ApiImplicitParams({@ApiImplicitParam(
   name = "name",
   value = "配置信息name值",
   paramType = "query",
   required = true
)})
   @GetMapping({"/findByKey"})
   public Message findByKey(@NotNull String name) {
      BaseConfig baseConfig = this.baseConfigService.findByKey(name);
      return MessageUtil.success(baseConfig);
   }

   @ApiOperation("通过id删除")
   @ApiImplicitParams({@ApiImplicitParam(
   name = "id",
   value = "主键",
   paramType = "query",
   required = true
)})
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.baseConfigService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(BaseConfig config) {
      this.baseConfigService.saveOrUpdate(config);
      return MessageUtil.success("更新成功");
   }
}
