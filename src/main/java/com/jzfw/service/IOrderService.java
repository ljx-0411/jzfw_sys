package com.jzfw.service;

import com.jzfw.bean.extend.OrderExtend;
import com.jzfw.vm.OrderAndOrderLineVM;
import com.jacky.base.utils.CustomerException;
import com.jacky.base.utils.PageVM;

public interface IOrderService {
   PageVM<OrderExtend> pageQuery(int page, int pageSize, Long beginTime, Long endTime, String status, Long customerId, Long employeeId);

   void deleteById(long id) throws CustomerException;

   void submitOrder(OrderAndOrderLineVM order) throws CustomerException;

   void sendOrder(long employeeId, long orderId) throws CustomerException;

   void cancelSendOrder(long orderId) throws CustomerException;

   void takeOrder(long orderId) throws CustomerException;

   void rejectOrder(long orderId) throws CustomerException;

   void serviceCompleted(long orderId) throws CustomerException;

   void confirmOrder(long orderId) throws CustomerException;

   OrderExtend findById(long id);
}
