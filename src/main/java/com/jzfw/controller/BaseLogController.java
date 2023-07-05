package com.jzfw.controller;

import com.jzfw.bean.BaseLog;
import com.jzfw.service.IBaseLogService;
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
   description = "jzwf-日志相关接口"
)
@Validated
@RestController
@RequestMapping({"/baseLog"})
public class BaseLogController {
   @Autowired
   private IBaseLogService baseLogService;

   @ApiOperation("根据名称、类型分页查询物品类型信息")
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
)})
   public Message pageQuery(int page, int pageSize) {
      PageVM<BaseLog> pageVM = this.baseLogService.pageQuery(page, pageSize);
      return MessageUtil.success(pageVM);
   }

   @ApiOperation(
      value = "保存日志信息",
      notes = "模型中具有id属性为更新，否则为保存"
   )
   @PostMapping({"save"})
   public Message save(BaseLog log) {
      this.baseLogService.save(log);
      return MessageUtil.success("更新成功！");
   }
}
