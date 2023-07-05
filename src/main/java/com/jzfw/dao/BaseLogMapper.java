package com.jzfw.dao;

import com.jzfw.bean.BaseLog;
import com.jzfw.bean.BaseLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseLogMapper {
   long countByExample(BaseLogExample example);

   int deleteByExample(BaseLogExample example);

   int deleteByPrimaryKey(Long id);

   int insert(BaseLog record);

   int insertSelective(BaseLog record);

   List<BaseLog> selectByExample(BaseLogExample example);

   BaseLog selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") BaseLog record, @Param("example") BaseLogExample example);

   int updateByExample(@Param("record") BaseLog record, @Param("example") BaseLogExample example);

   int updateByPrimaryKeySelective(BaseLog record);

   int updateByPrimaryKey(BaseLog record);
}
