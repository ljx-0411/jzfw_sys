package com.jzfw.dao;

import com.jzfw.bean.BasePrivilege;
import com.jzfw.bean.BasePrivilegeExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BasePrivilegeMapper {
   long countByExample(BasePrivilegeExample example);

   int deleteByExample(BasePrivilegeExample example);

   int deleteByPrimaryKey(Long id);

   int insert(BasePrivilege record);

   int insertSelective(BasePrivilege record);

   List<BasePrivilege> selectByExample(BasePrivilegeExample example);

   BasePrivilege selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") BasePrivilege record, @Param("example") BasePrivilegeExample example);

   int updateByExample(@Param("record") BasePrivilege record, @Param("example") BasePrivilegeExample example);

   int updateByPrimaryKeySelective(BasePrivilege record);

   int updateByPrimaryKey(BasePrivilege record);
}
