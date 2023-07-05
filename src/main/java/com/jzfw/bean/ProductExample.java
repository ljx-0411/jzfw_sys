package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<ProductExample.Criteria> oredCriteria = new ArrayList();

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

   public List<ProductExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(ProductExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public ProductExample.Criteria or() {
      ProductExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public ProductExample.Criteria createCriteria() {
      ProductExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected ProductExample.Criteria createCriteriaInternal() {
      ProductExample.Criteria criteria = new ProductExample.Criteria();
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

   public static class Criteria extends ProductExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<ProductExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<ProductExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<ProductExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new ProductExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new ProductExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new ProductExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public ProductExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameIsNull() {
         this.addCriterion("name is null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameIsNotNull() {
         this.addCriterion("name is not null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameEqualTo(String value) {
         this.addCriterion("name =", value, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameNotEqualTo(String value) {
         this.addCriterion("name <>", value, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameGreaterThan(String value) {
         this.addCriterion("name >", value, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("name >=", value, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameLessThan(String value) {
         this.addCriterion("name <", value, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameLessThanOrEqualTo(String value) {
         this.addCriterion("name <=", value, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameLike(String value) {
         this.addCriterion("name like", value, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameNotLike(String value) {
         this.addCriterion("name not like", value, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameIn(List<String> values) {
         this.addCriterion("name in", values, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameNotIn(List<String> values) {
         this.addCriterion("name not in", values, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameBetween(String value1, String value2) {
         this.addCriterion("name between", value1, value2, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andNameNotBetween(String value1, String value2) {
         this.addCriterion("name not between", value1, value2, "name");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionIsNull() {
         this.addCriterion("description is null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionIsNotNull() {
         this.addCriterion("description is not null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionEqualTo(String value) {
         this.addCriterion("description =", value, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionNotEqualTo(String value) {
         this.addCriterion("description <>", value, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionGreaterThan(String value) {
         this.addCriterion("description >", value, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionGreaterThanOrEqualTo(String value) {
         this.addCriterion("description >=", value, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionLessThan(String value) {
         this.addCriterion("description <", value, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionLessThanOrEqualTo(String value) {
         this.addCriterion("description <=", value, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionLike(String value) {
         this.addCriterion("description like", value, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionNotLike(String value) {
         this.addCriterion("description not like", value, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionIn(List<String> values) {
         this.addCriterion("description in", values, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionNotIn(List<String> values) {
         this.addCriterion("description not in", values, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionBetween(String value1, String value2) {
         this.addCriterion("description between", value1, value2, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andDescriptionNotBetween(String value1, String value2) {
         this.addCriterion("description not between", value1, value2, "description");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceIsNull() {
         this.addCriterion("price is null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceIsNotNull() {
         this.addCriterion("price is not null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceEqualTo(Double value) {
         this.addCriterion("price =", value, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceNotEqualTo(Double value) {
         this.addCriterion("price <>", value, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceGreaterThan(Double value) {
         this.addCriterion("price >", value, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceGreaterThanOrEqualTo(Double value) {
         this.addCriterion("price >=", value, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceLessThan(Double value) {
         this.addCriterion("price <", value, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceLessThanOrEqualTo(Double value) {
         this.addCriterion("price <=", value, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceIn(List<Double> values) {
         this.addCriterion("price in", values, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceNotIn(List<Double> values) {
         this.addCriterion("price not in", values, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceBetween(Double value1, Double value2) {
         this.addCriterion("price between", value1, value2, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPriceNotBetween(Double value1, Double value2) {
         this.addCriterion("price not between", value1, value2, "price");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoIsNull() {
         this.addCriterion("photo is null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoIsNotNull() {
         this.addCriterion("photo is not null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoEqualTo(String value) {
         this.addCriterion("photo =", value, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoNotEqualTo(String value) {
         this.addCriterion("photo <>", value, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoGreaterThan(String value) {
         this.addCriterion("photo >", value, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoGreaterThanOrEqualTo(String value) {
         this.addCriterion("photo >=", value, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoLessThan(String value) {
         this.addCriterion("photo <", value, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoLessThanOrEqualTo(String value) {
         this.addCriterion("photo <=", value, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoLike(String value) {
         this.addCriterion("photo like", value, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoNotLike(String value) {
         this.addCriterion("photo not like", value, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoIn(List<String> values) {
         this.addCriterion("photo in", values, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoNotIn(List<String> values) {
         this.addCriterion("photo not in", values, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoBetween(String value1, String value2) {
         this.addCriterion("photo between", value1, value2, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andPhotoNotBetween(String value1, String value2) {
         this.addCriterion("photo not between", value1, value2, "photo");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdIsNull() {
         this.addCriterion("product_category_id is null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdIsNotNull() {
         this.addCriterion("product_category_id is not null");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdEqualTo(Long value) {
         this.addCriterion("product_category_id =", value, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdNotEqualTo(Long value) {
         this.addCriterion("product_category_id <>", value, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdGreaterThan(Long value) {
         this.addCriterion("product_category_id >", value, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("product_category_id >=", value, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdLessThan(Long value) {
         this.addCriterion("product_category_id <", value, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdLessThanOrEqualTo(Long value) {
         this.addCriterion("product_category_id <=", value, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdIn(List<Long> values) {
         this.addCriterion("product_category_id in", values, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdNotIn(List<Long> values) {
         this.addCriterion("product_category_id not in", values, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdBetween(Long value1, Long value2) {
         this.addCriterion("product_category_id between", value1, value2, "productCategoryId");
         return (ProductExample.Criteria)this;
      }

      public ProductExample.Criteria andProductCategoryIdNotBetween(Long value1, Long value2) {
         this.addCriterion("product_category_id not between", value1, value2, "productCategoryId");
         return (ProductExample.Criteria)this;
      }
   }
}
