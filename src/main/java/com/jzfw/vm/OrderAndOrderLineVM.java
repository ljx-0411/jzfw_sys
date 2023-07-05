package com.jzfw.vm;

import com.jzfw.bean.OrderLine;
import io.swagger.annotations.ApiParam;
import java.util.List;

public class OrderAndOrderLineVM {
   @ApiParam(
      value = "顾客ID",
      required = true
   )
   private Long customerId;
   @ApiParam(
      value = "预约服务时间",
      required = true
   )
   private Long serviceTime;
   @ApiParam(
      value = "服务地址ID",
      required = true
   )
   private Long addressId;
   @ApiParam(
      value = "订单项",
      required = true
   )
   private List<OrderLine> orderLines;

   public Long getCustomerId() {
      return this.customerId;
   }

   public void setCustomerId(Long customerId) {
      this.customerId = customerId;
   }

   public Long getAddressId() {
      return this.addressId;
   }

   public void setAddressId(Long addressId) {
      this.addressId = addressId;
   }

   public Long getServiceTime() {
      return this.serviceTime;
   }

   public void setServiceTime(Long serviceTime) {
      this.serviceTime = serviceTime;
   }

   public List<OrderLine> getOrderLines() {
      return this.orderLines;
   }

   public void setOrderLines(List<OrderLine> orderLines) {
      this.orderLines = orderLines;
   }
}
