package com.jzfw.bean;

import java.io.Serializable;

public class BaseFile implements Serializable {
   private String id;
   private String fileName;
   private String groupName;
   private Long uploadTime;
   private String extName;
   private Long fileSize;
   private String fileType;
   private static final long serialVersionUID = 1L;

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.id = id == null ? null : id.trim();
   }

   public String getFileName() {
      return this.fileName;
   }

   public void setFileName(String fileName) {
      this.fileName = fileName == null ? null : fileName.trim();
   }

   public String getGroupName() {
      return this.groupName;
   }

   public void setGroupName(String groupName) {
      this.groupName = groupName == null ? null : groupName.trim();
   }

   public Long getUploadTime() {
      return this.uploadTime;
   }

   public void setUploadTime(Long uploadTime) {
      this.uploadTime = uploadTime;
   }

   public String getExtName() {
      return this.extName;
   }

   public void setExtName(String extName) {
      this.extName = extName == null ? null : extName.trim();
   }

   public Long getFileSize() {
      return this.fileSize;
   }

   public void setFileSize(Long fileSize) {
      this.fileSize = fileSize;
   }

   public String getFileType() {
      return this.fileType;
   }

   public void setFileType(String fileType) {
      this.fileType = fileType == null ? null : fileType.trim();
   }
}
