package com.jzfw.service.impl;

import com.jzfw.bean.ProductCategory;
import com.jzfw.dao.ProductCategoryMapper;
import com.jzfw.dao.extend.ProductCategoryExtendMapper;
import com.jzfw.service.IProductCategoryService;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl implements IProductCategoryService {
   @Autowired
   private ProductCategoryMapper productCategoryMapper;
   @Autowired
   private ProductCategoryExtendMapper productCategoryExtendMapper;

   public PageVM<ProductCategory> pageQuery(int page, int pageSize, String name) {
      List<ProductCategory> list = this.productCategoryExtendMapper.pageQuery(page, pageSize, name);
      long total = this.productCategoryExtendMapper.count(name);
      return new PageVM(page, pageSize, total, list);
   }

   public void saveOrUpdate(ProductCategory category) throws CustomerException {
      if (category.getId() != null) {
         this.productCategoryMapper.updateByPrimaryKey(category);
      } else {
         this.productCategoryMapper.insert(category);
      }

   }

   public void deleteById(long id) throws CustomerException {
      ProductCategory category = this.productCategoryMapper.selectByPrimaryKey(id);
      if (category == null) {
         throw new CustomerException("要删除的产品不存在");
      } else {
         this.productCategoryMapper.deleteByPrimaryKey(id);
      }
   }
}
