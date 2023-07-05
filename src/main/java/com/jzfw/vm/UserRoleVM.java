package com.jzfw.vm;

import java.io.Serializable;
import java.util.List;

public class UserRoleVM implements Serializable {
   private static final long serialVersionUID = 1L;
   private Long id;
   private List<Long> roles;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public List<Long> getRoles() {
      return this.roles;
   }

   public void setRoles(List<Long> roles) {
      this.roles = roles;
   }
}
