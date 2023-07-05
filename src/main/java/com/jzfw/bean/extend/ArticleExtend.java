package com.jzfw.bean.extend;

import com.jzfw.bean.Article;
import com.jzfw.bean.BaseUser;
import com.jzfw.bean.Category;
import com.jzfw.bean.Comment;
import java.util.List;

public class ArticleExtend extends Article {
   private static final long serialVersionUID = 1L;
   public static final String STATUS_UNCHECK = "未审核";
   public static final String STATUS_CHECK_PASS = "通过";
   public static final String STATUS_CHECK_NOPASS = "不通过";
   public static final String STATUS_RECOMMEND = "推荐";
   public static final String STATUS_UNRECOMMEND = "未推荐";
   private Category category;
   private BaseUser baseUser;
   private List<Comment> comments;

   public Category getCategory() {
      return this.category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }

   public List<Comment> getComments() {
      return this.comments;
   }

   public void setComments(List<Comment> comments) {
      this.comments = comments;
   }

   public BaseUser getBaseUser() {
      return this.baseUser;
   }

   public void setBaseUser(BaseUser baseUser) {
      this.baseUser = baseUser;
   }
}
