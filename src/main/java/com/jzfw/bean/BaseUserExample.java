package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseUserExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<BaseUserExample.Criteria> oredCriteria = new ArrayList();

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

   public List<BaseUserExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(BaseUserExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public BaseUserExample.Criteria or() {
      BaseUserExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public BaseUserExample.Criteria createCriteria() {
      BaseUserExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected BaseUserExample.Criteria createCriteriaInternal() {
      BaseUserExample.Criteria criteria = new BaseUserExample.Criteria();
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

   public static class Criteria extends BaseUserExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<BaseUserExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<BaseUserExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<BaseUserExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new BaseUserExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new BaseUserExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new BaseUserExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public BaseUserExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameIsNull() {
         this.addCriterion("username is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameIsNotNull() {
         this.addCriterion("username is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameEqualTo(String value) {
         this.addCriterion("username =", value, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameNotEqualTo(String value) {
         this.addCriterion("username <>", value, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameGreaterThan(String value) {
         this.addCriterion("username >", value, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameGreaterThanOrEqualTo(String value) {
         this.addCriterion("username >=", value, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameLessThan(String value) {
         this.addCriterion("username <", value, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameLessThanOrEqualTo(String value) {
         this.addCriterion("username <=", value, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameLike(String value) {
         this.addCriterion("username like", value, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameNotLike(String value) {
         this.addCriterion("username not like", value, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameIn(List<String> values) {
         this.addCriterion("username in", values, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameNotIn(List<String> values) {
         this.addCriterion("username not in", values, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameBetween(String value1, String value2) {
         this.addCriterion("username between", value1, value2, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUsernameNotBetween(String value1, String value2) {
         this.addCriterion("username not between", value1, value2, "username");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordIsNull() {
         this.addCriterion("password is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordIsNotNull() {
         this.addCriterion("password is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordEqualTo(String value) {
         this.addCriterion("password =", value, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordNotEqualTo(String value) {
         this.addCriterion("password <>", value, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordGreaterThan(String value) {
         this.addCriterion("password >", value, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordGreaterThanOrEqualTo(String value) {
         this.addCriterion("password >=", value, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordLessThan(String value) {
         this.addCriterion("password <", value, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordLessThanOrEqualTo(String value) {
         this.addCriterion("password <=", value, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordLike(String value) {
         this.addCriterion("password like", value, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordNotLike(String value) {
         this.addCriterion("password not like", value, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordIn(List<String> values) {
         this.addCriterion("password in", values, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordNotIn(List<String> values) {
         this.addCriterion("password not in", values, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordBetween(String value1, String value2) {
         this.addCriterion("password between", value1, value2, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andPasswordNotBetween(String value1, String value2) {
         this.addCriterion("password not between", value1, value2, "password");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneIsNull() {
         this.addCriterion("telephone is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneIsNotNull() {
         this.addCriterion("telephone is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneEqualTo(String value) {
         this.addCriterion("telephone =", value, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneNotEqualTo(String value) {
         this.addCriterion("telephone <>", value, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneGreaterThan(String value) {
         this.addCriterion("telephone >", value, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneGreaterThanOrEqualTo(String value) {
         this.addCriterion("telephone >=", value, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneLessThan(String value) {
         this.addCriterion("telephone <", value, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneLessThanOrEqualTo(String value) {
         this.addCriterion("telephone <=", value, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneLike(String value) {
         this.addCriterion("telephone like", value, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneNotLike(String value) {
         this.addCriterion("telephone not like", value, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneIn(List<String> values) {
         this.addCriterion("telephone in", values, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneNotIn(List<String> values) {
         this.addCriterion("telephone not in", values, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneBetween(String value1, String value2) {
         this.addCriterion("telephone between", value1, value2, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andTelephoneNotBetween(String value1, String value2) {
         this.addCriterion("telephone not between", value1, value2, "telephone");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameIsNull() {
         this.addCriterion("realname is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameIsNotNull() {
         this.addCriterion("realname is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameEqualTo(String value) {
         this.addCriterion("realname =", value, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameNotEqualTo(String value) {
         this.addCriterion("realname <>", value, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameGreaterThan(String value) {
         this.addCriterion("realname >", value, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameGreaterThanOrEqualTo(String value) {
         this.addCriterion("realname >=", value, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameLessThan(String value) {
         this.addCriterion("realname <", value, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameLessThanOrEqualTo(String value) {
         this.addCriterion("realname <=", value, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameLike(String value) {
         this.addCriterion("realname like", value, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameNotLike(String value) {
         this.addCriterion("realname not like", value, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameIn(List<String> values) {
         this.addCriterion("realname in", values, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameNotIn(List<String> values) {
         this.addCriterion("realname not in", values, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameBetween(String value1, String value2) {
         this.addCriterion("realname between", value1, value2, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRealnameNotBetween(String value1, String value2) {
         this.addCriterion("realname not between", value1, value2, "realname");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderIsNull() {
         this.addCriterion("gender is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderIsNotNull() {
         this.addCriterion("gender is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderEqualTo(String value) {
         this.addCriterion("gender =", value, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderNotEqualTo(String value) {
         this.addCriterion("gender <>", value, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderGreaterThan(String value) {
         this.addCriterion("gender >", value, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderGreaterThanOrEqualTo(String value) {
         this.addCriterion("gender >=", value, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderLessThan(String value) {
         this.addCriterion("gender <", value, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderLessThanOrEqualTo(String value) {
         this.addCriterion("gender <=", value, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderLike(String value) {
         this.addCriterion("gender like", value, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderNotLike(String value) {
         this.addCriterion("gender not like", value, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderIn(List<String> values) {
         this.addCriterion("gender in", values, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderNotIn(List<String> values) {
         this.addCriterion("gender not in", values, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderBetween(String value1, String value2) {
         this.addCriterion("gender between", value1, value2, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andGenderNotBetween(String value1, String value2) {
         this.addCriterion("gender not between", value1, value2, "gender");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthIsNull() {
         this.addCriterion("birth is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthIsNotNull() {
         this.addCriterion("birth is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthEqualTo(Long value) {
         this.addCriterion("birth =", value, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthNotEqualTo(Long value) {
         this.addCriterion("birth <>", value, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthGreaterThan(Long value) {
         this.addCriterion("birth >", value, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthGreaterThanOrEqualTo(Long value) {
         this.addCriterion("birth >=", value, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthLessThan(Long value) {
         this.addCriterion("birth <", value, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthLessThanOrEqualTo(Long value) {
         this.addCriterion("birth <=", value, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthIn(List<Long> values) {
         this.addCriterion("birth in", values, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthNotIn(List<Long> values) {
         this.addCriterion("birth not in", values, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthBetween(Long value1, Long value2) {
         this.addCriterion("birth between", value1, value2, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBirthNotBetween(Long value1, Long value2) {
         this.addCriterion("birth not between", value1, value2, "birth");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailIsNull() {
         this.addCriterion("email is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailIsNotNull() {
         this.addCriterion("email is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailEqualTo(String value) {
         this.addCriterion("email =", value, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailNotEqualTo(String value) {
         this.addCriterion("email <>", value, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailGreaterThan(String value) {
         this.addCriterion("email >", value, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailGreaterThanOrEqualTo(String value) {
         this.addCriterion("email >=", value, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailLessThan(String value) {
         this.addCriterion("email <", value, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailLessThanOrEqualTo(String value) {
         this.addCriterion("email <=", value, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailLike(String value) {
         this.addCriterion("email like", value, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailNotLike(String value) {
         this.addCriterion("email not like", value, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailIn(List<String> values) {
         this.addCriterion("email in", values, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailNotIn(List<String> values) {
         this.addCriterion("email not in", values, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailBetween(String value1, String value2) {
         this.addCriterion("email between", value1, value2, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andEmailNotBetween(String value1, String value2) {
         this.addCriterion("email not between", value1, value2, "email");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceIsNull() {
         this.addCriterion("user_face is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceIsNotNull() {
         this.addCriterion("user_face is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceEqualTo(String value) {
         this.addCriterion("user_face =", value, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceNotEqualTo(String value) {
         this.addCriterion("user_face <>", value, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceGreaterThan(String value) {
         this.addCriterion("user_face >", value, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceGreaterThanOrEqualTo(String value) {
         this.addCriterion("user_face >=", value, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceLessThan(String value) {
         this.addCriterion("user_face <", value, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceLessThanOrEqualTo(String value) {
         this.addCriterion("user_face <=", value, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceLike(String value) {
         this.addCriterion("user_face like", value, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceNotLike(String value) {
         this.addCriterion("user_face not like", value, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceIn(List<String> values) {
         this.addCriterion("user_face in", values, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceNotIn(List<String> values) {
         this.addCriterion("user_face not in", values, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceBetween(String value1, String value2) {
         this.addCriterion("user_face between", value1, value2, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andUserFaceNotBetween(String value1, String value2) {
         this.addCriterion("user_face not between", value1, value2, "userFace");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeIsNull() {
         this.addCriterion("register_time is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeIsNotNull() {
         this.addCriterion("register_time is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeEqualTo(Long value) {
         this.addCriterion("register_time =", value, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeNotEqualTo(Long value) {
         this.addCriterion("register_time <>", value, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeGreaterThan(Long value) {
         this.addCriterion("register_time >", value, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("register_time >=", value, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeLessThan(Long value) {
         this.addCriterion("register_time <", value, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("register_time <=", value, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeIn(List<Long> values) {
         this.addCriterion("register_time in", values, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeNotIn(List<Long> values) {
         this.addCriterion("register_time not in", values, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeBetween(Long value1, Long value2) {
         this.addCriterion("register_time between", value1, value2, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andRegisterTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("register_time not between", value1, value2, "registerTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationIsNull() {
         this.addCriterion("nation is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationIsNotNull() {
         this.addCriterion("nation is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationEqualTo(String value) {
         this.addCriterion("nation =", value, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationNotEqualTo(String value) {
         this.addCriterion("nation <>", value, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationGreaterThan(String value) {
         this.addCriterion("nation >", value, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationGreaterThanOrEqualTo(String value) {
         this.addCriterion("nation >=", value, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationLessThan(String value) {
         this.addCriterion("nation <", value, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationLessThanOrEqualTo(String value) {
         this.addCriterion("nation <=", value, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationLike(String value) {
         this.addCriterion("nation like", value, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationNotLike(String value) {
         this.addCriterion("nation not like", value, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationIn(List<String> values) {
         this.addCriterion("nation in", values, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationNotIn(List<String> values) {
         this.addCriterion("nation not in", values, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationBetween(String value1, String value2) {
         this.addCriterion("nation between", value1, value2, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andNationNotBetween(String value1, String value2) {
         this.addCriterion("nation not between", value1, value2, "nation");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardIsNull() {
         this.addCriterion("id_card is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardIsNotNull() {
         this.addCriterion("id_card is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardEqualTo(String value) {
         this.addCriterion("id_card =", value, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardNotEqualTo(String value) {
         this.addCriterion("id_card <>", value, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardGreaterThan(String value) {
         this.addCriterion("id_card >", value, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardGreaterThanOrEqualTo(String value) {
         this.addCriterion("id_card >=", value, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardLessThan(String value) {
         this.addCriterion("id_card <", value, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardLessThanOrEqualTo(String value) {
         this.addCriterion("id_card <=", value, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardLike(String value) {
         this.addCriterion("id_card like", value, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardNotLike(String value) {
         this.addCriterion("id_card not like", value, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardIn(List<String> values) {
         this.addCriterion("id_card in", values, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardNotIn(List<String> values) {
         this.addCriterion("id_card not in", values, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardBetween(String value1, String value2) {
         this.addCriterion("id_card between", value1, value2, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdCardNotBetween(String value1, String value2) {
         this.addCriterion("id_card not between", value1, value2, "idCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveIsNull() {
         this.addCriterion("idcard_photo_positive is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveIsNotNull() {
         this.addCriterion("idcard_photo_positive is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveEqualTo(String value) {
         this.addCriterion("idcard_photo_positive =", value, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveNotEqualTo(String value) {
         this.addCriterion("idcard_photo_positive <>", value, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveGreaterThan(String value) {
         this.addCriterion("idcard_photo_positive >", value, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveGreaterThanOrEqualTo(String value) {
         this.addCriterion("idcard_photo_positive >=", value, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveLessThan(String value) {
         this.addCriterion("idcard_photo_positive <", value, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveLessThanOrEqualTo(String value) {
         this.addCriterion("idcard_photo_positive <=", value, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveLike(String value) {
         this.addCriterion("idcard_photo_positive like", value, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveNotLike(String value) {
         this.addCriterion("idcard_photo_positive not like", value, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveIn(List<String> values) {
         this.addCriterion("idcard_photo_positive in", values, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveNotIn(List<String> values) {
         this.addCriterion("idcard_photo_positive not in", values, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveBetween(String value1, String value2) {
         this.addCriterion("idcard_photo_positive between", value1, value2, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoPositiveNotBetween(String value1, String value2) {
         this.addCriterion("idcard_photo_positive not between", value1, value2, "idcardPhotoPositive");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeIsNull() {
         this.addCriterion("idcard_photo_negative is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeIsNotNull() {
         this.addCriterion("idcard_photo_negative is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeEqualTo(String value) {
         this.addCriterion("idcard_photo_negative =", value, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeNotEqualTo(String value) {
         this.addCriterion("idcard_photo_negative <>", value, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeGreaterThan(String value) {
         this.addCriterion("idcard_photo_negative >", value, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeGreaterThanOrEqualTo(String value) {
         this.addCriterion("idcard_photo_negative >=", value, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeLessThan(String value) {
         this.addCriterion("idcard_photo_negative <", value, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeLessThanOrEqualTo(String value) {
         this.addCriterion("idcard_photo_negative <=", value, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeLike(String value) {
         this.addCriterion("idcard_photo_negative like", value, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeNotLike(String value) {
         this.addCriterion("idcard_photo_negative not like", value, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeIn(List<String> values) {
         this.addCriterion("idcard_photo_negative in", values, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeNotIn(List<String> values) {
         this.addCriterion("idcard_photo_negative not in", values, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeBetween(String value1, String value2) {
         this.addCriterion("idcard_photo_negative between", value1, value2, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andIdcardPhotoNegativeNotBetween(String value1, String value2) {
         this.addCriterion("idcard_photo_negative not between", value1, value2, "idcardPhotoNegative");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardIsNull() {
         this.addCriterion("bank_card is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardIsNotNull() {
         this.addCriterion("bank_card is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardEqualTo(String value) {
         this.addCriterion("bank_card =", value, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardNotEqualTo(String value) {
         this.addCriterion("bank_card <>", value, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardGreaterThan(String value) {
         this.addCriterion("bank_card >", value, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardGreaterThanOrEqualTo(String value) {
         this.addCriterion("bank_card >=", value, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardLessThan(String value) {
         this.addCriterion("bank_card <", value, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardLessThanOrEqualTo(String value) {
         this.addCriterion("bank_card <=", value, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardLike(String value) {
         this.addCriterion("bank_card like", value, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardNotLike(String value) {
         this.addCriterion("bank_card not like", value, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardIn(List<String> values) {
         this.addCriterion("bank_card in", values, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardNotIn(List<String> values) {
         this.addCriterion("bank_card not in", values, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardBetween(String value1, String value2) {
         this.addCriterion("bank_card between", value1, value2, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardNotBetween(String value1, String value2) {
         this.addCriterion("bank_card not between", value1, value2, "bankCard");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoIsNull() {
         this.addCriterion("bank_card_photo is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoIsNotNull() {
         this.addCriterion("bank_card_photo is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoEqualTo(String value) {
         this.addCriterion("bank_card_photo =", value, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoNotEqualTo(String value) {
         this.addCriterion("bank_card_photo <>", value, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoGreaterThan(String value) {
         this.addCriterion("bank_card_photo >", value, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoGreaterThanOrEqualTo(String value) {
         this.addCriterion("bank_card_photo >=", value, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoLessThan(String value) {
         this.addCriterion("bank_card_photo <", value, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoLessThanOrEqualTo(String value) {
         this.addCriterion("bank_card_photo <=", value, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoLike(String value) {
         this.addCriterion("bank_card_photo like", value, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoNotLike(String value) {
         this.addCriterion("bank_card_photo not like", value, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoIn(List<String> values) {
         this.addCriterion("bank_card_photo in", values, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoNotIn(List<String> values) {
         this.addCriterion("bank_card_photo not in", values, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoBetween(String value1, String value2) {
         this.addCriterion("bank_card_photo between", value1, value2, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBankCardPhotoNotBetween(String value1, String value2) {
         this.addCriterion("bank_card_photo not between", value1, value2, "bankCardPhoto");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceIsNull() {
         this.addCriterion("balance is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceIsNotNull() {
         this.addCriterion("balance is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceEqualTo(Double value) {
         this.addCriterion("balance =", value, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceNotEqualTo(Double value) {
         this.addCriterion("balance <>", value, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceGreaterThan(Double value) {
         this.addCriterion("balance >", value, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceGreaterThanOrEqualTo(Double value) {
         this.addCriterion("balance >=", value, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceLessThan(Double value) {
         this.addCriterion("balance <", value, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceLessThanOrEqualTo(Double value) {
         this.addCriterion("balance <=", value, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceIn(List<Double> values) {
         this.addCriterion("balance in", values, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceNotIn(List<Double> values) {
         this.addCriterion("balance not in", values, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceBetween(Double value1, Double value2) {
         this.addCriterion("balance between", value1, value2, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andBalanceNotBetween(Double value1, Double value2) {
         this.addCriterion("balance not between", value1, value2, "balance");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusIsNull() {
         this.addCriterion("certification_status is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusIsNotNull() {
         this.addCriterion("certification_status is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusEqualTo(String value) {
         this.addCriterion("certification_status =", value, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusNotEqualTo(String value) {
         this.addCriterion("certification_status <>", value, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusGreaterThan(String value) {
         this.addCriterion("certification_status >", value, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("certification_status >=", value, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusLessThan(String value) {
         this.addCriterion("certification_status <", value, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusLessThanOrEqualTo(String value) {
         this.addCriterion("certification_status <=", value, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusLike(String value) {
         this.addCriterion("certification_status like", value, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusNotLike(String value) {
         this.addCriterion("certification_status not like", value, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusIn(List<String> values) {
         this.addCriterion("certification_status in", values, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusNotIn(List<String> values) {
         this.addCriterion("certification_status not in", values, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusBetween(String value1, String value2) {
         this.addCriterion("certification_status between", value1, value2, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationStatusNotBetween(String value1, String value2) {
         this.addCriterion("certification_status not between", value1, value2, "certificationStatus");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeIsNull() {
         this.addCriterion("certification_time is null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeIsNotNull() {
         this.addCriterion("certification_time is not null");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeEqualTo(Long value) {
         this.addCriterion("certification_time =", value, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeNotEqualTo(Long value) {
         this.addCriterion("certification_time <>", value, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeGreaterThan(Long value) {
         this.addCriterion("certification_time >", value, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("certification_time >=", value, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeLessThan(Long value) {
         this.addCriterion("certification_time <", value, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("certification_time <=", value, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeIn(List<Long> values) {
         this.addCriterion("certification_time in", values, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeNotIn(List<Long> values) {
         this.addCriterion("certification_time not in", values, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeBetween(Long value1, Long value2) {
         this.addCriterion("certification_time between", value1, value2, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }

      public BaseUserExample.Criteria andCertificationTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("certification_time not between", value1, value2, "certificationTime");
         return (BaseUserExample.Criteria)this;
      }
   }
}
