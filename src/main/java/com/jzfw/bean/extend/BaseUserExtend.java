package com.jzfw.bean.extend;

import com.jzfw.bean.BaseRole;
import com.jzfw.bean.BaseUser;

import java.util.List;

public class BaseUserExtend extends BaseUser {
   private static final long serialVersionUID = 1L;
   public static final String STATUS_NORMAL = "正常";
   public static final String STATUS_FORBIDDEN = "禁用";
   private List<BaseRole> roles;

   public List<BaseRole> getRoles() {
      return this.roles;
   }

   public void setRoles(List<BaseRole> roles) {
      this.roles = roles;
   }
}
