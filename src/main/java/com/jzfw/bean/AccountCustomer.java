package com.jzfw.bean;

import java.io.Serializable;

public class AccountCustomer implements Serializable {
   private Long id;
   private Double transferMoney;
   private Long transferTime;
   private String description;
   private String type;
   private String status;
   private Long userId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Double getTransferMoney() {
      return this.transferMoney;
   }

   public void setTransferMoney(Double transferMoney) {
      this.transferMoney = transferMoney;
   }

   public Long getTransferTime() {
      return this.transferTime;
   }

   public void setTransferTime(Long transferTime) {
      this.transferTime = transferTime;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description == null ? null : description.trim();
   }

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type == null ? null : type.trim();
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status == null ? null : status.trim();
   }

   public Long getUserId() {
      return this.userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }
}
