package com.jzfw.bean.extend;

import com.jzfw.bean.BasePrivilege;
import com.jzfw.bean.BaseRole;

import java.util.List;

public class BaseRoleExtend extends BaseRole {
   private static final long serialVersionUID = 1L;
   private List<BasePrivilege> privileges;

   public List<BasePrivilege> getPrivileges() {
      return this.privileges;
   }

   public void setPrivileges(List<BasePrivilege> privileges) {
      this.privileges = privileges;
   }
}
