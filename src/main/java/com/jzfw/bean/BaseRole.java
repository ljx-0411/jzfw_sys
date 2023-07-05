package com.jzfw.bean;

import java.io.Serializable;

public class BaseRole implements Serializable {
   private Long id;
   private String name;
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
}
