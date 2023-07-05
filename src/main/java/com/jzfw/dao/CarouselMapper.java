package com.jzfw.dao;

import com.jzfw.bean.Carousel;
import com.jzfw.bean.CarouselExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CarouselMapper {
   long countByExample(CarouselExample example);

   int deleteByExample(CarouselExample example);

   int deleteByPrimaryKey(Long id);

   int insert(Carousel record);

   int insertSelective(Carousel record);

   List<Carousel> selectByExample(CarouselExample example);

   Carousel selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") Carousel record, @Param("example") CarouselExample example);

   int updateByExample(@Param("record") Carousel record, @Param("example") CarouselExample example);

   int updateByPrimaryKeySelective(Carousel record);

   int updateByPrimaryKey(Carousel record);
}
