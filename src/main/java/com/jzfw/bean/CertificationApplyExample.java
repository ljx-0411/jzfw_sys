package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class CertificationApplyExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<CertificationApplyExample.Criteria> oredCriteria = new ArrayList();

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

   public List<CertificationApplyExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(CertificationApplyExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public CertificationApplyExample.Criteria or() {
      CertificationApplyExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public CertificationApplyExample.Criteria createCriteria() {
      CertificationApplyExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected CertificationApplyExample.Criteria createCriteriaInternal() {
      CertificationApplyExample.Criteria criteria = new CertificationApplyExample.Criteria();
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

   public static class Criteria extends CertificationApplyExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<CertificationApplyExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<CertificationApplyExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<CertificationApplyExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new CertificationApplyExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new CertificationApplyExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new CertificationApplyExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public CertificationApplyExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameIsNull() {
         this.addCriterion("realname is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameIsNotNull() {
         this.addCriterion("realname is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameEqualTo(String value) {
         this.addCriterion("realname =", value, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameNotEqualTo(String value) {
         this.addCriterion("realname <>", value, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameGreaterThan(String value) {
         this.addCriterion("realname >", value, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameGreaterThanOrEqualTo(String value) {
         this.addCriterion("realname >=", value, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameLessThan(String value) {
         this.addCriterion("realname <", value, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameLessThanOrEqualTo(String value) {
         this.addCriterion("realname <=", value, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameLike(String value) {
         this.addCriterion("realname like", value, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameNotLike(String value) {
         this.addCriterion("realname not like", value, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameIn(List<String> values) {
         this.addCriterion("realname in", values, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameNotIn(List<String> values) {
         this.addCriterion("realname not in", values, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameBetween(String value1, String value2) {
         this.addCriterion("realname between", value1, value2, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andRealnameNotBetween(String value1, String value2) {
         this.addCriterion("realname not between", value1, value2, "realname");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardIsNull() {
         this.addCriterion("id_card is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardIsNotNull() {
         this.addCriterion("id_card is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardEqualTo(String value) {
         this.addCriterion("id_card =", value, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardNotEqualTo(String value) {
         this.addCriterion("id_card <>", value, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardGreaterThan(String value) {
         this.addCriterion("id_card >", value, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardGreaterThanOrEqualTo(String value) {
         this.addCriterion("id_card >=", value, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardLessThan(String value) {
         this.addCriterion("id_card <", value, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardLessThanOrEqualTo(String value) {
         this.addCriterion("id_card <=", value, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardLike(String value) {
         this.addCriterion("id_card like", value, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardNotLike(String value) {
         this.addCriterion("id_card not like", value, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardIn(List<String> values) {
         this.addCriterion("id_card in", values, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardNotIn(List<String> values) {
         this.addCriterion("id_card not in", values, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardBetween(String value1, String value2) {
         this.addCriterion("id_card between", value1, value2, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdCardNotBetween(String value1, String value2) {
         this.addCriterion("id_card not between", value1, value2, "idCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveIsNull() {
         this.addCriterion("idcard_photo_positive is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveIsNotNull() {
         this.addCriterion("idcard_photo_positive is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveEqualTo(String value) {
         this.addCriterion("idcard_photo_positive =", value, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveNotEqualTo(String value) {
         this.addCriterion("idcard_photo_positive <>", value, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveGreaterThan(String value) {
         this.addCriterion("idcard_photo_positive >", value, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveGreaterThanOrEqualTo(String value) {
         this.addCriterion("idcard_photo_positive >=", value, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveLessThan(String value) {
         this.addCriterion("idcard_photo_positive <", value, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveLessThanOrEqualTo(String value) {
         this.addCriterion("idcard_photo_positive <=", value, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveLike(String value) {
         this.addCriterion("idcard_photo_positive like", value, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveNotLike(String value) {
         this.addCriterion("idcard_photo_positive not like", value, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveIn(List<String> values) {
         this.addCriterion("idcard_photo_positive in", values, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveNotIn(List<String> values) {
         this.addCriterion("idcard_photo_positive not in", values, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveBetween(String value1, String value2) {
         this.addCriterion("idcard_photo_positive between", value1, value2, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoPositiveNotBetween(String value1, String value2) {
         this.addCriterion("idcard_photo_positive not between", value1, value2, "idcardPhotoPositive");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeIsNull() {
         this.addCriterion("idcard_photo_negative is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeIsNotNull() {
         this.addCriterion("idcard_photo_negative is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeEqualTo(String value) {
         this.addCriterion("idcard_photo_negative =", value, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeNotEqualTo(String value) {
         this.addCriterion("idcard_photo_negative <>", value, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeGreaterThan(String value) {
         this.addCriterion("idcard_photo_negative >", value, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeGreaterThanOrEqualTo(String value) {
         this.addCriterion("idcard_photo_negative >=", value, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeLessThan(String value) {
         this.addCriterion("idcard_photo_negative <", value, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeLessThanOrEqualTo(String value) {
         this.addCriterion("idcard_photo_negative <=", value, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeLike(String value) {
         this.addCriterion("idcard_photo_negative like", value, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeNotLike(String value) {
         this.addCriterion("idcard_photo_negative not like", value, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeIn(List<String> values) {
         this.addCriterion("idcard_photo_negative in", values, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeNotIn(List<String> values) {
         this.addCriterion("idcard_photo_negative not in", values, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeBetween(String value1, String value2) {
         this.addCriterion("idcard_photo_negative between", value1, value2, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andIdcardPhotoNegativeNotBetween(String value1, String value2) {
         this.addCriterion("idcard_photo_negative not between", value1, value2, "idcardPhotoNegative");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardIsNull() {
         this.addCriterion("bank_card is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardIsNotNull() {
         this.addCriterion("bank_card is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardEqualTo(String value) {
         this.addCriterion("bank_card =", value, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardNotEqualTo(String value) {
         this.addCriterion("bank_card <>", value, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardGreaterThan(String value) {
         this.addCriterion("bank_card >", value, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardGreaterThanOrEqualTo(String value) {
         this.addCriterion("bank_card >=", value, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardLessThan(String value) {
         this.addCriterion("bank_card <", value, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardLessThanOrEqualTo(String value) {
         this.addCriterion("bank_card <=", value, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardLike(String value) {
         this.addCriterion("bank_card like", value, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardNotLike(String value) {
         this.addCriterion("bank_card not like", value, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardIn(List<String> values) {
         this.addCriterion("bank_card in", values, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardNotIn(List<String> values) {
         this.addCriterion("bank_card not in", values, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardBetween(String value1, String value2) {
         this.addCriterion("bank_card between", value1, value2, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardNotBetween(String value1, String value2) {
         this.addCriterion("bank_card not between", value1, value2, "bankCard");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoIsNull() {
         this.addCriterion("bank_card_photo is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoIsNotNull() {
         this.addCriterion("bank_card_photo is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoEqualTo(String value) {
         this.addCriterion("bank_card_photo =", value, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoNotEqualTo(String value) {
         this.addCriterion("bank_card_photo <>", value, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoGreaterThan(String value) {
         this.addCriterion("bank_card_photo >", value, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoGreaterThanOrEqualTo(String value) {
         this.addCriterion("bank_card_photo >=", value, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoLessThan(String value) {
         this.addCriterion("bank_card_photo <", value, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoLessThanOrEqualTo(String value) {
         this.addCriterion("bank_card_photo <=", value, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoLike(String value) {
         this.addCriterion("bank_card_photo like", value, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoNotLike(String value) {
         this.addCriterion("bank_card_photo not like", value, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoIn(List<String> values) {
         this.addCriterion("bank_card_photo in", values, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoNotIn(List<String> values) {
         this.addCriterion("bank_card_photo not in", values, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoBetween(String value1, String value2) {
         this.addCriterion("bank_card_photo between", value1, value2, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andBankCardPhotoNotBetween(String value1, String value2) {
         this.addCriterion("bank_card_photo not between", value1, value2, "bankCardPhoto");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeIsNull() {
         this.addCriterion("apply_time is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeIsNotNull() {
         this.addCriterion("apply_time is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeEqualTo(Long value) {
         this.addCriterion("apply_time =", value, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeNotEqualTo(Long value) {
         this.addCriterion("apply_time <>", value, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeGreaterThan(Long value) {
         this.addCriterion("apply_time >", value, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("apply_time >=", value, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeLessThan(Long value) {
         this.addCriterion("apply_time <", value, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("apply_time <=", value, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeIn(List<Long> values) {
         this.addCriterion("apply_time in", values, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeNotIn(List<Long> values) {
         this.addCriterion("apply_time not in", values, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeBetween(Long value1, Long value2) {
         this.addCriterion("apply_time between", value1, value2, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andApplyTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("apply_time not between", value1, value2, "applyTime");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonIsNull() {
         this.addCriterion("reason is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonIsNotNull() {
         this.addCriterion("reason is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonEqualTo(String value) {
         this.addCriterion("reason =", value, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonNotEqualTo(String value) {
         this.addCriterion("reason <>", value, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonGreaterThan(String value) {
         this.addCriterion("reason >", value, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonGreaterThanOrEqualTo(String value) {
         this.addCriterion("reason >=", value, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonLessThan(String value) {
         this.addCriterion("reason <", value, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonLessThanOrEqualTo(String value) {
         this.addCriterion("reason <=", value, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonLike(String value) {
         this.addCriterion("reason like", value, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonNotLike(String value) {
         this.addCriterion("reason not like", value, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonIn(List<String> values) {
         this.addCriterion("reason in", values, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonNotIn(List<String> values) {
         this.addCriterion("reason not in", values, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonBetween(String value1, String value2) {
         this.addCriterion("reason between", value1, value2, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andReasonNotBetween(String value1, String value2) {
         this.addCriterion("reason not between", value1, value2, "reason");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdIsNull() {
         this.addCriterion("user_id is null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdIsNotNull() {
         this.addCriterion("user_id is not null");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdEqualTo(Long value) {
         this.addCriterion("user_id =", value, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdNotEqualTo(Long value) {
         this.addCriterion("user_id <>", value, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdGreaterThan(Long value) {
         this.addCriterion("user_id >", value, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("user_id >=", value, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdLessThan(Long value) {
         this.addCriterion("user_id <", value, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdLessThanOrEqualTo(Long value) {
         this.addCriterion("user_id <=", value, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdIn(List<Long> values) {
         this.addCriterion("user_id in", values, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdNotIn(List<Long> values) {
         this.addCriterion("user_id not in", values, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdBetween(Long value1, Long value2) {
         this.addCriterion("user_id between", value1, value2, "userId");
         return (CertificationApplyExample.Criteria)this;
      }

      public CertificationApplyExample.Criteria andUserIdNotBetween(Long value1, Long value2) {
         this.addCriterion("user_id not between", value1, value2, "userId");
         return (CertificationApplyExample.Criteria)this;
      }
   }
}
