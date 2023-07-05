package com.jzfw.service;

import com.jzfw.bean.Product;
import com.jzfw.bean.extend.ProductExtend;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;

public interface IProductService {
   PageVM<ProductExtend> pageQuery(int page, int pageSize, String name, String status, Long productCategoryId);

   void saveOrUpdate(Product product) throws CustomerException;

   void deleteById(long id) throws CustomerException;

   void changeStatus(long id, int flag) throws CustomerException;
}
