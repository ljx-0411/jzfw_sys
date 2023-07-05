package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseConfigExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<BaseConfigExample.Criteria> oredCriteria = new ArrayList();

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

   public List<BaseConfigExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(BaseConfigExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public BaseConfigExample.Criteria or() {
      BaseConfigExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public BaseConfigExample.Criteria createCriteria() {
      BaseConfigExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected BaseConfigExample.Criteria createCriteriaInternal() {
      BaseConfigExample.Criteria criteria = new BaseConfigExample.Criteria();
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

   public static class Criteria extends BaseConfigExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<BaseConfigExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<BaseConfigExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<BaseConfigExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new BaseConfigExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new BaseConfigExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new BaseConfigExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public BaseConfigExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameIsNull() {
         this.addCriterion("name is null");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameIsNotNull() {
         this.addCriterion("name is not null");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameEqualTo(String value) {
         this.addCriterion("name =", value, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameNotEqualTo(String value) {
         this.addCriterion("name <>", value, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameGreaterThan(String value) {
         this.addCriterion("name >", value, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("name >=", value, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameLessThan(String value) {
         this.addCriterion("name <", value, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameLessThanOrEqualTo(String value) {
         this.addCriterion("name <=", value, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameLike(String value) {
         this.addCriterion("name like", value, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameNotLike(String value) {
         this.addCriterion("name not like", value, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameIn(List<String> values) {
         this.addCriterion("name in", values, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameNotIn(List<String> values) {
         this.addCriterion("name not in", values, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameBetween(String value1, String value2) {
         this.addCriterion("name between", value1, value2, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andNameNotBetween(String value1, String value2) {
         this.addCriterion("name not between", value1, value2, "name");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValIsNull() {
         this.addCriterion("val is null");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValIsNotNull() {
         this.addCriterion("val is not null");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValEqualTo(String value) {
         this.addCriterion("val =", value, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValNotEqualTo(String value) {
         this.addCriterion("val <>", value, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValGreaterThan(String value) {
         this.addCriterion("val >", value, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValGreaterThanOrEqualTo(String value) {
         this.addCriterion("val >=", value, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValLessThan(String value) {
         this.addCriterion("val <", value, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValLessThanOrEqualTo(String value) {
         this.addCriterion("val <=", value, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValLike(String value) {
         this.addCriterion("val like", value, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValNotLike(String value) {
         this.addCriterion("val not like", value, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValIn(List<String> values) {
         this.addCriterion("val in", values, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValNotIn(List<String> values) {
         this.addCriterion("val not in", values, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValBetween(String value1, String value2) {
         this.addCriterion("val between", value1, value2, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andValNotBetween(String value1, String value2) {
         this.addCriterion("val not between", value1, value2, "val");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceIsNull() {
         this.addCriterion("introduce is null");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceIsNotNull() {
         this.addCriterion("introduce is not null");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceEqualTo(String value) {
         this.addCriterion("introduce =", value, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceNotEqualTo(String value) {
         this.addCriterion("introduce <>", value, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceGreaterThan(String value) {
         this.addCriterion("introduce >", value, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceGreaterThanOrEqualTo(String value) {
         this.addCriterion("introduce >=", value, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceLessThan(String value) {
         this.addCriterion("introduce <", value, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceLessThanOrEqualTo(String value) {
         this.addCriterion("introduce <=", value, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceLike(String value) {
         this.addCriterion("introduce like", value, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceNotLike(String value) {
         this.addCriterion("introduce not like", value, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceIn(List<String> values) {
         this.addCriterion("introduce in", values, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceNotIn(List<String> values) {
         this.addCriterion("introduce not in", values, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceBetween(String value1, String value2) {
         this.addCriterion("introduce between", value1, value2, "introduce");
         return (BaseConfigExample.Criteria)this;
      }

      public BaseConfigExample.Criteria andIntroduceNotBetween(String value1, String value2) {
         this.addCriterion("introduce not between", value1, value2, "introduce");
         return (BaseConfigExample.Criteria)this;
      }
   }
}
