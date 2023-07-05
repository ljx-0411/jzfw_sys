package com.jzfw.bean;

import java.io.Serializable;

public class CertificationApply implements Serializable {
   private Long id;
   private String realname;
   private String idCard;
   private String idcardPhotoPositive;
   private String idcardPhotoNegative;
   private String bankCard;
   private String bankCardPhoto;
   private String status;
   private Long applyTime;
   private String reason;
   private Long userId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getRealname() {
      return this.realname;
   }

   public void setRealname(String realname) {
      this.realname = realname == null ? null : realname.trim();
   }

   public String getIdCard() {
      return this.idCard;
   }

   public void setIdCard(String idCard) {
      this.idCard = idCard == null ? null : idCard.trim();
   }

   public String getIdcardPhotoPositive() {
      return this.idcardPhotoPositive;
   }

   public void setIdcardPhotoPositive(String idcardPhotoPositive) {
      this.idcardPhotoPositive = idcardPhotoPositive == null ? null : idcardPhotoPositive.trim();
   }

   public String getIdcardPhotoNegative() {
      return this.idcardPhotoNegative;
   }

   public void setIdcardPhotoNegative(String idcardPhotoNegative) {
      this.idcardPhotoNegative = idcardPhotoNegative == null ? null : idcardPhotoNegative.trim();
   }

   public String getBankCard() {
      return this.bankCard;
   }

   public void setBankCard(String bankCard) {
      this.bankCard = bankCard == null ? null : bankCard.trim();
   }

   public String getBankCardPhoto() {
      return this.bankCardPhoto;
   }

   public void setBankCardPhoto(String bankCardPhoto) {
      this.bankCardPhoto = bankCardPhoto == null ? null : bankCardPhoto.trim();
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status == null ? null : status.trim();
   }

   public Long getApplyTime() {
      return this.applyTime;
   }

   public void setApplyTime(Long applyTime) {
      this.applyTime = applyTime;
   }

   public String getReason() {
      return this.reason;
   }

   public void setReason(String reason) {
      this.reason = reason == null ? null : reason.trim();
   }

   public Long getUserId() {
      return this.userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }
}
