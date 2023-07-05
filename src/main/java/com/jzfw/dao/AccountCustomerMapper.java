package com.jzfw.dao;

import com.jzfw.bean.AccountCustomer;
import com.jzfw.bean.AccountCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountCustomerMapper {
   long countByExample(AccountCustomerExample example);

   int deleteByExample(AccountCustomerExample example);

   int deleteByPrimaryKey(Long id);

   int insert(AccountCustomer record);

   int insertSelective(AccountCustomer record);

   List<AccountCustomer> selectByExample(AccountCustomerExample example);

   AccountCustomer selectByPrimaryKey(Long id);

   int updateByExampleSelective(@Param("record") AccountCustomer record, @Param("example") AccountCustomerExample example);

   int updateByExample(@Param("record") AccountCustomer record, @Param("example") AccountCustomerExample example);

   int updateByPrimaryKeySelective(AccountCustomer record);

   int updateByPrimaryKey(AccountCustomer record);
}
