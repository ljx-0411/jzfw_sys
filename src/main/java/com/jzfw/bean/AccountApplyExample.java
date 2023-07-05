package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class AccountApplyExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<AccountApplyExample.Criteria> oredCriteria = new ArrayList();

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

   public List<AccountApplyExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(AccountApplyExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public AccountApplyExample.Criteria or() {
      AccountApplyExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public AccountApplyExample.Criteria createCriteria() {
      AccountApplyExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected AccountApplyExample.Criteria createCriteriaInternal() {
      AccountApplyExample.Criteria criteria = new AccountApplyExample.Criteria();
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

   public static class Criteria extends AccountApplyExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<AccountApplyExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<AccountApplyExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<AccountApplyExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new AccountApplyExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new AccountApplyExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new AccountApplyExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public AccountApplyExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyIsNull() {
         this.addCriterion("money is null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyIsNotNull() {
         this.addCriterion("money is not null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyEqualTo(Double value) {
         this.addCriterion("money =", value, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyNotEqualTo(Double value) {
         this.addCriterion("money <>", value, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyGreaterThan(Double value) {
         this.addCriterion("money >", value, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyGreaterThanOrEqualTo(Double value) {
         this.addCriterion("money >=", value, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyLessThan(Double value) {
         this.addCriterion("money <", value, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyLessThanOrEqualTo(Double value) {
         this.addCriterion("money <=", value, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyIn(List<Double> values) {
         this.addCriterion("money in", values, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyNotIn(List<Double> values) {
         this.addCriterion("money not in", values, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyBetween(Double value1, Double value2) {
         this.addCriterion("money between", value1, value2, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andMoneyNotBetween(Double value1, Double value2) {
         this.addCriterion("money not between", value1, value2, "money");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeIsNull() {
         this.addCriterion("apply_type is null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeIsNotNull() {
         this.addCriterion("apply_type is not null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeEqualTo(String value) {
         this.addCriterion("apply_type =", value, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeNotEqualTo(String value) {
         this.addCriterion("apply_type <>", value, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeGreaterThan(String value) {
         this.addCriterion("apply_type >", value, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
         this.addCriterion("apply_type >=", value, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeLessThan(String value) {
         this.addCriterion("apply_type <", value, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeLessThanOrEqualTo(String value) {
         this.addCriterion("apply_type <=", value, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeLike(String value) {
         this.addCriterion("apply_type like", value, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeNotLike(String value) {
         this.addCriterion("apply_type not like", value, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeIn(List<String> values) {
         this.addCriterion("apply_type in", values, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeNotIn(List<String> values) {
         this.addCriterion("apply_type not in", values, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeBetween(String value1, String value2) {
         this.addCriterion("apply_type between", value1, value2, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTypeNotBetween(String value1, String value2) {
         this.addCriterion("apply_type not between", value1, value2, "applyType");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeIsNull() {
         this.addCriterion("apply_time is null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeIsNotNull() {
         this.addCriterion("apply_time is not null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeEqualTo(Long value) {
         this.addCriterion("apply_time =", value, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeNotEqualTo(Long value) {
         this.addCriterion("apply_time <>", value, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeGreaterThan(Long value) {
         this.addCriterion("apply_time >", value, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("apply_time >=", value, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeLessThan(Long value) {
         this.addCriterion("apply_time <", value, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("apply_time <=", value, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeIn(List<Long> values) {
         this.addCriterion("apply_time in", values, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeNotIn(List<Long> values) {
         this.addCriterion("apply_time not in", values, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeBetween(Long value1, Long value2) {
         this.addCriterion("apply_time between", value1, value2, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andApplyTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("apply_time not between", value1, value2, "applyTime");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdIsNull() {
         this.addCriterion("user_id is null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdIsNotNull() {
         this.addCriterion("user_id is not null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdEqualTo(Long value) {
         this.addCriterion("user_id =", value, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdNotEqualTo(Long value) {
         this.addCriterion("user_id <>", value, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdGreaterThan(Long value) {
         this.addCriterion("user_id >", value, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("user_id >=", value, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdLessThan(Long value) {
         this.addCriterion("user_id <", value, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdLessThanOrEqualTo(Long value) {
         this.addCriterion("user_id <=", value, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdIn(List<Long> values) {
         this.addCriterion("user_id in", values, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdNotIn(List<Long> values) {
         this.addCriterion("user_id not in", values, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdBetween(Long value1, Long value2) {
         this.addCriterion("user_id between", value1, value2, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andUserIdNotBetween(Long value1, Long value2) {
         this.addCriterion("user_id not between", value1, value2, "userId");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonIsNull() {
         this.addCriterion("reason is null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonIsNotNull() {
         this.addCriterion("reason is not null");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonEqualTo(String value) {
         this.addCriterion("reason =", value, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonNotEqualTo(String value) {
         this.addCriterion("reason <>", value, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonGreaterThan(String value) {
         this.addCriterion("reason >", value, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonGreaterThanOrEqualTo(String value) {
         this.addCriterion("reason >=", value, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonLessThan(String value) {
         this.addCriterion("reason <", value, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonLessThanOrEqualTo(String value) {
         this.addCriterion("reason <=", value, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonLike(String value) {
         this.addCriterion("reason like", value, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonNotLike(String value) {
         this.addCriterion("reason not like", value, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonIn(List<String> values) {
         this.addCriterion("reason in", values, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonNotIn(List<String> values) {
         this.addCriterion("reason not in", values, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonBetween(String value1, String value2) {
         this.addCriterion("reason between", value1, value2, "reason");
         return (AccountApplyExample.Criteria)this;
      }

      public AccountApplyExample.Criteria andReasonNotBetween(String value1, String value2) {
         this.addCriterion("reason not between", value1, value2, "reason");
         return (AccountApplyExample.Criteria)this;
      }
   }
}
