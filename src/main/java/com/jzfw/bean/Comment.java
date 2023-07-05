package com.jzfw.bean;

import java.io.Serializable;

public class Comment implements Serializable {
   private Long id;
   private String comment;
   private Long commentTime;
   private String reply;
   private Long replyTime;
   private String status;
   private Long userId;
   private Long articleId;
   private Long parentId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getComment() {
      return this.comment;
   }

   public void setComment(String comment) {
      this.comment = comment == null ? null : comment.trim();
   }

   public Long getCommentTime() {
      return this.commentTime;
   }

   public void setCommentTime(Long commentTime) {
      this.commentTime = commentTime;
   }

   public String getReply() {
      return this.reply;
   }

   public void setReply(String reply) {
      this.reply = reply == null ? null : reply.trim();
   }

   public Long getReplyTime() {
      return this.replyTime;
   }

   public void setReplyTime(Long replyTime) {
      this.replyTime = replyTime;
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

   public Long getArticleId() {
      return this.articleId;
   }

   public void setArticleId(Long articleId) {
      this.articleId = articleId;
   }

   public Long getParentId() {
      return this.parentId;
   }

   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }
}
