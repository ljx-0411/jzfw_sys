package com.jzfw.bean;

import java.io.Serializable;

public class BaseRolePrivilege implements Serializable {
   private Long id;
   private Long roleId;
   private Long privilegeId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getRoleId() {
      return this.roleId;
   }

   public void setRoleId(Long roleId) {
      this.roleId = roleId;
   }

   public Long getPrivilegeId() {
      return this.privilegeId;
   }

   public void setPrivilegeId(Long privilegeId) {
      this.privilegeId = privilegeId;
   }
}
