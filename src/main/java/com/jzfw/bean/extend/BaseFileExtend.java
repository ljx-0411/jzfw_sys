package com.jzfw.bean.extend;

import com.jzfw.bean.BaseFile;

public class BaseFileExtend extends BaseFile {
   private static final long serialVersionUID = 1L;
   private String uploadDate;

   public String getUploadDate() {
      return this.uploadDate;
   }

   public void setUploadDate(String uploadDate) {
      this.uploadDate = uploadDate;
   }
}
