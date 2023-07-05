package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class CommentExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<CommentExample.Criteria> oredCriteria = new ArrayList();

   public void setOrderByClause(String orderByClause) {
      this.orderByClause = orderByClause;
   }

   public String getOrderByClause() {
      return this.orderByClause;
   }

   public void setDistinct(boolean distinct) {
      this.distinct = distinct;
   }

   public boolean isDistinct() {
      return this.distinct;
   }

   public List<CommentExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(CommentExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public CommentExample.Criteria or() {
      CommentExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public CommentExample.Criteria createCriteria() {
      CommentExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected CommentExample.Criteria createCriteriaInternal() {
      CommentExample.Criteria criteria = new CommentExample.Criteria();
      return criteria;
   }

   public void clear() {
      this.oredCriteria.clear();
      this.orderByClause = null;
      this.distinct = false;
   }

   public static class Criterion {
      private String condition;
      private Object value;
      private Object secondValue;
      private boolean noValue;
      private boolean singleValue;
      private boolean betweenValue;
      private boolean listValue;
      private String typeHandler;

      public String getCondition() {
         return this.condition;
      }

      public Object getValue() {
         return this.value;
      }

      public Object getSecondValue() {
         return this.secondValue;
      }

      public boolean isNoValue() {
         return this.noValue;
      }

      public boolean isSingleValue() {
         return this.singleValue;
      }

      public boolean isBetweenValue() {
         return this.betweenValue;
      }

      public boolean isListValue() {
         return this.listValue;
      }

      public String getTypeHandler() {
         return this.typeHandler;
      }

      protected Criterion(String condition) {
         this.condition = condition;
         this.typeHandler = null;
         this.noValue = true;
      }

      protected Criterion(String condition, Object value, String typeHandler) {
         this.condition = condition;
         this.value = value;
         this.typeHandler = typeHandler;
         if (value instanceof List) {
            this.listValue = true;
         } else {
            this.singleValue = true;
         }

      }

      protected Criterion(String condition, Object value) {
         this(condition, value, (String)null);
      }

      protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
         this.condition = condition;
         this.value = value;
         this.secondValue = secondValue;
         this.typeHandler = typeHandler;
         this.betweenValue = true;
      }

      protected Criterion(String condition, Object value, Object secondValue) {
         this(condition, value, secondValue, (String)null);
      }
   }

   public static class Criteria extends CommentExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<CommentExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<CommentExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<CommentExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new CommentExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new CommentExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new CommentExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public CommentExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentIsNull() {
         this.addCriterion("comment is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentIsNotNull() {
         this.addCriterion("comment is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentEqualTo(String value) {
         this.addCriterion("comment =", value, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentNotEqualTo(String value) {
         this.addCriterion("comment <>", value, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentGreaterThan(String value) {
         this.addCriterion("comment >", value, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentGreaterThanOrEqualTo(String value) {
         this.addCriterion("comment >=", value, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentLessThan(String value) {
         this.addCriterion("comment <", value, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentLessThanOrEqualTo(String value) {
         this.addCriterion("comment <=", value, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentLike(String value) {
         this.addCriterion("comment like", value, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentNotLike(String value) {
         this.addCriterion("comment not like", value, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentIn(List<String> values) {
         this.addCriterion("comment in", values, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentNotIn(List<String> values) {
         this.addCriterion("comment not in", values, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentBetween(String value1, String value2) {
         this.addCriterion("comment between", value1, value2, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentNotBetween(String value1, String value2) {
         this.addCriterion("comment not between", value1, value2, "comment");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeIsNull() {
         this.addCriterion("comment_time is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeIsNotNull() {
         this.addCriterion("comment_time is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeEqualTo(Long value) {
         this.addCriterion("comment_time =", value, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeNotEqualTo(Long value) {
         this.addCriterion("comment_time <>", value, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeGreaterThan(Long value) {
         this.addCriterion("comment_time >", value, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("comment_time >=", value, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeLessThan(Long value) {
         this.addCriterion("comment_time <", value, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("comment_time <=", value, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeIn(List<Long> values) {
         this.addCriterion("comment_time in", values, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeNotIn(List<Long> values) {
         this.addCriterion("comment_time not in", values, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeBetween(Long value1, Long value2) {
         this.addCriterion("comment_time between", value1, value2, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andCommentTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("comment_time not between", value1, value2, "commentTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyIsNull() {
         this.addCriterion("reply is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyIsNotNull() {
         this.addCriterion("reply is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyEqualTo(String value) {
         this.addCriterion("reply =", value, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyNotEqualTo(String value) {
         this.addCriterion("reply <>", value, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyGreaterThan(String value) {
         this.addCriterion("reply >", value, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyGreaterThanOrEqualTo(String value) {
         this.addCriterion("reply >=", value, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyLessThan(String value) {
         this.addCriterion("reply <", value, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyLessThanOrEqualTo(String value) {
         this.addCriterion("reply <=", value, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyLike(String value) {
         this.addCriterion("reply like", value, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyNotLike(String value) {
         this.addCriterion("reply not like", value, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyIn(List<String> values) {
         this.addCriterion("reply in", values, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyNotIn(List<String> values) {
         this.addCriterion("reply not in", values, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyBetween(String value1, String value2) {
         this.addCriterion("reply between", value1, value2, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyNotBetween(String value1, String value2) {
         this.addCriterion("reply not between", value1, value2, "reply");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeIsNull() {
         this.addCriterion("reply_time is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeIsNotNull() {
         this.addCriterion("reply_time is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeEqualTo(Long value) {
         this.addCriterion("reply_time =", value, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeNotEqualTo(Long value) {
         this.addCriterion("reply_time <>", value, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeGreaterThan(Long value) {
         this.addCriterion("reply_time >", value, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("reply_time >=", value, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeLessThan(Long value) {
         this.addCriterion("reply_time <", value, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("reply_time <=", value, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeIn(List<Long> values) {
         this.addCriterion("reply_time in", values, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeNotIn(List<Long> values) {
         this.addCriterion("reply_time not in", values, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeBetween(Long value1, Long value2) {
         this.addCriterion("reply_time between", value1, value2, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andReplyTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("reply_time not between", value1, value2, "replyTime");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdIsNull() {
         this.addCriterion("user_id is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdIsNotNull() {
         this.addCriterion("user_id is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdEqualTo(Long value) {
         this.addCriterion("user_id =", value, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdNotEqualTo(Long value) {
         this.addCriterion("user_id <>", value, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdGreaterThan(Long value) {
         this.addCriterion("user_id >", value, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("user_id >=", value, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdLessThan(Long value) {
         this.addCriterion("user_id <", value, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdLessThanOrEqualTo(Long value) {
         this.addCriterion("user_id <=", value, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdIn(List<Long> values) {
         this.addCriterion("user_id in", values, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdNotIn(List<Long> values) {
         this.addCriterion("user_id not in", values, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdBetween(Long value1, Long value2) {
         this.addCriterion("user_id between", value1, value2, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andUserIdNotBetween(Long value1, Long value2) {
         this.addCriterion("user_id not between", value1, value2, "userId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdIsNull() {
         this.addCriterion("article_id is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdIsNotNull() {
         this.addCriterion("article_id is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdEqualTo(Long value) {
         this.addCriterion("article_id =", value, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdNotEqualTo(Long value) {
         this.addCriterion("article_id <>", value, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdGreaterThan(Long value) {
         this.addCriterion("article_id >", value, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("article_id >=", value, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdLessThan(Long value) {
         this.addCriterion("article_id <", value, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdLessThanOrEqualTo(Long value) {
         this.addCriterion("article_id <=", value, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdIn(List<Long> values) {
         this.addCriterion("article_id in", values, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdNotIn(List<Long> values) {
         this.addCriterion("article_id not in", values, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdBetween(Long value1, Long value2) {
         this.addCriterion("article_id between", value1, value2, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andArticleIdNotBetween(Long value1, Long value2) {
         this.addCriterion("article_id not between", value1, value2, "articleId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdIsNull() {
         this.addCriterion("parent_id is null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdIsNotNull() {
         this.addCriterion("parent_id is not null");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdEqualTo(Long value) {
         this.addCriterion("parent_id =", value, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdNotEqualTo(Long value) {
         this.addCriterion("parent_id <>", value, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdGreaterThan(Long value) {
         this.addCriterion("parent_id >", value, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("parent_id >=", value, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdLessThan(Long value) {
         this.addCriterion("parent_id <", value, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdLessThanOrEqualTo(Long value) {
         this.addCriterion("parent_id <=", value, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdIn(List<Long> values) {
         this.addCriterion("parent_id in", values, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdNotIn(List<Long> values) {
         this.addCriterion("parent_id not in", values, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdBetween(Long value1, Long value2) {
         this.addCriterion("parent_id between", value1, value2, "parentId");
         return (CommentExample.Criteria)this;
      }

      public CommentExample.Criteria andParentIdNotBetween(Long value1, Long value2) {
         this.addCriterion("parent_id not between", value1, value2, "parentId");
         return (CommentExample.Criteria)this;
      }
   }
}
