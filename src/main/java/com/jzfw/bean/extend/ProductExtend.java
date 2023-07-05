package com.jzfw.bean.extend;

import com.jzfw.bean.Product;
import com.jzfw.bean.ProductCategory;

public class ProductExtend extends Product {
   public static final String STATUS_NORMAL = "正常";
   public static final String STATUS_OFFLINE = "下架";
   private static final long serialVersionUID = 1L;
   private ProductCategory category;

   public ProductCategory getCategory() {
      return this.category;
   }

   public void setCategory(ProductCategory category) {
      this.category = category;
   }
}
