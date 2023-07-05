package com.jzfw.bean;

import java.io.Serializable;

public class BaseUserRole implements Serializable {
   private Long id;
   private Long userId;
   private Long roleId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getUserId() {
      return this.userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }

   public Long getRoleId() {
      return this.roleId;
   }

   public void setRoleId(Long roleId) {
      this.roleId = roleId;
   }
}
