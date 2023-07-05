package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountSystemExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<AccountSystemExample.Criteria> oredCriteria = new ArrayList();

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

   public List<AccountSystemExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(AccountSystemExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public AccountSystemExample.Criteria or() {
      AccountSystemExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public AccountSystemExample.Criteria createCriteria() {
      AccountSystemExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected AccountSystemExample.Criteria createCriteriaInternal() {
      AccountSystemExample.Criteria criteria = new AccountSystemExample.Criteria();
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

   public static class Criteria extends AccountSystemExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<AccountSystemExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<AccountSystemExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<AccountSystemExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new AccountSystemExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new AccountSystemExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new AccountSystemExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public AccountSystemExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyIsNull() {
         this.addCriterion("transfer_money is null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyIsNotNull() {
         this.addCriterion("transfer_money is not null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyEqualTo(Double value) {
         this.addCriterion("transfer_money =", value, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyNotEqualTo(Double value) {
         this.addCriterion("transfer_money <>", value, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyGreaterThan(Double value) {
         this.addCriterion("transfer_money >", value, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyGreaterThanOrEqualTo(Double value) {
         this.addCriterion("transfer_money >=", value, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyLessThan(Double value) {
         this.addCriterion("transfer_money <", value, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyLessThanOrEqualTo(Double value) {
         this.addCriterion("transfer_money <=", value, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyIn(List<Double> values) {
         this.addCriterion("transfer_money in", values, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyNotIn(List<Double> values) {
         this.addCriterion("transfer_money not in", values, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyBetween(Double value1, Double value2) {
         this.addCriterion("transfer_money between", value1, value2, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferMoneyNotBetween(Double value1, Double value2) {
         this.addCriterion("transfer_money not between", value1, value2, "transferMoney");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeIsNull() {
         this.addCriterion("transfer_time is null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeIsNotNull() {
         this.addCriterion("transfer_time is not null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeEqualTo(Long value) {
         this.addCriterion("transfer_time =", value, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeNotEqualTo(Long value) {
         this.addCriterion("transfer_time <>", value, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeGreaterThan(Long value) {
         this.addCriterion("transfer_time >", value, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("transfer_time >=", value, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeLessThan(Long value) {
         this.addCriterion("transfer_time <", value, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("transfer_time <=", value, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeIn(List<Long> values) {
         this.addCriterion("transfer_time in", values, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeNotIn(List<Long> values) {
         this.addCriterion("transfer_time not in", values, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeBetween(Long value1, Long value2) {
         this.addCriterion("transfer_time between", value1, value2, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTransferTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("transfer_time not between", value1, value2, "transferTime");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionIsNull() {
         this.addCriterion("description is null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionIsNotNull() {
         this.addCriterion("description is not null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionEqualTo(String value) {
         this.addCriterion("description =", value, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionNotEqualTo(String value) {
         this.addCriterion("description <>", value, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionGreaterThan(String value) {
         this.addCriterion("description >", value, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionGreaterThanOrEqualTo(String value) {
         this.addCriterion("description >=", value, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionLessThan(String value) {
         this.addCriterion("description <", value, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionLessThanOrEqualTo(String value) {
         this.addCriterion("description <=", value, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionLike(String value) {
         this.addCriterion("description like", value, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionNotLike(String value) {
         this.addCriterion("description not like", value, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionIn(List<String> values) {
         this.addCriterion("description in", values, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionNotIn(List<String> values) {
         this.addCriterion("description not in", values, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionBetween(String value1, String value2) {
         this.addCriterion("description between", value1, value2, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andDescriptionNotBetween(String value1, String value2) {
         this.addCriterion("description not between", value1, value2, "description");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeIsNull() {
         this.addCriterion("type is null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeIsNotNull() {
         this.addCriterion("type is not null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeEqualTo(String value) {
         this.addCriterion("type =", value, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeNotEqualTo(String value) {
         this.addCriterion("type <>", value, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeGreaterThan(String value) {
         this.addCriterion("type >", value, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
         this.addCriterion("type >=", value, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeLessThan(String value) {
         this.addCriterion("type <", value, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeLessThanOrEqualTo(String value) {
         this.addCriterion("type <=", value, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeLike(String value) {
         this.addCriterion("type like", value, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeNotLike(String value) {
         this.addCriterion("type not like", value, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeIn(List<String> values) {
         this.addCriterion("type in", values, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeNotIn(List<String> values) {
         this.addCriterion("type not in", values, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeBetween(String value1, String value2) {
         this.addCriterion("type between", value1, value2, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andTypeNotBetween(String value1, String value2) {
         this.addCriterion("type not between", value1, value2, "type");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (AccountSystemExample.Criteria)this;
      }

      public AccountSystemExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (AccountSystemExample.Criteria)this;
      }
   }
}
