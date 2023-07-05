package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseRolePrivilegeExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<BaseRolePrivilegeExample.Criteria> oredCriteria = new ArrayList();

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

   public List<BaseRolePrivilegeExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(BaseRolePrivilegeExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public BaseRolePrivilegeExample.Criteria or() {
      BaseRolePrivilegeExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public BaseRolePrivilegeExample.Criteria createCriteria() {
      BaseRolePrivilegeExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected BaseRolePrivilegeExample.Criteria createCriteriaInternal() {
      BaseRolePrivilegeExample.Criteria criteria = new BaseRolePrivilegeExample.Criteria();
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

   public static class Criteria extends BaseRolePrivilegeExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<BaseRolePrivilegeExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<BaseRolePrivilegeExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<BaseRolePrivilegeExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new BaseRolePrivilegeExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new BaseRolePrivilegeExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new BaseRolePrivilegeExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public BaseRolePrivilegeExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdIsNull() {
         this.addCriterion("role_id is null");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdIsNotNull() {
         this.addCriterion("role_id is not null");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdEqualTo(Long value) {
         this.addCriterion("role_id =", value, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdNotEqualTo(Long value) {
         this.addCriterion("role_id <>", value, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdGreaterThan(Long value) {
         this.addCriterion("role_id >", value, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("role_id >=", value, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdLessThan(Long value) {
         this.addCriterion("role_id <", value, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdLessThanOrEqualTo(Long value) {
         this.addCriterion("role_id <=", value, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdIn(List<Long> values) {
         this.addCriterion("role_id in", values, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdNotIn(List<Long> values) {
         this.addCriterion("role_id not in", values, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdBetween(Long value1, Long value2) {
         this.addCriterion("role_id between", value1, value2, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andRoleIdNotBetween(Long value1, Long value2) {
         this.addCriterion("role_id not between", value1, value2, "roleId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdIsNull() {
         this.addCriterion("privilege_id is null");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdIsNotNull() {
         this.addCriterion("privilege_id is not null");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdEqualTo(Long value) {
         this.addCriterion("privilege_id =", value, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdNotEqualTo(Long value) {
         this.addCriterion("privilege_id <>", value, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdGreaterThan(Long value) {
         this.addCriterion("privilege_id >", value, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("privilege_id >=", value, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdLessThan(Long value) {
         this.addCriterion("privilege_id <", value, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdLessThanOrEqualTo(Long value) {
         this.addCriterion("privilege_id <=", value, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdIn(List<Long> values) {
         this.addCriterion("privilege_id in", values, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdNotIn(List<Long> values) {
         this.addCriterion("privilege_id not in", values, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdBetween(Long value1, Long value2) {
         this.addCriterion("privilege_id between", value1, value2, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }

      public BaseRolePrivilegeExample.Criteria andPrivilegeIdNotBetween(Long value1, Long value2) {
         this.addCriterion("privilege_id not between", value1, value2, "privilegeId");
         return (BaseRolePrivilegeExample.Criteria)this;
      }
   }
}
