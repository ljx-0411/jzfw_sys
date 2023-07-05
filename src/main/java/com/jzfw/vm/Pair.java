package com.jzfw.vm;

import java.io.Serializable;

public class Pair implements Serializable {
   private static final long serialVersionUID = 1L;
   private String k;
   private String v;

   public String getK() {
      return this.k;
   }

   public void setK(String k) {
      this.k = k;
   }

   public String getV() {
      return this.v;
   }

   public void setV(String v) {
      this.v = v;
   }
}
