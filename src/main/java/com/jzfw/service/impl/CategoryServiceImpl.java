package com.jzfw.service.impl;

import com.jzfw.bean.Category;
import com.jzfw.bean.CategoryExample;
import com.jzfw.dao.CategoryMapper;
import com.jzfw.service.ICategoryService;
import com.jacky.base.utils.CustomerException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryServiceImpl implements ICategoryService {
   @Autowired
   private CategoryMapper categoryMapper;

   public List<Category> findAll() {
      return this.categoryMapper.selectByExample(new CategoryExample());
   }

   public void saveOrUpdate(Category category) throws CustomerException {
      if (category.getId() != null) {
         this.categoryMapper.updateByPrimaryKey(category);
      } else {
         CategoryExample example = new CategoryExample();
         example.createCriteria().andNameEqualTo(category.getName());
         List<Category> list = this.categoryMapper.selectByExample(example);
         if (list.size() > 0) {
            throw new CustomerException("该栏目已经存在");
         }

         this.categoryMapper.insert(category);
      }

   }

   @Transactional
   public void deleteById(long id) throws CustomerException {
      if (id < 8L) {
         throw new CustomerException("内置栏目无法删除");
      } else {
         Category category = this.categoryMapper.selectByPrimaryKey(id);
         if (category == null) {
            throw new CustomerException("要删除的栏目不存在");
         } else {
            this.categoryMapper.deleteByPrimaryKey(id);
         }
      }
   }

   @Transactional
   public void batchDelete(long[] ids) throws CustomerException {
      long[] var2 = ids;
      int var3 = ids.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         long id = var2[var4];
         this.deleteById(id);
      }

   }
}
