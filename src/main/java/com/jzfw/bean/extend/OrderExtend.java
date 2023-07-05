package com.jzfw.bean.extend;

import com.jzfw.bean.Address;
import com.jzfw.bean.BaseUser;
import com.jzfw.bean.Order;
import com.jzfw.bean.OrderComment;

import java.util.List;

public class OrderExtend extends Order {
   private static final long serialVersionUID = 1L;
   public static final String STATUS_DAIZHIFU = "待支付";
   public static final String STATUS_DAIPAIDAN = "待派单";
   public static final String STATUS_DAIJIEDAN = "待接单";
   public static final String STATUS_DAIFWU = "待服务";
   public static final String STATUS_DAIQUEREN = "待确认";
   public static final String STATUS_COMPLETE = "已完成";
   private BaseUser customer;
   private BaseUser employee;
   private Address address;
   private List<OrderLineExtend> orderLines;
   private List<OrderComment> comments;

   public List<OrderComment> getComments() {
      return this.comments;
   }

   public void setComments(List<OrderComment> comments) {
      this.comments = comments;
   }

   public List<OrderLineExtend> getOrderLines() {
      return this.orderLines;
   }

   public void setOrderLines(List<OrderLineExtend> orderLines) {
      this.orderLines = orderLines;
   }

   public BaseUser getCustomer() {
      return this.customer;
   }

   public void setCustomer(BaseUser customer) {
      this.customer = customer;
   }

   public BaseUser getEmployee() {
      return this.employee;
   }

   public void setEmployee(BaseUser employee) {
      this.employee = employee;
   }

   public Address getAddress() {
      return this.address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }
}
