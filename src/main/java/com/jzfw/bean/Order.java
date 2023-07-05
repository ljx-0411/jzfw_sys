package com.jzfw.bean;

import java.io.Serializable;

public class Order implements Serializable {
   private Long id;
   private Long orderTime;
   private Long serviceTime;
   private Double total;
   private String status;
   private String remark;
   private Long customerId;
   private Long addressId;
   private Long employeeId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getOrderTime() {
      return this.orderTime;
   }

   public void setOrderTime(Long orderTime) {
      this.orderTime = orderTime;
   }

   public Long getServiceTime() {
      return this.serviceTime;
   }

   public void setServiceTime(Long serviceTime) {
      this.serviceTime = serviceTime;
   }

   public Double getTotal() {
      return this.total;
   }

   public void setTotal(Double total) {
      this.total = total;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status == null ? null : status.trim();
   }

   public String getRemark() {
      return this.remark;
   }

   public void setRemark(String remark) {
      this.remark = remark == null ? null : remark.trim();
   }

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

   public Long getEmployeeId() {
      return this.employeeId;
   }

   public void setEmployeeId(Long employeeId) {
      this.employeeId = employeeId;
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Order{");
      sb.append("id=").append(id);
      sb.append(", orderTime=").append(orderTime);
      sb.append(", serviceTime=").append(serviceTime);
      sb.append(", total=").append(total);
      sb.append(", status='").append(status).append('\'');
      sb.append(", remark='").append(remark).append('\'');
      sb.append(", customerId=").append(customerId);
      sb.append(", addressId=").append(addressId);
      sb.append(", employeeId=").append(employeeId);
      sb.append('}');
      return sb.toString();
   }

//   public static void main(String[] args) {
//      System.out.println(System.currentTimeMillis());
//   }
}
