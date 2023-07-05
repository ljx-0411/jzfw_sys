package com.jzfw.bean;

import java.io.Serializable;

public class Category implements Serializable {
   private Long id;
   private String name;
   private String description;
   private Integer no;
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

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description == null ? null : description.trim();
   }

   public Integer getNo() {
      return this.no;
   }

   public void setNo(Integer no) {
      this.no = no;
   }

   public Long getParentId() {
      return this.parentId;
   }

   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }
}
