package com.jzfw.dao;

import com.jzfw.bean.BaseConfig;
import com.jzfw.bean.BaseConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseConfigMapper {
   long countByExample(BaseConfigExample example);

   int deleteByExample(BaseConfigExample example);

   int deleteByPrimaryKey(Long id);

   int insert(BaseConfig record);

   int insertSelective(BaseConfig record);

   List<BaseConfig> selectByExample(BaseConfigExample example);

   BaseConfig selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") BaseConfig record, @Param("example") BaseConfigExample example);

   int updateByExample(@Param("record") BaseConfig record, @Param("example") BaseConfigExample example);

   int updateByPrimaryKeySelective(BaseConfig record);

   int updateByPrimaryKey(BaseConfig record);
}
