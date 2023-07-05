package com.jzfw.vm;

import com.jzfw.bean.BasePrivilege;
import java.util.List;

public class PrivilegeTree extends BasePrivilege {
   private static final long serialVersionUID = 1L;
   private List<BasePrivilege> children;

   public List<BasePrivilege> getChildren() {
      return this.children;
   }

   public void setChildren(List<BasePrivilege> children) {
      this.children = children;
   }
}
