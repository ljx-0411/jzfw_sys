package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountEmployeeExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<AccountEmployeeExample.Criteria> oredCriteria = new ArrayList();

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

   public List<AccountEmployeeExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(AccountEmployeeExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public AccountEmployeeExample.Criteria or() {
      AccountEmployeeExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public AccountEmployeeExample.Criteria createCriteria() {
      AccountEmployeeExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected AccountEmployeeExample.Criteria createCriteriaInternal() {
      AccountEmployeeExample.Criteria criteria = new AccountEmployeeExample.Criteria();
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

   public static class Criteria extends AccountEmployeeExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<AccountEmployeeExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<AccountEmployeeExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<AccountEmployeeExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new AccountEmployeeExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new AccountEmployeeExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new AccountEmployeeExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public AccountEmployeeExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyIsNull() {
         this.addCriterion("transfer_money is null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyIsNotNull() {
         this.addCriterion("transfer_money is not null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyEqualTo(Double value) {
         this.addCriterion("transfer_money =", value, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyNotEqualTo(Double value) {
         this.addCriterion("transfer_money <>", value, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyGreaterThan(Double value) {
         this.addCriterion("transfer_money >", value, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyGreaterThanOrEqualTo(Double value) {
         this.addCriterion("transfer_money >=", value, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyLessThan(Double value) {
         this.addCriterion("transfer_money <", value, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyLessThanOrEqualTo(Double value) {
         this.addCriterion("transfer_money <=", value, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyIn(List<Double> values) {
         this.addCriterion("transfer_money in", values, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyNotIn(List<Double> values) {
         this.addCriterion("transfer_money not in", values, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyBetween(Double value1, Double value2) {
         this.addCriterion("transfer_money between", value1, value2, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferMoneyNotBetween(Double value1, Double value2) {
         this.addCriterion("transfer_money not between", value1, value2, "transferMoney");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeIsNull() {
         this.addCriterion("transfer_time is null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeIsNotNull() {
         this.addCriterion("transfer_time is not null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeEqualTo(Long value) {
         this.addCriterion("transfer_time =", value, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeNotEqualTo(Long value) {
         this.addCriterion("transfer_time <>", value, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeGreaterThan(Long value) {
         this.addCriterion("transfer_time >", value, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("transfer_time >=", value, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeLessThan(Long value) {
         this.addCriterion("transfer_time <", value, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("transfer_time <=", value, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeIn(List<Long> values) {
         this.addCriterion("transfer_time in", values, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeNotIn(List<Long> values) {
         this.addCriterion("transfer_time not in", values, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeBetween(Long value1, Long value2) {
         this.addCriterion("transfer_time between", value1, value2, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTransferTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("transfer_time not between", value1, value2, "transferTime");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionIsNull() {
         this.addCriterion("description is null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionIsNotNull() {
         this.addCriterion("description is not null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionEqualTo(String value) {
         this.addCriterion("description =", value, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionNotEqualTo(String value) {
         this.addCriterion("description <>", value, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionGreaterThan(String value) {
         this.addCriterion("description >", value, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionGreaterThanOrEqualTo(String value) {
         this.addCriterion("description >=", value, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionLessThan(String value) {
         this.addCriterion("description <", value, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionLessThanOrEqualTo(String value) {
         this.addCriterion("description <=", value, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionLike(String value) {
         this.addCriterion("description like", value, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionNotLike(String value) {
         this.addCriterion("description not like", value, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionIn(List<String> values) {
         this.addCriterion("description in", values, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionNotIn(List<String> values) {
         this.addCriterion("description not in", values, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionBetween(String value1, String value2) {
         this.addCriterion("description between", value1, value2, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andDescriptionNotBetween(String value1, String value2) {
         this.addCriterion("description not between", value1, value2, "description");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeIsNull() {
         this.addCriterion("type is null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeIsNotNull() {
         this.addCriterion("type is not null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeEqualTo(String value) {
         this.addCriterion("type =", value, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeNotEqualTo(String value) {
         this.addCriterion("type <>", value, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeGreaterThan(String value) {
         this.addCriterion("type >", value, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
         this.addCriterion("type >=", value, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeLessThan(String value) {
         this.addCriterion("type <", value, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeLessThanOrEqualTo(String value) {
         this.addCriterion("type <=", value, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeLike(String value) {
         this.addCriterion("type like", value, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeNotLike(String value) {
         this.addCriterion("type not like", value, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeIn(List<String> values) {
         this.addCriterion("type in", values, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeNotIn(List<String> values) {
         this.addCriterion("type not in", values, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeBetween(String value1, String value2) {
         this.addCriterion("type between", value1, value2, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andTypeNotBetween(String value1, String value2) {
         this.addCriterion("type not between", value1, value2, "type");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdIsNull() {
         this.addCriterion("user_id is null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdIsNotNull() {
         this.addCriterion("user_id is not null");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdEqualTo(Long value) {
         this.addCriterion("user_id =", value, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdNotEqualTo(Long value) {
         this.addCriterion("user_id <>", value, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdGreaterThan(Long value) {
         this.addCriterion("user_id >", value, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("user_id >=", value, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdLessThan(Long value) {
         this.addCriterion("user_id <", value, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdLessThanOrEqualTo(Long value) {
         this.addCriterion("user_id <=", value, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdIn(List<Long> values) {
         this.addCriterion("user_id in", values, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdNotIn(List<Long> values) {
         this.addCriterion("user_id not in", values, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdBetween(Long value1, Long value2) {
         this.addCriterion("user_id between", value1, value2, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }

      public AccountEmployeeExample.Criteria andUserIdNotBetween(Long value1, Long value2) {
         this.addCriterion("user_id not between", value1, value2, "userId");
         return (AccountEmployeeExample.Criteria)this;
      }
   }
}
