package com.jzfw.dao;

import com.jzfw.bean.BaseUser;
import com.jzfw.bean.BaseUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseUserMapper {
   long countByExample(BaseUserExample example);

   int deleteByExample(BaseUserExample example);

   int deleteByPrimaryKey(Long id);

   int insert(BaseUser record);

   int insertSelective(BaseUser record);

   List<BaseUser> selectByExample(BaseUserExample example);

   BaseUser selectByPrimaryKey(long id);

   int updateByExampleSelective(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

   int updateByExample(@Param("record") BaseUser record, @Param("example") BaseUserExample example);

   int updateByPrimaryKeySelective(BaseUser record);

   int updateByPrimaryKey(BaseUser record);
}
