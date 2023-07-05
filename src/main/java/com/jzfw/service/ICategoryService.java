package com.jzfw.service;

import com.jzfw.bean.Category;
import com.jacky.base.utils.CustomerException;
import java.util.List;

public interface ICategoryService {
   List<Category> findAll();

   void saveOrUpdate(Category category) throws CustomerException;

   void deleteById(long id) throws CustomerException;

   void batchDelete(long[] ids) throws CustomerException;
}
