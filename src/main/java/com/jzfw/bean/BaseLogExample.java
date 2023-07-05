package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseLogExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<BaseLogExample.Criteria> oredCriteria = new ArrayList();

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

   public List<BaseLogExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(BaseLogExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public BaseLogExample.Criteria or() {
      BaseLogExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public BaseLogExample.Criteria createCriteria() {
      BaseLogExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected BaseLogExample.Criteria createCriteriaInternal() {
      BaseLogExample.Criteria criteria = new BaseLogExample.Criteria();
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

   public static class Criteria extends BaseLogExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<BaseLogExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<BaseLogExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<BaseLogExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new BaseLogExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new BaseLogExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new BaseLogExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public BaseLogExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameIsNull() {
         this.addCriterion("realname is null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameIsNotNull() {
         this.addCriterion("realname is not null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameEqualTo(String value) {
         this.addCriterion("realname =", value, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameNotEqualTo(String value) {
         this.addCriterion("realname <>", value, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameGreaterThan(String value) {
         this.addCriterion("realname >", value, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameGreaterThanOrEqualTo(String value) {
         this.addCriterion("realname >=", value, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameLessThan(String value) {
         this.addCriterion("realname <", value, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameLessThanOrEqualTo(String value) {
         this.addCriterion("realname <=", value, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameLike(String value) {
         this.addCriterion("realname like", value, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameNotLike(String value) {
         this.addCriterion("realname not like", value, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameIn(List<String> values) {
         this.addCriterion("realname in", values, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameNotIn(List<String> values) {
         this.addCriterion("realname not in", values, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameBetween(String value1, String value2) {
         this.addCriterion("realname between", value1, value2, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andRealnameNotBetween(String value1, String value2) {
         this.addCriterion("realname not between", value1, value2, "realname");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodIsNull() {
         this.addCriterion("method is null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodIsNotNull() {
         this.addCriterion("method is not null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodEqualTo(String value) {
         this.addCriterion("method =", value, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodNotEqualTo(String value) {
         this.addCriterion("method <>", value, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodGreaterThan(String value) {
         this.addCriterion("method >", value, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodGreaterThanOrEqualTo(String value) {
         this.addCriterion("method >=", value, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodLessThan(String value) {
         this.addCriterion("method <", value, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodLessThanOrEqualTo(String value) {
         this.addCriterion("method <=", value, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodLike(String value) {
         this.addCriterion("method like", value, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodNotLike(String value) {
         this.addCriterion("method not like", value, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodIn(List<String> values) {
         this.addCriterion("method in", values, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodNotIn(List<String> values) {
         this.addCriterion("method not in", values, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodBetween(String value1, String value2) {
         this.addCriterion("method between", value1, value2, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andMethodNotBetween(String value1, String value2) {
         this.addCriterion("method not between", value1, value2, "method");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentIsNull() {
         this.addCriterion("content is null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentIsNotNull() {
         this.addCriterion("content is not null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentEqualTo(String value) {
         this.addCriterion("content =", value, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentNotEqualTo(String value) {
         this.addCriterion("content <>", value, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentGreaterThan(String value) {
         this.addCriterion("content >", value, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentGreaterThanOrEqualTo(String value) {
         this.addCriterion("content >=", value, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentLessThan(String value) {
         this.addCriterion("content <", value, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentLessThanOrEqualTo(String value) {
         this.addCriterion("content <=", value, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentLike(String value) {
         this.addCriterion("content like", value, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentNotLike(String value) {
         this.addCriterion("content not like", value, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentIn(List<String> values) {
         this.addCriterion("content in", values, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentNotIn(List<String> values) {
         this.addCriterion("content not in", values, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentBetween(String value1, String value2) {
         this.addCriterion("content between", value1, value2, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andContentNotBetween(String value1, String value2) {
         this.addCriterion("content not between", value1, value2, "content");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeIsNull() {
         this.addCriterion("log_time is null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeIsNotNull() {
         this.addCriterion("log_time is not null");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeEqualTo(Long value) {
         this.addCriterion("log_time =", value, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeNotEqualTo(Long value) {
         this.addCriterion("log_time <>", value, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeGreaterThan(Long value) {
         this.addCriterion("log_time >", value, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("log_time >=", value, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeLessThan(Long value) {
         this.addCriterion("log_time <", value, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("log_time <=", value, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeIn(List<Long> values) {
         this.addCriterion("log_time in", values, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeNotIn(List<Long> values) {
         this.addCriterion("log_time not in", values, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeBetween(Long value1, Long value2) {
         this.addCriterion("log_time between", value1, value2, "logTime");
         return (BaseLogExample.Criteria)this;
      }

      public BaseLogExample.Criteria andLogTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("log_time not between", value1, value2, "logTime");
         return (BaseLogExample.Criteria)this;
      }
   }
}
