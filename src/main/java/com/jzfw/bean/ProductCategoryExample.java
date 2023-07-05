package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductCategoryExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<ProductCategoryExample.Criteria> oredCriteria = new ArrayList();

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

   public List<ProductCategoryExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(ProductCategoryExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public ProductCategoryExample.Criteria or() {
      ProductCategoryExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public ProductCategoryExample.Criteria createCriteria() {
      ProductCategoryExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected ProductCategoryExample.Criteria createCriteriaInternal() {
      ProductCategoryExample.Criteria criteria = new ProductCategoryExample.Criteria();
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

   public static class Criteria extends ProductCategoryExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<ProductCategoryExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<ProductCategoryExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<ProductCategoryExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new ProductCategoryExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new ProductCategoryExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new ProductCategoryExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public ProductCategoryExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameIsNull() {
         this.addCriterion("name is null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameIsNotNull() {
         this.addCriterion("name is not null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameEqualTo(String value) {
         this.addCriterion("name =", value, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameNotEqualTo(String value) {
         this.addCriterion("name <>", value, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameGreaterThan(String value) {
         this.addCriterion("name >", value, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("name >=", value, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameLessThan(String value) {
         this.addCriterion("name <", value, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameLessThanOrEqualTo(String value) {
         this.addCriterion("name <=", value, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameLike(String value) {
         this.addCriterion("name like", value, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameNotLike(String value) {
         this.addCriterion("name not like", value, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameIn(List<String> values) {
         this.addCriterion("name in", values, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameNotIn(List<String> values) {
         this.addCriterion("name not in", values, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameBetween(String value1, String value2) {
         this.addCriterion("name between", value1, value2, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNameNotBetween(String value1, String value2) {
         this.addCriterion("name not between", value1, value2, "name");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconIsNull() {
         this.addCriterion("icon is null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconIsNotNull() {
         this.addCriterion("icon is not null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconEqualTo(String value) {
         this.addCriterion("icon =", value, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconNotEqualTo(String value) {
         this.addCriterion("icon <>", value, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconGreaterThan(String value) {
         this.addCriterion("icon >", value, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconGreaterThanOrEqualTo(String value) {
         this.addCriterion("icon >=", value, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconLessThan(String value) {
         this.addCriterion("icon <", value, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconLessThanOrEqualTo(String value) {
         this.addCriterion("icon <=", value, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconLike(String value) {
         this.addCriterion("icon like", value, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconNotLike(String value) {
         this.addCriterion("icon not like", value, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconIn(List<String> values) {
         this.addCriterion("icon in", values, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconNotIn(List<String> values) {
         this.addCriterion("icon not in", values, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconBetween(String value1, String value2) {
         this.addCriterion("icon between", value1, value2, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andIconNotBetween(String value1, String value2) {
         this.addCriterion("icon not between", value1, value2, "icon");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumIsNull() {
         this.addCriterion("num is null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumIsNotNull() {
         this.addCriterion("num is not null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumEqualTo(Integer value) {
         this.addCriterion("num =", value, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumNotEqualTo(Integer value) {
         this.addCriterion("num <>", value, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumGreaterThan(Integer value) {
         this.addCriterion("num >", value, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("num >=", value, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumLessThan(Integer value) {
         this.addCriterion("num <", value, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumLessThanOrEqualTo(Integer value) {
         this.addCriterion("num <=", value, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumIn(List<Integer> values) {
         this.addCriterion("num in", values, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumNotIn(List<Integer> values) {
         this.addCriterion("num not in", values, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumBetween(Integer value1, Integer value2) {
         this.addCriterion("num between", value1, value2, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andNumNotBetween(Integer value1, Integer value2) {
         this.addCriterion("num not between", value1, value2, "num");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdIsNull() {
         this.addCriterion("parent_id is null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdIsNotNull() {
         this.addCriterion("parent_id is not null");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdEqualTo(Long value) {
         this.addCriterion("parent_id =", value, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdNotEqualTo(Long value) {
         this.addCriterion("parent_id <>", value, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdGreaterThan(Long value) {
         this.addCriterion("parent_id >", value, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("parent_id >=", value, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdLessThan(Long value) {
         this.addCriterion("parent_id <", value, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdLessThanOrEqualTo(Long value) {
         this.addCriterion("parent_id <=", value, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdIn(List<Long> values) {
         this.addCriterion("parent_id in", values, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdNotIn(List<Long> values) {
         this.addCriterion("parent_id not in", values, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdBetween(Long value1, Long value2) {
         this.addCriterion("parent_id between", value1, value2, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }

      public ProductCategoryExample.Criteria andParentIdNotBetween(Long value1, Long value2) {
         this.addCriterion("parent_id not between", value1, value2, "parentId");
         return (ProductCategoryExample.Criteria)this;
      }
   }
}
