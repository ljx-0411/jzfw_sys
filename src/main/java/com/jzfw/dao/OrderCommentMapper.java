package com.jzfw.dao;

import com.jzfw.bean.OrderComment;
import com.jzfw.bean.OrderCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface OrderCommentMapper {
   long countByExample(OrderCommentExample example);

   int deleteByExample(OrderCommentExample example);

   int deleteByPrimaryKey(Long id);

   int insert(OrderComment record);

   int insertSelective(OrderComment record);

   List<OrderComment> selectByExample(OrderCommentExample example);

   OrderComment selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

   int updateByExample(@Param("record") OrderComment record, @Param("example") OrderCommentExample example);

   int updateByPrimaryKeySelective(OrderComment record);

   int updateByPrimaryKey(OrderComment record);
}
