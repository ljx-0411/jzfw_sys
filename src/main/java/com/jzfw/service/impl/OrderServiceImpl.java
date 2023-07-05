package com.jzfw.service.impl;

import com.jzfw.bean.BaseUser;
import com.jzfw.bean.Order;
import com.jzfw.bean.OrderLine;
import com.jzfw.bean.extend.OrderExtend;
import com.jzfw.dao.BaseUserMapper;
import com.jzfw.dao.OrderLineMapper;
import com.jzfw.dao.OrderMapper;
import com.jzfw.dao.extend.OrderExtendMapper;
import com.jzfw.service.IAccountService;
import com.jzfw.service.IOrderService;
import com.jzfw.vm.OrderAndOrderLineVM;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements IOrderService {
   @Autowired
   private OrderMapper orderMapper;
   @Autowired
   private OrderExtendMapper orderExtendMapper;
   @Autowired
   private OrderLineMapper orderLineMapper;
   @Autowired
   private BaseUserMapper baseUserMapper;
   @Autowired
   private IAccountService accountService;

   public PageVM<OrderExtend> pageQuery(int page, int pageSize, Long beginTime, Long endTime, String status, Long customerId, Long employeeId) {
      List<OrderExtend> list = this.orderExtendMapper.pageQuery(page, pageSize, beginTime, endTime, status, customerId, employeeId);
      long total = this.orderExtendMapper.count(beginTime, endTime, status, customerId, employeeId);
      return new PageVM(page, pageSize, total, list);
   }

   public void deleteById(long id) throws CustomerException {
      Order order = this.orderMapper.selectByPrimaryKey(id);
      if (order == null) {
         throw new CustomerException("要删除的产品不存在");
      } else {
         this.orderMapper.deleteByPrimaryKey(id);
      }
   }

   @Transactional
   public void submitOrder(OrderAndOrderLineVM order) throws CustomerException {
      if (order.getAddressId() == null) {
         throw new CustomerException("请填写地址!");
      }
      Order o = new Order();
      o.setStatus("待派单");
      o.setOrderTime((new Date()).getTime());
      o.setCustomerId(order.getCustomerId());
      o.setAddressId(order.getAddressId());
      o.setServiceTime(order.getServiceTime());
      List<OrderLine> list = order.getOrderLines();
      double total = 0.0D;

      Iterator var6;
      OrderLine ol;
      for(var6 = list.iterator(); var6.hasNext(); total += ol.getPrice() * (double)ol.getNumber()) {
         ol = (OrderLine)var6.next();
      }

      o.setTotal(total);
      this.accountService.consume(order.getCustomerId(), o.getTotal());
      this.orderMapper.insert(o);
      var6 = list.iterator();

      while(var6.hasNext()) {
         ol = (OrderLine)var6.next();
         ol.setOrderId(o.getId());
         this.orderLineMapper.insert(ol);
      }

   }

   public void sendOrder(long employeeId, long orderId) throws CustomerException {
      Order order = this.orderMapper.selectByPrimaryKey(orderId);
      BaseUser user = this.baseUserMapper.selectByPrimaryKey(employeeId);
      if (order == null) {
         throw new CustomerException("该订单不存在");
      } else if (user == null) {
         throw new CustomerException("该员工不存在");
      } else {
         order.setStatus("待接单");
         order.setEmployeeId(employeeId);
         this.orderMapper.updateByPrimaryKey(order);
      }
   }

   public void cancelSendOrder(long orderId) throws CustomerException {
      Order order = this.orderMapper.selectByPrimaryKey(orderId);
      if (order == null) {
         throw new CustomerException("该订单不存在");
      } else {
         order.setStatus("待派单");
         order.setEmployeeId((Long)null);
         this.orderMapper.updateByPrimaryKey(order);
      }
   }

   public void takeOrder(long orderId) throws CustomerException {
      this.changeOrderStatus(orderId, "待服务");
   }

   public void rejectOrder(long orderId) throws CustomerException {
      this.changeOrderStatus(orderId, "待派单");
   }

   public void serviceCompleted(long orderId) throws CustomerException {
      this.changeOrderStatus(orderId, "待确认");
   }

   @Transactional
   public void confirmOrder(long orderId) throws CustomerException {
      this.accountService.checkout(orderId);
      this.changeOrderStatus(orderId, "已完成");
   }

   private void changeOrderStatus(long orderId, String status) throws CustomerException {
      Order order = this.orderMapper.selectByPrimaryKey(orderId);
      if (order == null) {
         throw new CustomerException("该订单不存在");
      } else {
         order.setStatus(status);
         if (status.equals("待派单")) {
            order.setEmployeeId((Long)null);
         }

         this.orderMapper.updateByPrimaryKey(order);
      }
   }

   public OrderExtend findById(long id) {
      return this.orderExtendMapper.selectById(id);
   }
}
