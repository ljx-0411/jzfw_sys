package com.jzfw.bean.extend;

import com.jzfw.bean.OrderLine;
import com.jzfw.bean.Product;

public class OrderLineExtend extends OrderLine {
   private static final long serialVersionUID = 1L;
   private Product product;

   public Product getProduct() {
      return this.product;
   }

   public void setProduct(Product product) {
      this.product = product;
   }
}
