package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseUserRoleExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<BaseUserRoleExample.Criteria> oredCriteria = new ArrayList();

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

   public List<BaseUserRoleExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(BaseUserRoleExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public BaseUserRoleExample.Criteria or() {
      BaseUserRoleExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public BaseUserRoleExample.Criteria createCriteria() {
      BaseUserRoleExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected BaseUserRoleExample.Criteria createCriteriaInternal() {
      BaseUserRoleExample.Criteria criteria = new BaseUserRoleExample.Criteria();
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

   public static class Criteria extends BaseUserRoleExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<BaseUserRoleExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<BaseUserRoleExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<BaseUserRoleExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new BaseUserRoleExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new BaseUserRoleExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new BaseUserRoleExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public BaseUserRoleExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdIsNull() {
         this.addCriterion("user_id is null");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdIsNotNull() {
         this.addCriterion("user_id is not null");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdEqualTo(Long value) {
         this.addCriterion("user_id =", value, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdNotEqualTo(Long value) {
         this.addCriterion("user_id <>", value, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdGreaterThan(Long value) {
         this.addCriterion("user_id >", value, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("user_id >=", value, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdLessThan(Long value) {
         this.addCriterion("user_id <", value, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdLessThanOrEqualTo(Long value) {
         this.addCriterion("user_id <=", value, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdIn(List<Long> values) {
         this.addCriterion("user_id in", values, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdNotIn(List<Long> values) {
         this.addCriterion("user_id not in", values, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdBetween(Long value1, Long value2) {
         this.addCriterion("user_id between", value1, value2, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andUserIdNotBetween(Long value1, Long value2) {
         this.addCriterion("user_id not between", value1, value2, "userId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdIsNull() {
         this.addCriterion("role_id is null");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdIsNotNull() {
         this.addCriterion("role_id is not null");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdEqualTo(Long value) {
         this.addCriterion("role_id =", value, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdNotEqualTo(Long value) {
         this.addCriterion("role_id <>", value, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdGreaterThan(Long value) {
         this.addCriterion("role_id >", value, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("role_id >=", value, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdLessThan(Long value) {
         this.addCriterion("role_id <", value, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdLessThanOrEqualTo(Long value) {
         this.addCriterion("role_id <=", value, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdIn(List<Long> values) {
         this.addCriterion("role_id in", values, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdNotIn(List<Long> values) {
         this.addCriterion("role_id not in", values, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdBetween(Long value1, Long value2) {
         this.addCriterion("role_id between", value1, value2, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }

      public BaseUserRoleExample.Criteria andRoleIdNotBetween(Long value1, Long value2) {
         this.addCriterion("role_id not between", value1, value2, "roleId");
         return (BaseUserRoleExample.Criteria)this;
      }
   }
}
