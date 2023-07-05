package com.jzfw.dao;

import com.jzfw.bean.AccountApply;
import com.jzfw.bean.AccountApplyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface AccountApplyMapper {
   long countByExample(AccountApplyExample example);

   int deleteByExample(AccountApplyExample example);

   int deleteByPrimaryKey(Long id);

   int insert(AccountApply record);

   int insertSelective(AccountApply record);

   List<AccountApply> selectByExample(AccountApplyExample example);

   AccountApply selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") AccountApply record, @Param("example") AccountApplyExample example);

   int updateByExample(@Param("record") AccountApply record, @Param("example") AccountApplyExample example);

   int updateByPrimaryKeySelective(AccountApply record);

   int updateByPrimaryKey(AccountApply record);
}
