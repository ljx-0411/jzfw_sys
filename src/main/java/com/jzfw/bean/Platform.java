package com.jzfw.bean;

import java.io.Serializable;

public class Platform implements Serializable {
   private Long id;
   private Double balance;
   private String bankCard;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Double getBalance() {
      return this.balance;
   }

   public void setBalance(Double balance) {
      this.balance = balance;
   }

   public String getBankCard() {
      return this.bankCard;
   }

   public void setBankCard(String bankCard) {
      this.bankCard = bankCard == null ? null : bankCard.trim();
   }
}
