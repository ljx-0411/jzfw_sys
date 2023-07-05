package com.jzfw.dao;

import com.jzfw.bean.BaseFile;
import com.jzfw.bean.BaseFileExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseFileMapper {
   long countByExample(BaseFileExample example);

   int deleteByExample(BaseFileExample example);

   int deleteByPrimaryKey(String id);

   int insert(BaseFile record);

   int insertSelective(BaseFile record);

   List<BaseFile> selectByExample(BaseFileExample example);

   BaseFile selectByPrimaryKey(String id);

   int updateByExampleSelective(@Param("record") BaseFile record, @Param("example") BaseFileExample example);

   int updateByExample(@Param("record") BaseFile record, @Param("example") BaseFileExample example);

   int updateByPrimaryKeySelective(BaseFile record);

   int updateByPrimaryKey(BaseFile record);
}
