package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<OrderExample.Criteria> oredCriteria = new ArrayList();

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

   public List<OrderExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(OrderExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public OrderExample.Criteria or() {
      OrderExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public OrderExample.Criteria createCriteria() {
      OrderExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected OrderExample.Criteria createCriteriaInternal() {
      OrderExample.Criteria criteria = new OrderExample.Criteria();
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

   public static class Criteria extends OrderExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<OrderExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<OrderExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<OrderExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new OrderExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new OrderExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new OrderExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public OrderExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeIsNull() {
         this.addCriterion("order_time is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeIsNotNull() {
         this.addCriterion("order_time is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeEqualTo(Long value) {
         this.addCriterion("order_time =", value, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeNotEqualTo(Long value) {
         this.addCriterion("order_time <>", value, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeGreaterThan(Long value) {
         this.addCriterion("order_time >", value, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("order_time >=", value, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeLessThan(Long value) {
         this.addCriterion("order_time <", value, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("order_time <=", value, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeIn(List<Long> values) {
         this.addCriterion("order_time in", values, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeNotIn(List<Long> values) {
         this.addCriterion("order_time not in", values, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeBetween(Long value1, Long value2) {
         this.addCriterion("order_time between", value1, value2, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andOrderTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("order_time not between", value1, value2, "orderTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeIsNull() {
         this.addCriterion("service_time is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeIsNotNull() {
         this.addCriterion("service_time is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeEqualTo(Long value) {
         this.addCriterion("service_time =", value, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeNotEqualTo(Long value) {
         this.addCriterion("service_time <>", value, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeGreaterThan(Long value) {
         this.addCriterion("service_time >", value, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("service_time >=", value, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeLessThan(Long value) {
         this.addCriterion("service_time <", value, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("service_time <=", value, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeIn(List<Long> values) {
         this.addCriterion("service_time in", values, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeNotIn(List<Long> values) {
         this.addCriterion("service_time not in", values, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeBetween(Long value1, Long value2) {
         this.addCriterion("service_time between", value1, value2, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andServiceTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("service_time not between", value1, value2, "serviceTime");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalIsNull() {
         this.addCriterion("total is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalIsNotNull() {
         this.addCriterion("total is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalEqualTo(Double value) {
         this.addCriterion("total =", value, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalNotEqualTo(Double value) {
         this.addCriterion("total <>", value, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalGreaterThan(Double value) {
         this.addCriterion("total >", value, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalGreaterThanOrEqualTo(Double value) {
         this.addCriterion("total >=", value, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalLessThan(Double value) {
         this.addCriterion("total <", value, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalLessThanOrEqualTo(Double value) {
         this.addCriterion("total <=", value, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalIn(List<Double> values) {
         this.addCriterion("total in", values, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalNotIn(List<Double> values) {
         this.addCriterion("total not in", values, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalBetween(Double value1, Double value2) {
         this.addCriterion("total between", value1, value2, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andTotalNotBetween(Double value1, Double value2) {
         this.addCriterion("total not between", value1, value2, "total");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkIsNull() {
         this.addCriterion("remark is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkIsNotNull() {
         this.addCriterion("remark is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkEqualTo(String value) {
         this.addCriterion("remark =", value, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkNotEqualTo(String value) {
         this.addCriterion("remark <>", value, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkGreaterThan(String value) {
         this.addCriterion("remark >", value, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkGreaterThanOrEqualTo(String value) {
         this.addCriterion("remark >=", value, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkLessThan(String value) {
         this.addCriterion("remark <", value, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkLessThanOrEqualTo(String value) {
         this.addCriterion("remark <=", value, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkLike(String value) {
         this.addCriterion("remark like", value, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkNotLike(String value) {
         this.addCriterion("remark not like", value, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkIn(List<String> values) {
         this.addCriterion("remark in", values, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkNotIn(List<String> values) {
         this.addCriterion("remark not in", values, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkBetween(String value1, String value2) {
         this.addCriterion("remark between", value1, value2, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andRemarkNotBetween(String value1, String value2) {
         this.addCriterion("remark not between", value1, value2, "remark");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdIsNull() {
         this.addCriterion("customer_id is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdIsNotNull() {
         this.addCriterion("customer_id is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdEqualTo(Long value) {
         this.addCriterion("customer_id =", value, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdNotEqualTo(Long value) {
         this.addCriterion("customer_id <>", value, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdGreaterThan(Long value) {
         this.addCriterion("customer_id >", value, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("customer_id >=", value, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdLessThan(Long value) {
         this.addCriterion("customer_id <", value, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdLessThanOrEqualTo(Long value) {
         this.addCriterion("customer_id <=", value, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdIn(List<Long> values) {
         this.addCriterion("customer_id in", values, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdNotIn(List<Long> values) {
         this.addCriterion("customer_id not in", values, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdBetween(Long value1, Long value2) {
         this.addCriterion("customer_id between", value1, value2, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andCustomerIdNotBetween(Long value1, Long value2) {
         this.addCriterion("customer_id not between", value1, value2, "customerId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdIsNull() {
         this.addCriterion("address_id is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdIsNotNull() {
         this.addCriterion("address_id is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdEqualTo(Long value) {
         this.addCriterion("address_id =", value, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdNotEqualTo(Long value) {
         this.addCriterion("address_id <>", value, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdGreaterThan(Long value) {
         this.addCriterion("address_id >", value, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("address_id >=", value, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdLessThan(Long value) {
         this.addCriterion("address_id <", value, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdLessThanOrEqualTo(Long value) {
         this.addCriterion("address_id <=", value, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdIn(List<Long> values) {
         this.addCriterion("address_id in", values, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdNotIn(List<Long> values) {
         this.addCriterion("address_id not in", values, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdBetween(Long value1, Long value2) {
         this.addCriterion("address_id between", value1, value2, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andAddressIdNotBetween(Long value1, Long value2) {
         this.addCriterion("address_id not between", value1, value2, "addressId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdIsNull() {
         this.addCriterion("employee_id is null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdIsNotNull() {
         this.addCriterion("employee_id is not null");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdEqualTo(Long value) {
         this.addCriterion("employee_id =", value, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdNotEqualTo(Long value) {
         this.addCriterion("employee_id <>", value, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdGreaterThan(Long value) {
         this.addCriterion("employee_id >", value, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("employee_id >=", value, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdLessThan(Long value) {
         this.addCriterion("employee_id <", value, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdLessThanOrEqualTo(Long value) {
         this.addCriterion("employee_id <=", value, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdIn(List<Long> values) {
         this.addCriterion("employee_id in", values, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdNotIn(List<Long> values) {
         this.addCriterion("employee_id not in", values, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdBetween(Long value1, Long value2) {
         this.addCriterion("employee_id between", value1, value2, "employeeId");
         return (OrderExample.Criteria)this;
      }

      public OrderExample.Criteria andEmployeeIdNotBetween(Long value1, Long value2) {
         this.addCriterion("employee_id not between", value1, value2, "employeeId");
         return (OrderExample.Criteria)this;
      }
   }
}
