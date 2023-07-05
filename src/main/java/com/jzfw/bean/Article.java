package com.jzfw.bean;

import java.io.Serializable;

public class Article implements Serializable {
   private Long id;
   private String title;
   private String content;
   private Long publishTime;
   private Long readTimes;
   private String status;
   private Long thumpUp;
   private String cover;
   private Long projectId;
   private Long authorId;
   private Long categoryId;
   private Long componyId;
   private static final long serialVersionUID = 1L;

   public Long getId() {
      return this.id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title == null ? null : title.trim();
   }

   public String getContent() {
      return this.content;
   }

   public void setContent(String content) {
      this.content = content == null ? null : content.trim();
   }

   public Long getPublishTime() {
      return this.publishTime;
   }

   public void setPublishTime(Long publishTime) {
      this.publishTime = publishTime;
   }

   public Long getReadTimes() {
      return this.readTimes;
   }

   public void setReadTimes(Long readTimes) {
      this.readTimes = readTimes;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status == null ? null : status.trim();
   }

   public Long getThumpUp() {
      return this.thumpUp;
   }

   public void setThumpUp(Long thumpUp) {
      this.thumpUp = thumpUp;
   }

   public String getCover() {
      return this.cover;
   }

   public void setCover(String cover) {
      this.cover = cover == null ? null : cover.trim();
   }

   public Long getProjectId() {
      return this.projectId;
   }

   public void setProjectId(Long projectId) {
      this.projectId = projectId;
   }

   public Long getAuthorId() {
      return this.authorId;
   }

   public void setAuthorId(Long authorId) {
      this.authorId = authorId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getComponyId() {
      return this.componyId;
   }

   public void setComponyId(Long componyId) {
      this.componyId = componyId;
   }
}
