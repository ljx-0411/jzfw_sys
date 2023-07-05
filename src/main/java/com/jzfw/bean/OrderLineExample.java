package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderLineExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<OrderLineExample.Criteria> oredCriteria = new ArrayList();

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

   public List<OrderLineExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(OrderLineExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public OrderLineExample.Criteria or() {
      OrderLineExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public OrderLineExample.Criteria createCriteria() {
      OrderLineExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected OrderLineExample.Criteria createCriteriaInternal() {
      OrderLineExample.Criteria criteria = new OrderLineExample.Criteria();
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

   public static class Criteria extends OrderLineExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<OrderLineExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<OrderLineExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<OrderLineExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new OrderLineExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new OrderLineExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new OrderLineExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public OrderLineExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberIsNull() {
         this.addCriterion("number is null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberIsNotNull() {
         this.addCriterion("number is not null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberEqualTo(Integer value) {
         this.addCriterion("number =", value, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberNotEqualTo(Integer value) {
         this.addCriterion("number <>", value, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberGreaterThan(Integer value) {
         this.addCriterion("number >", value, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("number >=", value, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberLessThan(Integer value) {
         this.addCriterion("number <", value, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberLessThanOrEqualTo(Integer value) {
         this.addCriterion("number <=", value, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberIn(List<Integer> values) {
         this.addCriterion("number in", values, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberNotIn(List<Integer> values) {
         this.addCriterion("number not in", values, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberBetween(Integer value1, Integer value2) {
         this.addCriterion("number between", value1, value2, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andNumberNotBetween(Integer value1, Integer value2) {
         this.addCriterion("number not between", value1, value2, "number");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceIsNull() {
         this.addCriterion("price is null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceIsNotNull() {
         this.addCriterion("price is not null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceEqualTo(Double value) {
         this.addCriterion("price =", value, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceNotEqualTo(Double value) {
         this.addCriterion("price <>", value, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceGreaterThan(Double value) {
         this.addCriterion("price >", value, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceGreaterThanOrEqualTo(Double value) {
         this.addCriterion("price >=", value, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceLessThan(Double value) {
         this.addCriterion("price <", value, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceLessThanOrEqualTo(Double value) {
         this.addCriterion("price <=", value, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceIn(List<Double> values) {
         this.addCriterion("price in", values, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceNotIn(List<Double> values) {
         this.addCriterion("price not in", values, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceBetween(Double value1, Double value2) {
         this.addCriterion("price between", value1, value2, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andPriceNotBetween(Double value1, Double value2) {
         this.addCriterion("price not between", value1, value2, "price");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdIsNull() {
         this.addCriterion("product_id is null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdIsNotNull() {
         this.addCriterion("product_id is not null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdEqualTo(Long value) {
         this.addCriterion("product_id =", value, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdNotEqualTo(Long value) {
         this.addCriterion("product_id <>", value, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdGreaterThan(Long value) {
         this.addCriterion("product_id >", value, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("product_id >=", value, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdLessThan(Long value) {
         this.addCriterion("product_id <", value, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdLessThanOrEqualTo(Long value) {
         this.addCriterion("product_id <=", value, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdIn(List<Long> values) {
         this.addCriterion("product_id in", values, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdNotIn(List<Long> values) {
         this.addCriterion("product_id not in", values, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdBetween(Long value1, Long value2) {
         this.addCriterion("product_id between", value1, value2, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andProductIdNotBetween(Long value1, Long value2) {
         this.addCriterion("product_id not between", value1, value2, "productId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdIsNull() {
         this.addCriterion("order_id is null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdIsNotNull() {
         this.addCriterion("order_id is not null");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdEqualTo(Long value) {
         this.addCriterion("order_id =", value, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdNotEqualTo(Long value) {
         this.addCriterion("order_id <>", value, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdGreaterThan(Long value) {
         this.addCriterion("order_id >", value, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("order_id >=", value, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdLessThan(Long value) {
         this.addCriterion("order_id <", value, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdLessThanOrEqualTo(Long value) {
         this.addCriterion("order_id <=", value, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdIn(List<Long> values) {
         this.addCriterion("order_id in", values, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdNotIn(List<Long> values) {
         this.addCriterion("order_id not in", values, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdBetween(Long value1, Long value2) {
         this.addCriterion("order_id between", value1, value2, "orderId");
         return (OrderLineExample.Criteria)this;
      }

      public OrderLineExample.Criteria andOrderIdNotBetween(Long value1, Long value2) {
         this.addCriterion("order_id not between", value1, value2, "orderId");
         return (OrderLineExample.Criteria)this;
      }
   }
}
