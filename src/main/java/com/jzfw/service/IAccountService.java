package com.jzfw.service;

import com.jzfw.bean.AccountCustomer;
import com.jzfw.bean.AccountEmployee;
import com.jzfw.bean.AccountSystem;
import com.jacky.base.utils.PageVM;

public interface IAccountService {
   void recharge(long customerId, double money);

   void consume(long customerId, double money);

   void checkout(long orderId);

   void withdraw(long employeeId, double money);

   PageVM<AccountCustomer> pageQueryCustomerAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime, Long userId);

   PageVM<AccountEmployee> pageQueryEmployeeAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime, Long userId);

   PageVM<AccountSystem> pageQuerySystemAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime);
}
