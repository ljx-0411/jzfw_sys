package com.jzfw.service.impl;

import com.jzfw.bean.Carousel;
import com.jzfw.bean.CarouselExample;
import com.jzfw.dao.CarouselMapper;
import com.jzfw.service.ICarouselService;
import com.jacky.base.utils.CustomerException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarouselServiceImpl implements ICarouselService {
   @Autowired
   private CarouselMapper carouselMapper;

   public List<Carousel> findAll() {
      return this.carouselMapper.selectByExample(new CarouselExample());
   }

   public void saveOrUpdate(Carousel carousel) throws CustomerException {
      if (carousel.getId() != null) {
         this.carouselMapper.updateByPrimaryKey(carousel);
      } else {
         CarouselExample example = new CarouselExample();
         example.createCriteria().andNameEqualTo(carousel.getName());
         List<Carousel> list = this.carouselMapper.selectByExample(example);
         if (list.size() > 0) {
            throw new CustomerException("该轮播图已经存在");
         }
         carousel.setStatus("正常");
         this.carouselMapper.insert(carousel);
      }

   }

   @Transactional
   public void deleteById(long id) throws CustomerException {
      if (id < 4L) {
         throw new CustomerException("内置轮播图无法删除");
      } else {
         Carousel carousel = this.carouselMapper.selectByPrimaryKey(id);
         if (carousel == null) {
            throw new CustomerException("要删除的轮播图不存在");
         } else {
            this.carouselMapper.deleteByPrimaryKey(id);
         }
      }
   }

   public List<Carousel> query(String status) {
      CarouselExample example = new CarouselExample();
      if (status != null) {
         example.createCriteria().andStatusEqualTo(status);
      }

      List<Carousel> list = this.carouselMapper.selectByExample(example);
      return list;
   }
}
