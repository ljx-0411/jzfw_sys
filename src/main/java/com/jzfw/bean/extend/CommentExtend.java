package com.jzfw.bean.extend;

import com.jzfw.bean.BaseUser;
import com.jzfw.bean.Comment;

import java.util.List;

public class CommentExtend extends Comment {
   private static final long serialVersionUID = 1L;
   private BaseUser baseUser;
   private List<CommentExtend> childComments;

   public BaseUser getBaseUser() {
      return this.baseUser;
   }

   public void setBaseUser(BaseUser baseUser) {
      this.baseUser = baseUser;
   }

   public List<CommentExtend> getChildComments() {
      return this.childComments;
   }

   public void setChildComments(List<CommentExtend> childComments) {
      this.childComments = childComments;
   }
}
