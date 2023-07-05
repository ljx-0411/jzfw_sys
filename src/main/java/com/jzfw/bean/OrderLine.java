package com.jzfw.bean;

import java.io.Serializable;

public class OrderLine implements Serializable {
   private Long id;
   private Integer number;
   private Double price;
   private Long productId;
   private Long orderId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Integer getNumber() {
      return this.number;
   }

   public void setNumber(Integer number) {
      this.number = number;
   }

   public Double getPrice() {
      return this.price;
   }

   public void setPrice(Double price) {
      this.price = price;
   }

   public Long getProductId() {
      return this.productId;
   }

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }
}
