package com.jzfw.dao;

import com.jzfw.bean.BaseRolePrivilege;
import com.jzfw.bean.BaseRolePrivilegeExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseRolePrivilegeMapper {
   long countByExample(BaseRolePrivilegeExample example);

   int deleteByExample(BaseRolePrivilegeExample example);

   int deleteByPrimaryKey(Long id);

   int insert(BaseRolePrivilege record);

   int insertSelective(BaseRolePrivilege record);

   List<BaseRolePrivilege> selectByExample(BaseRolePrivilegeExample example);

   BaseRolePrivilege selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") BaseRolePrivilege record, @Param("example") BaseRolePrivilegeExample example);

   int updateByExample(@Param("record") BaseRolePrivilege record, @Param("example") BaseRolePrivilegeExample example);

   int updateByPrimaryKeySelective(BaseRolePrivilege record);

   int updateByPrimaryKey(BaseRolePrivilege record);
}
