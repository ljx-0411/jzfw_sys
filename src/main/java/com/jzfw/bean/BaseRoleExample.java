package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseRoleExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<BaseRoleExample.Criteria> oredCriteria = new ArrayList();

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

   public List<BaseRoleExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(BaseRoleExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public BaseRoleExample.Criteria or() {
      BaseRoleExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public BaseRoleExample.Criteria createCriteria() {
      BaseRoleExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected BaseRoleExample.Criteria createCriteriaInternal() {
      BaseRoleExample.Criteria criteria = new BaseRoleExample.Criteria();
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

   public static class Criteria extends BaseRoleExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<BaseRoleExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<BaseRoleExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<BaseRoleExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new BaseRoleExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new BaseRoleExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new BaseRoleExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public BaseRoleExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameIsNull() {
         this.addCriterion("name is null");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameIsNotNull() {
         this.addCriterion("name is not null");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameEqualTo(String value) {
         this.addCriterion("name =", value, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameNotEqualTo(String value) {
         this.addCriterion("name <>", value, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameGreaterThan(String value) {
         this.addCriterion("name >", value, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("name >=", value, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameLessThan(String value) {
         this.addCriterion("name <", value, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameLessThanOrEqualTo(String value) {
         this.addCriterion("name <=", value, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameLike(String value) {
         this.addCriterion("name like", value, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameNotLike(String value) {
         this.addCriterion("name not like", value, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameIn(List<String> values) {
         this.addCriterion("name in", values, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameNotIn(List<String> values) {
         this.addCriterion("name not in", values, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameBetween(String value1, String value2) {
         this.addCriterion("name between", value1, value2, "name");
         return (BaseRoleExample.Criteria)this;
      }

      public BaseRoleExample.Criteria andNameNotBetween(String value1, String value2) {
         this.addCriterion("name not between", value1, value2, "name");
         return (BaseRoleExample.Criteria)this;
      }
   }
}
