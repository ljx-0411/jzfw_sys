package com.jzfw.bean;

import java.io.Serializable;

public class ProductCategory implements Serializable {
   private Long id;
   private String name;
   private String icon;
   private Integer num;
   private Long parentId;
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

   public String getIcon() {
      return this.icon;
   }

   public void setIcon(String icon) {
      this.icon = icon == null ? null : icon.trim();
   }

   public Integer getNum() {
      return this.num;
   }

   public void setNum(Integer num) {
      this.num = num;
   }

   public Long getParentId() {
      return this.parentId;
   }

   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }
}
