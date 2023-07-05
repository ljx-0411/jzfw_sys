package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderCommentExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<OrderCommentExample.Criteria> oredCriteria = new ArrayList();

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

   public List<OrderCommentExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(OrderCommentExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public OrderCommentExample.Criteria or() {
      OrderCommentExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public OrderCommentExample.Criteria createCriteria() {
      OrderCommentExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected OrderCommentExample.Criteria createCriteriaInternal() {
      OrderCommentExample.Criteria criteria = new OrderCommentExample.Criteria();
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

   public static class Criteria extends OrderCommentExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<OrderCommentExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<OrderCommentExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<OrderCommentExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new OrderCommentExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new OrderCommentExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new OrderCommentExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public OrderCommentExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentIsNull() {
         this.addCriterion("content is null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentIsNotNull() {
         this.addCriterion("content is not null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentEqualTo(String value) {
         this.addCriterion("content =", value, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentNotEqualTo(String value) {
         this.addCriterion("content <>", value, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentGreaterThan(String value) {
         this.addCriterion("content >", value, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentGreaterThanOrEqualTo(String value) {
         this.addCriterion("content >=", value, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentLessThan(String value) {
         this.addCriterion("content <", value, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentLessThanOrEqualTo(String value) {
         this.addCriterion("content <=", value, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentLike(String value) {
         this.addCriterion("content like", value, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentNotLike(String value) {
         this.addCriterion("content not like", value, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentIn(List<String> values) {
         this.addCriterion("content in", values, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentNotIn(List<String> values) {
         this.addCriterion("content not in", values, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentBetween(String value1, String value2) {
         this.addCriterion("content between", value1, value2, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andContentNotBetween(String value1, String value2) {
         this.addCriterion("content not between", value1, value2, "content");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeIsNull() {
         this.addCriterion("comment_time is null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeIsNotNull() {
         this.addCriterion("comment_time is not null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeEqualTo(Long value) {
         this.addCriterion("comment_time =", value, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeNotEqualTo(Long value) {
         this.addCriterion("comment_time <>", value, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeGreaterThan(Long value) {
         this.addCriterion("comment_time >", value, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("comment_time >=", value, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeLessThan(Long value) {
         this.addCriterion("comment_time <", value, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("comment_time <=", value, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeIn(List<Long> values) {
         this.addCriterion("comment_time in", values, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeNotIn(List<Long> values) {
         this.addCriterion("comment_time not in", values, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeBetween(Long value1, Long value2) {
         this.addCriterion("comment_time between", value1, value2, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCommentTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("comment_time not between", value1, value2, "commentTime");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdIsNull() {
         this.addCriterion("order_id is null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdIsNotNull() {
         this.addCriterion("order_id is not null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdEqualTo(Long value) {
         this.addCriterion("order_id =", value, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdNotEqualTo(Long value) {
         this.addCriterion("order_id <>", value, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdGreaterThan(Long value) {
         this.addCriterion("order_id >", value, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("order_id >=", value, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdLessThan(Long value) {
         this.addCriterion("order_id <", value, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdLessThanOrEqualTo(Long value) {
         this.addCriterion("order_id <=", value, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdIn(List<Long> values) {
         this.addCriterion("order_id in", values, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdNotIn(List<Long> values) {
         this.addCriterion("order_id not in", values, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdBetween(Long value1, Long value2) {
         this.addCriterion("order_id between", value1, value2, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andOrderIdNotBetween(Long value1, Long value2) {
         this.addCriterion("order_id not between", value1, value2, "orderId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdIsNull() {
         this.addCriterion("customer_id is null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdIsNotNull() {
         this.addCriterion("customer_id is not null");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdEqualTo(Long value) {
         this.addCriterion("customer_id =", value, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdNotEqualTo(Long value) {
         this.addCriterion("customer_id <>", value, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdGreaterThan(Long value) {
         this.addCriterion("customer_id >", value, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("customer_id >=", value, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdLessThan(Long value) {
         this.addCriterion("customer_id <", value, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdLessThanOrEqualTo(Long value) {
         this.addCriterion("customer_id <=", value, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdIn(List<Long> values) {
         this.addCriterion("customer_id in", values, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdNotIn(List<Long> values) {
         this.addCriterion("customer_id not in", values, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdBetween(Long value1, Long value2) {
         this.addCriterion("customer_id between", value1, value2, "customerId");
         return (OrderCommentExample.Criteria)this;
      }

      public OrderCommentExample.Criteria andCustomerIdNotBetween(Long value1, Long value2) {
         this.addCriterion("customer_id not between", value1, value2, "customerId");
         return (OrderCommentExample.Criteria)this;
      }
   }
}
