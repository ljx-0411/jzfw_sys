package com.jzfw.bean;

import java.io.Serializable;

public class AccountApply implements Serializable {
   private Long id;
   private Double money;
   private String applyType;
   private Long applyTime;
   private String status;
   private Long userId;
   private String reason;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Double getMoney() {
      return this.money;
   }

   public void setMoney(Double money) {
      this.money = money;
   }

   public String getApplyType() {
      return this.applyType;
   }

   public void setApplyType(String applyType) {
      this.applyType = applyType == null ? null : applyType.trim();
   }

   public Long getApplyTime() {
      return this.applyTime;
   }

   public void setApplyTime(Long applyTime) {
      this.applyTime = applyTime;
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

   public String getReason() {
      return this.reason;
   }

   public void setReason(String reason) {
      this.reason = reason == null ? null : reason.trim();
   }
}
