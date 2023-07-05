package com.jzfw.bean;

import java.io.Serializable;

public class OrderComment implements Serializable {
   private Long id;
   private String content;
   private Long commentTime;
   private String status;
   private Long orderId;
   private Long customerId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getContent() {
      return this.content;
   }

   public void setContent(String content) {
      this.content = content == null ? null : content.trim();
   }

   public Long getCommentTime() {
      return this.commentTime;
   }

   public void setCommentTime(Long commentTime) {
      this.commentTime = commentTime;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status == null ? null : status.trim();
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getCustomerId() {
      return this.customerId;
   }

   public void setCustomerId(Long customerId) {
      this.customerId = customerId;
   }
}
