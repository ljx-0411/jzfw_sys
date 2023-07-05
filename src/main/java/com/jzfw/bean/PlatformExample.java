package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class PlatformExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<PlatformExample.Criteria> oredCriteria = new ArrayList();

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

   public List<PlatformExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(PlatformExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public PlatformExample.Criteria or() {
      PlatformExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public PlatformExample.Criteria createCriteria() {
      PlatformExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected PlatformExample.Criteria createCriteriaInternal() {
      PlatformExample.Criteria criteria = new PlatformExample.Criteria();
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

   public static class Criteria extends PlatformExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<PlatformExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<PlatformExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<PlatformExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new PlatformExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new PlatformExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new PlatformExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public PlatformExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceIsNull() {
         this.addCriterion("balance is null");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceIsNotNull() {
         this.addCriterion("balance is not null");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceEqualTo(Double value) {
         this.addCriterion("balance =", value, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceNotEqualTo(Double value) {
         this.addCriterion("balance <>", value, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceGreaterThan(Double value) {
         this.addCriterion("balance >", value, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceGreaterThanOrEqualTo(Double value) {
         this.addCriterion("balance >=", value, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceLessThan(Double value) {
         this.addCriterion("balance <", value, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceLessThanOrEqualTo(Double value) {
         this.addCriterion("balance <=", value, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceIn(List<Double> values) {
         this.addCriterion("balance in", values, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceNotIn(List<Double> values) {
         this.addCriterion("balance not in", values, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceBetween(Double value1, Double value2) {
         this.addCriterion("balance between", value1, value2, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBalanceNotBetween(Double value1, Double value2) {
         this.addCriterion("balance not between", value1, value2, "balance");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardIsNull() {
         this.addCriterion("bank_card is null");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardIsNotNull() {
         this.addCriterion("bank_card is not null");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardEqualTo(String value) {
         this.addCriterion("bank_card =", value, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardNotEqualTo(String value) {
         this.addCriterion("bank_card <>", value, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardGreaterThan(String value) {
         this.addCriterion("bank_card >", value, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardGreaterThanOrEqualTo(String value) {
         this.addCriterion("bank_card >=", value, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardLessThan(String value) {
         this.addCriterion("bank_card <", value, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardLessThanOrEqualTo(String value) {
         this.addCriterion("bank_card <=", value, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardLike(String value) {
         this.addCriterion("bank_card like", value, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardNotLike(String value) {
         this.addCriterion("bank_card not like", value, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardIn(List<String> values) {
         this.addCriterion("bank_card in", values, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardNotIn(List<String> values) {
         this.addCriterion("bank_card not in", values, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardBetween(String value1, String value2) {
         this.addCriterion("bank_card between", value1, value2, "bankCard");
         return (PlatformExample.Criteria)this;
      }

      public PlatformExample.Criteria andBankCardNotBetween(String value1, String value2) {
         this.addCriterion("bank_card not between", value1, value2, "bankCard");
         return (PlatformExample.Criteria)this;
      }
   }
}
