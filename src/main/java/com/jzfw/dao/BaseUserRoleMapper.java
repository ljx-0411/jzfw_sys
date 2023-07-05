package com.jzfw.dao;

import com.jzfw.bean.BaseUserRole;
import com.jzfw.bean.BaseUserRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseUserRoleMapper {
   long countByExample(BaseUserRoleExample example);

   int deleteByExample(BaseUserRoleExample example);

   int deleteByPrimaryKey(Long id);

   int insert(BaseUserRole record);

   int insertSelective(BaseUserRole record);

   List<BaseUserRole> selectByExample(BaseUserRoleExample example);

   BaseUserRole selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") BaseUserRole record, @Param("example") BaseUserRoleExample example);

   int updateByExample(@Param("record") BaseUserRole record, @Param("example") BaseUserRoleExample example);

   int updateByPrimaryKeySelective(BaseUserRole record);

   int updateByPrimaryKey(BaseUserRole record);
}
