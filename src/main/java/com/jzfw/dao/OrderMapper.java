package com.jzfw.dao;

import com.jzfw.bean.Order;
import com.jzfw.bean.OrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
   long countByExample(OrderExample example);

   int deleteByExample(OrderExample example);

   int deleteByPrimaryKey(Long id);

   int insert(Order record);

   int insertSelective(Order record);

   List<Order> selectByExample(OrderExample example);

   Order selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

   int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

   int updateByPrimaryKeySelective(Order record);

   int updateByPrimaryKey(Order record);
}
