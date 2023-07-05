package com.jzfw.service;

import com.jzfw.bean.Carousel;
import com.jacky.base.utils.CustomerException;
import java.util.List;

public interface ICarouselService {
   List<Carousel> findAll();

   void saveOrUpdate(Carousel carousel) throws CustomerException;

   void deleteById(long id) throws CustomerException;

   List<Carousel> query(String status);
}
