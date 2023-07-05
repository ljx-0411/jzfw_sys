package com.jzfw.dao;

import com.jzfw.bean.Platform;
import com.jzfw.bean.PlatformExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PlatformMapper {
   long countByExample(PlatformExample example);

   int deleteByExample(PlatformExample example);

   int deleteByPrimaryKey(Long id);

   int insert(Platform record);

   int insertSelective(Platform record);

   List<Platform> selectByExample(PlatformExample example);

   Platform selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") Platform record, @Param("example") PlatformExample example);

   int updateByExample(@Param("record") Platform record, @Param("example") PlatformExample example);

   int updateByPrimaryKeySelective(Platform record);

   int updateByPrimaryKey(Platform record);
}
