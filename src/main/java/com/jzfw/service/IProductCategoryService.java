package com.jzfw.service;

import com.jzfw.bean.ProductCategory;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;

public interface IProductCategoryService {
   PageVM<ProductCategory> pageQuery(int page, int pageSize, String name);

   void saveOrUpdate(ProductCategory category) throws CustomerException;

   void deleteById(long id) throws CustomerException;
}
