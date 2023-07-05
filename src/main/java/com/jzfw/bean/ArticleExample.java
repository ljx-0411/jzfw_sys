package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<ArticleExample.Criteria> oredCriteria = new ArrayList();

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

   public List<ArticleExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(ArticleExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public ArticleExample.Criteria or() {
      ArticleExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public ArticleExample.Criteria createCriteria() {
      ArticleExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected ArticleExample.Criteria createCriteriaInternal() {
      ArticleExample.Criteria criteria = new ArticleExample.Criteria();
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

   public static class Criteria extends ArticleExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<ArticleExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<ArticleExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<ArticleExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new ArticleExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new ArticleExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new ArticleExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public ArticleExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleIsNull() {
         this.addCriterion("title is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleIsNotNull() {
         this.addCriterion("title is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleEqualTo(String value) {
         this.addCriterion("title =", value, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleNotEqualTo(String value) {
         this.addCriterion("title <>", value, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleGreaterThan(String value) {
         this.addCriterion("title >", value, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleGreaterThanOrEqualTo(String value) {
         this.addCriterion("title >=", value, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleLessThan(String value) {
         this.addCriterion("title <", value, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleLessThanOrEqualTo(String value) {
         this.addCriterion("title <=", value, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleLike(String value) {
         this.addCriterion("title like", value, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleNotLike(String value) {
         this.addCriterion("title not like", value, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleIn(List<String> values) {
         this.addCriterion("title in", values, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleNotIn(List<String> values) {
         this.addCriterion("title not in", values, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleBetween(String value1, String value2) {
         this.addCriterion("title between", value1, value2, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andTitleNotBetween(String value1, String value2) {
         this.addCriterion("title not between", value1, value2, "title");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentIsNull() {
         this.addCriterion("content is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentIsNotNull() {
         this.addCriterion("content is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentEqualTo(String value) {
         this.addCriterion("content =", value, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentNotEqualTo(String value) {
         this.addCriterion("content <>", value, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentGreaterThan(String value) {
         this.addCriterion("content >", value, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentGreaterThanOrEqualTo(String value) {
         this.addCriterion("content >=", value, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentLessThan(String value) {
         this.addCriterion("content <", value, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentLessThanOrEqualTo(String value) {
         this.addCriterion("content <=", value, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentLike(String value) {
         this.addCriterion("content like", value, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentNotLike(String value) {
         this.addCriterion("content not like", value, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentIn(List<String> values) {
         this.addCriterion("content in", values, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentNotIn(List<String> values) {
         this.addCriterion("content not in", values, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentBetween(String value1, String value2) {
         this.addCriterion("content between", value1, value2, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andContentNotBetween(String value1, String value2) {
         this.addCriterion("content not between", value1, value2, "content");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeIsNull() {
         this.addCriterion("publish_time is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeIsNotNull() {
         this.addCriterion("publish_time is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeEqualTo(Long value) {
         this.addCriterion("publish_time =", value, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeNotEqualTo(Long value) {
         this.addCriterion("publish_time <>", value, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeGreaterThan(Long value) {
         this.addCriterion("publish_time >", value, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("publish_time >=", value, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeLessThan(Long value) {
         this.addCriterion("publish_time <", value, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("publish_time <=", value, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeIn(List<Long> values) {
         this.addCriterion("publish_time in", values, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeNotIn(List<Long> values) {
         this.addCriterion("publish_time not in", values, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeBetween(Long value1, Long value2) {
         this.addCriterion("publish_time between", value1, value2, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andPublishTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("publish_time not between", value1, value2, "publishTime");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesIsNull() {
         this.addCriterion("read_times is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesIsNotNull() {
         this.addCriterion("read_times is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesEqualTo(Long value) {
         this.addCriterion("read_times =", value, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesNotEqualTo(Long value) {
         this.addCriterion("read_times <>", value, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesGreaterThan(Long value) {
         this.addCriterion("read_times >", value, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesGreaterThanOrEqualTo(Long value) {
         this.addCriterion("read_times >=", value, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesLessThan(Long value) {
         this.addCriterion("read_times <", value, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesLessThanOrEqualTo(Long value) {
         this.addCriterion("read_times <=", value, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesIn(List<Long> values) {
         this.addCriterion("read_times in", values, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesNotIn(List<Long> values) {
         this.addCriterion("read_times not in", values, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesBetween(Long value1, Long value2) {
         this.addCriterion("read_times between", value1, value2, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andReadTimesNotBetween(Long value1, Long value2) {
         this.addCriterion("read_times not between", value1, value2, "readTimes");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpIsNull() {
         this.addCriterion("thump_up is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpIsNotNull() {
         this.addCriterion("thump_up is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpEqualTo(Long value) {
         this.addCriterion("thump_up =", value, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpNotEqualTo(Long value) {
         this.addCriterion("thump_up <>", value, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpGreaterThan(Long value) {
         this.addCriterion("thump_up >", value, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpGreaterThanOrEqualTo(Long value) {
         this.addCriterion("thump_up >=", value, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpLessThan(Long value) {
         this.addCriterion("thump_up <", value, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpLessThanOrEqualTo(Long value) {
         this.addCriterion("thump_up <=", value, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpIn(List<Long> values) {
         this.addCriterion("thump_up in", values, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpNotIn(List<Long> values) {
         this.addCriterion("thump_up not in", values, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpBetween(Long value1, Long value2) {
         this.addCriterion("thump_up between", value1, value2, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andThumpUpNotBetween(Long value1, Long value2) {
         this.addCriterion("thump_up not between", value1, value2, "thumpUp");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverIsNull() {
         this.addCriterion("cover is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverIsNotNull() {
         this.addCriterion("cover is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverEqualTo(String value) {
         this.addCriterion("cover =", value, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverNotEqualTo(String value) {
         this.addCriterion("cover <>", value, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverGreaterThan(String value) {
         this.addCriterion("cover >", value, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverGreaterThanOrEqualTo(String value) {
         this.addCriterion("cover >=", value, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverLessThan(String value) {
         this.addCriterion("cover <", value, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverLessThanOrEqualTo(String value) {
         this.addCriterion("cover <=", value, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverLike(String value) {
         this.addCriterion("cover like", value, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverNotLike(String value) {
         this.addCriterion("cover not like", value, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverIn(List<String> values) {
         this.addCriterion("cover in", values, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverNotIn(List<String> values) {
         this.addCriterion("cover not in", values, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverBetween(String value1, String value2) {
         this.addCriterion("cover between", value1, value2, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCoverNotBetween(String value1, String value2) {
         this.addCriterion("cover not between", value1, value2, "cover");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdIsNull() {
         this.addCriterion("project_id is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdIsNotNull() {
         this.addCriterion("project_id is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdEqualTo(Long value) {
         this.addCriterion("project_id =", value, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdNotEqualTo(Long value) {
         this.addCriterion("project_id <>", value, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdGreaterThan(Long value) {
         this.addCriterion("project_id >", value, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("project_id >=", value, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdLessThan(Long value) {
         this.addCriterion("project_id <", value, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdLessThanOrEqualTo(Long value) {
         this.addCriterion("project_id <=", value, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdIn(List<Long> values) {
         this.addCriterion("project_id in", values, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdNotIn(List<Long> values) {
         this.addCriterion("project_id not in", values, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdBetween(Long value1, Long value2) {
         this.addCriterion("project_id between", value1, value2, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andProjectIdNotBetween(Long value1, Long value2) {
         this.addCriterion("project_id not between", value1, value2, "projectId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdIsNull() {
         this.addCriterion("author_id is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdIsNotNull() {
         this.addCriterion("author_id is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdEqualTo(Long value) {
         this.addCriterion("author_id =", value, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdNotEqualTo(Long value) {
         this.addCriterion("author_id <>", value, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdGreaterThan(Long value) {
         this.addCriterion("author_id >", value, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("author_id >=", value, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdLessThan(Long value) {
         this.addCriterion("author_id <", value, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdLessThanOrEqualTo(Long value) {
         this.addCriterion("author_id <=", value, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdIn(List<Long> values) {
         this.addCriterion("author_id in", values, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdNotIn(List<Long> values) {
         this.addCriterion("author_id not in", values, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdBetween(Long value1, Long value2) {
         this.addCriterion("author_id between", value1, value2, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andAuthorIdNotBetween(Long value1, Long value2) {
         this.addCriterion("author_id not between", value1, value2, "authorId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdIsNull() {
         this.addCriterion("category_id is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdIsNotNull() {
         this.addCriterion("category_id is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdEqualTo(Long value) {
         this.addCriterion("category_id =", value, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdNotEqualTo(Long value) {
         this.addCriterion("category_id <>", value, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdGreaterThan(Long value) {
         this.addCriterion("category_id >", value, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("category_id >=", value, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdLessThan(Long value) {
         this.addCriterion("category_id <", value, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdLessThanOrEqualTo(Long value) {
         this.addCriterion("category_id <=", value, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdIn(List<Long> values) {
         this.addCriterion("category_id in", values, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdNotIn(List<Long> values) {
         this.addCriterion("category_id not in", values, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdBetween(Long value1, Long value2) {
         this.addCriterion("category_id between", value1, value2, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andCategoryIdNotBetween(Long value1, Long value2) {
         this.addCriterion("category_id not between", value1, value2, "categoryId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdIsNull() {
         this.addCriterion("compony_id is null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdIsNotNull() {
         this.addCriterion("compony_id is not null");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdEqualTo(Long value) {
         this.addCriterion("compony_id =", value, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdNotEqualTo(Long value) {
         this.addCriterion("compony_id <>", value, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdGreaterThan(Long value) {
         this.addCriterion("compony_id >", value, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("compony_id >=", value, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdLessThan(Long value) {
         this.addCriterion("compony_id <", value, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdLessThanOrEqualTo(Long value) {
         this.addCriterion("compony_id <=", value, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdIn(List<Long> values) {
         this.addCriterion("compony_id in", values, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdNotIn(List<Long> values) {
         this.addCriterion("compony_id not in", values, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdBetween(Long value1, Long value2) {
         this.addCriterion("compony_id between", value1, value2, "componyId");
         return (ArticleExample.Criteria)this;
      }

      public ArticleExample.Criteria andComponyIdNotBetween(Long value1, Long value2) {
         this.addCriterion("compony_id not between", value1, value2, "componyId");
         return (ArticleExample.Criteria)this;
      }
   }
}
