package com.jzfw.dao;

import com.jzfw.bean.Address;
import com.jzfw.bean.AddressExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AddressMapper {
   long countByExample(AddressExample example);

   int deleteByExample(AddressExample example);

   int deleteByPrimaryKey(Long id);

   int insert(Address record);

   int insertSelective(Address record);

   List<Address> selectByExample(AddressExample example);

   Address selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

   int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

   int updateByPrimaryKeySelective(Address record);

   int updateByPrimaryKey(Address record);
}
