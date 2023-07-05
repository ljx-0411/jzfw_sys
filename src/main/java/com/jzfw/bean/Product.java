package com.jzfw.bean;

import java.io.Serializable;

public class Product implements Serializable {
   private Long id;
   private String name;
   private String description;
   private Double price;
   private String status;
   private String photo;
   private Long productCategoryId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name == null ? null : name.trim();
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description == null ? null : description.trim();
   }

   public Double getPrice() {
      return this.price;
   }

   public void setPrice(Double price) {
      this.price = price;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status == null ? null : status.trim();
   }

   public String getPhoto() {
      return this.photo;
   }

   public void setPhoto(String photo) {
      this.photo = photo == null ? null : photo.trim();
   }

   public Long getProductCategoryId() {
      return this.productCategoryId;
   }

   public void setProductCategoryId(Long productCategoryId) {
      this.productCategoryId = productCategoryId;
   }
}
