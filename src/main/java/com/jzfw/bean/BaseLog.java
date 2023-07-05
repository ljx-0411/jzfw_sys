package com.jzfw.bean;

import java.io.Serializable;

public class BaseLog implements Serializable {
   private Long id;
   private String realname;
   private String method;
   private String content;
   private Long logTime;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getRealname() {
      return this.realname;
   }

   public void setRealname(String realname) {
      this.realname = realname == null ? null : realname.trim();
   }

   public String getMethod() {
      return this.method;
   }

   public void setMethod(String method) {
      this.method = method == null ? null : method.trim();
   }

   public String getContent() {
      return this.content;
   }

   public void setContent(String content) {
      this.content = content == null ? null : content.trim();
   }

   public Long getLogTime() {
      return this.logTime;
   }

   public void setLogTime(Long logTime) {
      this.logTime = logTime;
   }
}
