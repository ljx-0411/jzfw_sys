package com.jzfw.service.impl;

import com.jzfw.bean.AccountCustomer;
import com.jzfw.bean.AccountEmployee;
import com.jzfw.bean.AccountSystem;
import com.jzfw.bean.BaseUser;
import com.jzfw.bean.Order;
import com.jzfw.bean.Platform;
import com.jzfw.dao.AccountCustomerMapper;
import com.jzfw.dao.AccountEmployeeMapper;
import com.jzfw.dao.AccountSystemMapper;
import com.jzfw.dao.BaseUserMapper;
import com.jzfw.dao.OrderMapper;
import com.jzfw.dao.PlatformMapper;
import com.jzfw.dao.extend.AccountCustomerExtendMapper;
import com.jzfw.dao.extend.AccountEmployeeExtendMapper;
import com.jzfw.dao.extend.AccountSystemExtendMapper;
import com.jzfw.service.IAccountService;
import com.jzfw.utils.BigDecimalUtil;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements IAccountService {
   @Autowired
   private AccountCustomerMapper accountCustomerMapper;
   @Autowired
   private AccountEmployeeMapper accountEmployeeMapper;
   @Autowired
   private AccountSystemMapper accountSystemMapper;
   @Autowired
   private AccountCustomerExtendMapper accountCustomerExtendMapper;
   @Autowired
   private AccountEmployeeExtendMapper accountEmployeeExtendMapper;
   @Autowired
   private AccountSystemExtendMapper accountSystemExtendMapper;
   @Autowired
   private BaseUserMapper baseUserMapper;
   @Autowired
   private OrderMapper orderMapper;
   @Autowired
   private PlatformMapper platformMapper;

   @Transactional
   public void recharge(long customerId, double money) {
      if (money > 1000.0D) {
         throw new CustomerException("一次最多只能充值1000元！");
      } else {
         AccountCustomer accountCustomer = new AccountCustomer();
         accountCustomer.setType("充值");
         accountCustomer.setStatus("正常");
         accountCustomer.setTransferTime((new Date()).getTime());
         accountCustomer.setUserId(customerId);
         accountCustomer.setTransferMoney(money);
         this.accountCustomerMapper.insert(accountCustomer);
         BaseUser user = this.baseUserMapper.selectByPrimaryKey(customerId);
         user.setBalance(BigDecimalUtil.add(user.getBalance(), money).doubleValue());
         this.baseUserMapper.updateByPrimaryKey(user);
      }
   }

   @Transactional
   public void consume(long customerId, double money) {
      BaseUser user = this.baseUserMapper.selectByPrimaryKey(customerId);
      if (user.getBalance() < money) {
         throw new CustomerException("余额不足!");
      } else {
         user.setBalance(BigDecimalUtil.sub(user.getBalance(), money).doubleValue());
         this.baseUserMapper.updateByPrimaryKey(user);
         AccountCustomer accountCustomer = new AccountCustomer();
         accountCustomer.setStatus("正常");
         accountCustomer.setType("消费");
         accountCustomer.setTransferTime((new Date()).getTime());
         accountCustomer.setUserId(customerId);
         accountCustomer.setTransferMoney(money);
         this.accountCustomerMapper.insert(accountCustomer);
      }
   }

   @Transactional
   public void checkout(long orderId) {
      Order order = this.orderMapper.selectByPrimaryKey(orderId);
      Long employeeId = order.getEmployeeId();
      if (employeeId == null) {
         throw new CustomerException("订单异常，请联系管理员！订单编号" + orderId);
      } else {
         BaseUser employee = this.baseUserMapper.selectByPrimaryKey(employeeId);
         AccountEmployee accountEmployee = new AccountEmployee();
         accountEmployee.setStatus("正常");
         accountEmployee.setType("收益");
         accountEmployee.setTransferTime((new Date()).getTime());
         accountEmployee.setUserId(employeeId);
         accountEmployee.setTransferMoney(BigDecimalUtil.mul(order.getTotal(), 0.8D).doubleValue());
         this.accountEmployeeMapper.insert(accountEmployee);
         employee.setBalance(BigDecimalUtil.add(employee.getBalance(), accountEmployee.getTransferMoney()).doubleValue());
         this.baseUserMapper.updateByPrimaryKey(employee);
         AccountSystem accountSystem = new AccountSystem();
         accountSystem.setStatus("正常");
         accountSystem.setType("收益");
         accountSystem.setTransferTime((new Date()).getTime());
         accountSystem.setTransferMoney(BigDecimalUtil.sub(order.getTotal(), accountEmployee.getTransferMoney()).doubleValue());
         this.accountSystemMapper.insert(accountSystem);
         Platform platform = this.platformMapper.selectByPrimaryKey(1L);
         platform.setBalance(BigDecimalUtil.sub(platform.getBalance(), accountSystem.getTransferMoney()).doubleValue());
         this.platformMapper.updateByPrimaryKey(platform);
      }
   }

   public void withdraw(long employeeId, double money) {
      BaseUser employee = this.baseUserMapper.selectByPrimaryKey(employeeId);
      if (employee.getBalance() < money) {
         throw new CustomerException("余额不足!");
      } else {
         AccountEmployee accountEmployee = new AccountEmployee();
         accountEmployee.setStatus("正常");
         accountEmployee.setType("提现");
         accountEmployee.setTransferTime((new Date()).getTime());
         accountEmployee.setUserId(employeeId);
         accountEmployee.setTransferMoney(money);
         this.accountEmployeeMapper.insert(accountEmployee);
         employee.setBalance(BigDecimalUtil.sub(employee.getBalance(), accountEmployee.getTransferMoney()).doubleValue());
         this.baseUserMapper.updateByPrimaryKey(employee);
      }
   }

   public PageVM<AccountCustomer> pageQueryCustomerAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime, Long userId) {
      List<AccountCustomer> list = this.accountCustomerExtendMapper.pageQuery(page, pageSize, status, type, beginTime, endTime, userId);
      long total = this.accountCustomerExtendMapper.count(status, type, beginTime, endTime, userId);
      return new PageVM(page, pageSize, total, list);
   }

   public PageVM<AccountEmployee> pageQueryEmployeeAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime, Long userId) {
      List<AccountEmployee> list = this.accountEmployeeExtendMapper.pageQuery(page, pageSize, status, type, beginTime, endTime, userId);
      long total = this.accountEmployeeExtendMapper.count(status, type, beginTime, endTime, userId);
      return new PageVM(page, pageSize, total, list);
   }

   public PageVM<AccountSystem> pageQuerySystemAccount(int page, int pageSize, String status, String type, Long beginTime, Long endTime) {
      List<AccountSystem> list = this.accountSystemExtendMapper.pageQuery(page, pageSize, status, type, beginTime, endTime);
      long total = this.accountSystemExtendMapper.count(status, type, beginTime, endTime);
      return new PageVM(page, pageSize, total, list);
   }
}
