package com.jzfw.bean;

import java.io.Serializable;

public class BaseUser implements Serializable {
   private Long id;
   private String username;
   private String password;
   private String telephone;
   private String realname;
   private String gender;
   private Long birth;
   private String email;
   private String status;
   private String userFace;
   private Long registerTime;
   private String nation;
   private String idCard;
   private String idcardPhotoPositive;
   private String idcardPhotoNegative;
   private String bankCard;
   private String bankCardPhoto;
   private Double balance;
   private String certificationStatus;
   private Long certificationTime;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUsername() {
      return this.username;
   }

   public void setUsername(String username) {
      this.username = username == null ? null : username.trim();
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password == null ? null : password.trim();
   }

   public String getTelephone() {
      return this.telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone == null ? null : telephone.trim();
   }

   public String getRealname() {
      return this.realname;
   }

   public void setRealname(String realname) {
      this.realname = realname == null ? null : realname.trim();
   }

   public String getGender() {
      return this.gender;
   }

   public void setGender(String gender) {
      this.gender = gender == null ? null : gender.trim();
   }

   public Long getBirth() {
      return this.birth;
   }

   public void setBirth(Long birth) {
      this.birth = birth;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email == null ? null : email.trim();
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status == null ? null : status.trim();
   }

   public String getUserFace() {
      return this.userFace;
   }

   public void setUserFace(String userFace) {
      this.userFace = userFace == null ? null : userFace.trim();
   }

   public Long getRegisterTime() {
      return this.registerTime;
   }

   public void setRegisterTime(Long registerTime) {
      this.registerTime = registerTime;
   }

   public String getNation() {
      return this.nation;
   }

   public void setNation(String nation) {
      this.nation = nation == null ? null : nation.trim();
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

   public Double getBalance() {
      return this.balance;
   }

   public void setBalance(Double balance) {
      this.balance = balance;
   }

   public String getCertificationStatus() {
      return this.certificationStatus;
   }

   public void setCertificationStatus(String certificationStatus) {
      this.certificationStatus = certificationStatus == null ? null : certificationStatus.trim();
   }

   public Long getCertificationTime() {
      return this.certificationTime;
   }

   public void setCertificationTime(Long certificationTime) {
      this.certificationTime = certificationTime;
   }
}
