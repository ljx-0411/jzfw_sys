package com.jzfw.service.impl;

import com.jzfw.bean.Product;
import com.jzfw.bean.extend.ProductExtend;
import com.jzfw.dao.ProductMapper;
import com.jzfw.dao.extend.ProductExtendMapper;
import com.jzfw.service.IProductService;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {
   @Autowired
   private ProductMapper productMapper;
   @Autowired
   private ProductExtendMapper productExtendMapper;

   public PageVM<ProductExtend> pageQuery(int page, int pageSize, String name, String status, Long productCategoryId) {
      List<ProductExtend> list = this.productExtendMapper.pageQuery(page, pageSize, name, status, productCategoryId);
      long total = this.productExtendMapper.count(name, status, productCategoryId);
      return new PageVM(page, pageSize, total, list);
   }

   public void saveOrUpdate(Product product) throws CustomerException {
      if (product.getId() != null) {
         this.productMapper.updateByPrimaryKey(product);
      } else {
         product.setStatus("正常");
         this.productMapper.insert(product);
      }

   }

   public void deleteById(long id) throws CustomerException {
      Product product = this.productMapper.selectByPrimaryKey(id);
      if (product == null) {
         throw new CustomerException("要删除的产品不存在");
      } else {
         this.productMapper.deleteByPrimaryKey(id);
      }
   }

   public void changeStatus(long id, int flag) throws CustomerException {
      Product product = this.productMapper.selectByPrimaryKey(id);
      if (product == null) {
         throw new CustomerException("要操作的产品不存在");
      } else {
         switch(flag) {
         case 0:
            product.setStatus("下架");
            break;
         case 1:
            product.setStatus("正常");
         }

         this.productMapper.updateByPrimaryKey(product);
      }
   }
}
