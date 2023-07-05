package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountCustomerExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<AccountCustomerExample.Criteria> oredCriteria = new ArrayList();

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

   public List<AccountCustomerExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(AccountCustomerExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public AccountCustomerExample.Criteria or() {
      AccountCustomerExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public AccountCustomerExample.Criteria createCriteria() {
      AccountCustomerExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected AccountCustomerExample.Criteria createCriteriaInternal() {
      AccountCustomerExample.Criteria criteria = new AccountCustomerExample.Criteria();
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

   public static class Criteria extends AccountCustomerExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<AccountCustomerExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<AccountCustomerExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<AccountCustomerExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new AccountCustomerExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new AccountCustomerExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new AccountCustomerExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public AccountCustomerExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyIsNull() {
         this.addCriterion("transfer_money is null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyIsNotNull() {
         this.addCriterion("transfer_money is not null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyEqualTo(Double value) {
         this.addCriterion("transfer_money =", value, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyNotEqualTo(Double value) {
         this.addCriterion("transfer_money <>", value, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyGreaterThan(Double value) {
         this.addCriterion("transfer_money >", value, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyGreaterThanOrEqualTo(Double value) {
         this.addCriterion("transfer_money >=", value, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyLessThan(Double value) {
         this.addCriterion("transfer_money <", value, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyLessThanOrEqualTo(Double value) {
         this.addCriterion("transfer_money <=", value, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyIn(List<Double> values) {
         this.addCriterion("transfer_money in", values, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyNotIn(List<Double> values) {
         this.addCriterion("transfer_money not in", values, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyBetween(Double value1, Double value2) {
         this.addCriterion("transfer_money between", value1, value2, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferMoneyNotBetween(Double value1, Double value2) {
         this.addCriterion("transfer_money not between", value1, value2, "transferMoney");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeIsNull() {
         this.addCriterion("transfer_time is null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeIsNotNull() {
         this.addCriterion("transfer_time is not null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeEqualTo(Long value) {
         this.addCriterion("transfer_time =", value, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeNotEqualTo(Long value) {
         this.addCriterion("transfer_time <>", value, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeGreaterThan(Long value) {
         this.addCriterion("transfer_time >", value, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("transfer_time >=", value, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeLessThan(Long value) {
         this.addCriterion("transfer_time <", value, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("transfer_time <=", value, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeIn(List<Long> values) {
         this.addCriterion("transfer_time in", values, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeNotIn(List<Long> values) {
         this.addCriterion("transfer_time not in", values, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeBetween(Long value1, Long value2) {
         this.addCriterion("transfer_time between", value1, value2, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTransferTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("transfer_time not between", value1, value2, "transferTime");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionIsNull() {
         this.addCriterion("description is null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionIsNotNull() {
         this.addCriterion("description is not null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionEqualTo(String value) {
         this.addCriterion("description =", value, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionNotEqualTo(String value) {
         this.addCriterion("description <>", value, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionGreaterThan(String value) {
         this.addCriterion("description >", value, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionGreaterThanOrEqualTo(String value) {
         this.addCriterion("description >=", value, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionLessThan(String value) {
         this.addCriterion("description <", value, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionLessThanOrEqualTo(String value) {
         this.addCriterion("description <=", value, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionLike(String value) {
         this.addCriterion("description like", value, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionNotLike(String value) {
         this.addCriterion("description not like", value, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionIn(List<String> values) {
         this.addCriterion("description in", values, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionNotIn(List<String> values) {
         this.addCriterion("description not in", values, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionBetween(String value1, String value2) {
         this.addCriterion("description between", value1, value2, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andDescriptionNotBetween(String value1, String value2) {
         this.addCriterion("description not between", value1, value2, "description");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeIsNull() {
         this.addCriterion("type is null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeIsNotNull() {
         this.addCriterion("type is not null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeEqualTo(String value) {
         this.addCriterion("type =", value, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeNotEqualTo(String value) {
         this.addCriterion("type <>", value, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeGreaterThan(String value) {
         this.addCriterion("type >", value, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
         this.addCriterion("type >=", value, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeLessThan(String value) {
         this.addCriterion("type <", value, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeLessThanOrEqualTo(String value) {
         this.addCriterion("type <=", value, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeLike(String value) {
         this.addCriterion("type like", value, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeNotLike(String value) {
         this.addCriterion("type not like", value, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeIn(List<String> values) {
         this.addCriterion("type in", values, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeNotIn(List<String> values) {
         this.addCriterion("type not in", values, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeBetween(String value1, String value2) {
         this.addCriterion("type between", value1, value2, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andTypeNotBetween(String value1, String value2) {
         this.addCriterion("type not between", value1, value2, "type");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdIsNull() {
         this.addCriterion("user_id is null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdIsNotNull() {
         this.addCriterion("user_id is not null");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdEqualTo(Long value) {
         this.addCriterion("user_id =", value, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdNotEqualTo(Long value) {
         this.addCriterion("user_id <>", value, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdGreaterThan(Long value) {
         this.addCriterion("user_id >", value, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("user_id >=", value, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdLessThan(Long value) {
         this.addCriterion("user_id <", value, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdLessThanOrEqualTo(Long value) {
         this.addCriterion("user_id <=", value, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdIn(List<Long> values) {
         this.addCriterion("user_id in", values, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdNotIn(List<Long> values) {
         this.addCriterion("user_id not in", values, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdBetween(Long value1, Long value2) {
         this.addCriterion("user_id between", value1, value2, "userId");
         return (AccountCustomerExample.Criteria)this;
      }

      public AccountCustomerExample.Criteria andUserIdNotBetween(Long value1, Long value2) {
         this.addCriterion("user_id not between", value1, value2, "userId");
         return (AccountCustomerExample.Criteria)this;
      }
   }
}
