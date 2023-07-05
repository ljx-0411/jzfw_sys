package com.jzfw.bean;

import java.io.Serializable;

public class Carousel implements Serializable {
   private Long id;
   private String name;
   private String introduce;
   // 对应的是上传的id
   private String url;
   private String status;
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

   public String getIntroduce() {
      return this.introduce;
   }

   public void setIntroduce(String introduce) {
      this.introduce = introduce == null ? null : introduce.trim();
   }

   public String getUrl() {
      return this.url;
   }

   public void setUrl(String url) {
      this.url = url == null ? null : url.trim();
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status == null ? null : status.trim();
   }
}
