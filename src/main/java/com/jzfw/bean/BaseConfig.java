package com.jzfw.bean;

import java.io.Serializable;

public class BaseConfig implements Serializable {
   private Long id;
   private String name;
   private String val;
   private String introduce;
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

   public String getVal() {
      return this.val;
   }

   public void setVal(String val) {
      this.val = val == null ? null : val.trim();
   }

   public String getIntroduce() {
      return this.introduce;
   }

   public void setIntroduce(String introduce) {
      this.introduce = introduce == null ? null : introduce.trim();
   }
}
