package com.jzfw.controller;

import com.jzfw.bean.Carousel;
import com.jzfw.service.ICarouselService;
import com.jacky.base.utils.Message;
import com.jacky.base.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(
   description = "jzfw-小程序轮播图相关接口"
)
@Validated
@RestController
@RequestMapping({"/carousel"})
public class CarouselController {
   @Autowired
   private ICarouselService carouselService;

   @ApiOperation("查询所有轮播图")
   @GetMapping({"findAll"})
   public Message findAll() {
      List<Carousel> list = this.carouselService.findAll();
      return MessageUtil.success(list);
   }

   @ApiOperation("查询所有轮播图")
   @GetMapping({"query"})
   public Message query(String status) {
      List<Carousel> list = this.carouselService.query(status);
      return MessageUtil.success(list);
   }

   @ApiOperation("通过id删除")
   @GetMapping({"deleteById"})
   public Message deleteById(long id) {
      this.carouselService.deleteById(id);
      return MessageUtil.success("删除成功");
   }

   @ApiOperation("保存或更新")
   @PostMapping({"saveOrUpdate"})
   public Message saveOrUpdate(Carousel carousel) {
      this.carouselService.saveOrUpdate(carousel);
      return MessageUtil.success("更新成功");
   }
}
