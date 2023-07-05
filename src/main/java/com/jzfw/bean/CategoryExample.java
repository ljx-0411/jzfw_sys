package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<CategoryExample.Criteria> oredCriteria = new ArrayList();

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

   public List<CategoryExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(CategoryExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public CategoryExample.Criteria or() {
      CategoryExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public CategoryExample.Criteria createCriteria() {
      CategoryExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected CategoryExample.Criteria createCriteriaInternal() {
      CategoryExample.Criteria criteria = new CategoryExample.Criteria();
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

   public static class Criteria extends CategoryExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<CategoryExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<CategoryExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<CategoryExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new CategoryExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new CategoryExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new CategoryExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public CategoryExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameIsNull() {
         this.addCriterion("name is null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameIsNotNull() {
         this.addCriterion("name is not null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameEqualTo(String value) {
         this.addCriterion("name =", value, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameNotEqualTo(String value) {
         this.addCriterion("name <>", value, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameGreaterThan(String value) {
         this.addCriterion("name >", value, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("name >=", value, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameLessThan(String value) {
         this.addCriterion("name <", value, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameLessThanOrEqualTo(String value) {
         this.addCriterion("name <=", value, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameLike(String value) {
         this.addCriterion("name like", value, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameNotLike(String value) {
         this.addCriterion("name not like", value, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameIn(List<String> values) {
         this.addCriterion("name in", values, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameNotIn(List<String> values) {
         this.addCriterion("name not in", values, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameBetween(String value1, String value2) {
         this.addCriterion("name between", value1, value2, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNameNotBetween(String value1, String value2) {
         this.addCriterion("name not between", value1, value2, "name");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionIsNull() {
         this.addCriterion("description is null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionIsNotNull() {
         this.addCriterion("description is not null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionEqualTo(String value) {
         this.addCriterion("description =", value, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionNotEqualTo(String value) {
         this.addCriterion("description <>", value, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionGreaterThan(String value) {
         this.addCriterion("description >", value, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionGreaterThanOrEqualTo(String value) {
         this.addCriterion("description >=", value, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionLessThan(String value) {
         this.addCriterion("description <", value, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionLessThanOrEqualTo(String value) {
         this.addCriterion("description <=", value, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionLike(String value) {
         this.addCriterion("description like", value, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionNotLike(String value) {
         this.addCriterion("description not like", value, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionIn(List<String> values) {
         this.addCriterion("description in", values, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionNotIn(List<String> values) {
         this.addCriterion("description not in", values, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionBetween(String value1, String value2) {
         this.addCriterion("description between", value1, value2, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andDescriptionNotBetween(String value1, String value2) {
         this.addCriterion("description not between", value1, value2, "description");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoIsNull() {
         this.addCriterion("no is null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoIsNotNull() {
         this.addCriterion("no is not null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoEqualTo(Integer value) {
         this.addCriterion("no =", value, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoNotEqualTo(Integer value) {
         this.addCriterion("no <>", value, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoGreaterThan(Integer value) {
         this.addCriterion("no >", value, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("no >=", value, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoLessThan(Integer value) {
         this.addCriterion("no <", value, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoLessThanOrEqualTo(Integer value) {
         this.addCriterion("no <=", value, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoIn(List<Integer> values) {
         this.addCriterion("no in", values, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoNotIn(List<Integer> values) {
         this.addCriterion("no not in", values, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoBetween(Integer value1, Integer value2) {
         this.addCriterion("no between", value1, value2, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andNoNotBetween(Integer value1, Integer value2) {
         this.addCriterion("no not between", value1, value2, "no");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdIsNull() {
         this.addCriterion("parent_id is null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdIsNotNull() {
         this.addCriterion("parent_id is not null");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdEqualTo(Long value) {
         this.addCriterion("parent_id =", value, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdNotEqualTo(Long value) {
         this.addCriterion("parent_id <>", value, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdGreaterThan(Long value) {
         this.addCriterion("parent_id >", value, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("parent_id >=", value, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdLessThan(Long value) {
         this.addCriterion("parent_id <", value, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdLessThanOrEqualTo(Long value) {
         this.addCriterion("parent_id <=", value, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdIn(List<Long> values) {
         this.addCriterion("parent_id in", values, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdNotIn(List<Long> values) {
         this.addCriterion("parent_id not in", values, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdBetween(Long value1, Long value2) {
         this.addCriterion("parent_id between", value1, value2, "parentId");
         return (CategoryExample.Criteria)this;
      }

      public CategoryExample.Criteria andParentIdNotBetween(Long value1, Long value2) {
         this.addCriterion("parent_id not between", value1, value2, "parentId");
         return (CategoryExample.Criteria)this;
      }
   }
}
