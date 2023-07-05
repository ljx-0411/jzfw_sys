package com.jzfw.dao.extend;

import com.jzfw.bean.BasePrivilege;
import com.jzfw.vm.PrivilegeTree;

import java.util.List;

public interface BasePrivilegeExtendMapper {
   List<PrivilegeTree> selectAll();

   List<BasePrivilege> selectByParentId(long id);

   List<BasePrivilege> selectByRoleId(long id);

   List<BasePrivilege> selectByUserId(long id);

   List<BasePrivilege> selectMenuByUserId(long id);
}
