package com.jzfw.bean;

import java.io.Serializable;

public class Address implements Serializable {
   private Long id;
   private String username;
   private String telephone;
   private String province;
   private String city;
   private String area;
   private String address;
   private Integer isDefault;
   private Long userId;
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

   public String getTelephone() {
      return this.telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone == null ? null : telephone.trim();
   }

   public String getProvince() {
      return this.province;
   }

   public void setProvince(String province) {
      this.province = province == null ? null : province.trim();
   }

   public String getCity() {
      return this.city;
   }

   public void setCity(String city) {
      this.city = city == null ? null : city.trim();
   }

   public String getArea() {
      return this.area;
   }

   public void setArea(String area) {
      this.area = area == null ? null : area.trim();
   }

   public String getAddress() {
      return this.address;
   }

   public void setAddress(String address) {
      this.address = address == null ? null : address.trim();
   }

   public Integer getIsDefault() {
      return this.isDefault;
   }

   public void setIsDefault(Integer isDefault) {
      this.isDefault = isDefault;
   }

   public Long getUserId() {
      return this.userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }
}
