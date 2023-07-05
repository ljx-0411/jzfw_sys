package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class CarouselExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<CarouselExample.Criteria> oredCriteria = new ArrayList();

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

   public List<CarouselExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(CarouselExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public CarouselExample.Criteria or() {
      CarouselExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public CarouselExample.Criteria createCriteria() {
      CarouselExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected CarouselExample.Criteria createCriteriaInternal() {
      CarouselExample.Criteria criteria = new CarouselExample.Criteria();
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

   public static class Criteria extends CarouselExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<CarouselExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<CarouselExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<CarouselExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new CarouselExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new CarouselExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new CarouselExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public CarouselExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameIsNull() {
         this.addCriterion("name is null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameIsNotNull() {
         this.addCriterion("name is not null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameEqualTo(String value) {
         this.addCriterion("name =", value, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameNotEqualTo(String value) {
         this.addCriterion("name <>", value, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameGreaterThan(String value) {
         this.addCriterion("name >", value, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("name >=", value, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameLessThan(String value) {
         this.addCriterion("name <", value, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameLessThanOrEqualTo(String value) {
         this.addCriterion("name <=", value, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameLike(String value) {
         this.addCriterion("name like", value, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameNotLike(String value) {
         this.addCriterion("name not like", value, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameIn(List<String> values) {
         this.addCriterion("name in", values, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameNotIn(List<String> values) {
         this.addCriterion("name not in", values, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameBetween(String value1, String value2) {
         this.addCriterion("name between", value1, value2, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andNameNotBetween(String value1, String value2) {
         this.addCriterion("name not between", value1, value2, "name");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceIsNull() {
         this.addCriterion("introduce is null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceIsNotNull() {
         this.addCriterion("introduce is not null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceEqualTo(String value) {
         this.addCriterion("introduce =", value, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceNotEqualTo(String value) {
         this.addCriterion("introduce <>", value, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceGreaterThan(String value) {
         this.addCriterion("introduce >", value, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceGreaterThanOrEqualTo(String value) {
         this.addCriterion("introduce >=", value, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceLessThan(String value) {
         this.addCriterion("introduce <", value, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceLessThanOrEqualTo(String value) {
         this.addCriterion("introduce <=", value, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceLike(String value) {
         this.addCriterion("introduce like", value, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceNotLike(String value) {
         this.addCriterion("introduce not like", value, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceIn(List<String> values) {
         this.addCriterion("introduce in", values, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceNotIn(List<String> values) {
         this.addCriterion("introduce not in", values, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceBetween(String value1, String value2) {
         this.addCriterion("introduce between", value1, value2, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andIntroduceNotBetween(String value1, String value2) {
         this.addCriterion("introduce not between", value1, value2, "introduce");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlIsNull() {
         this.addCriterion("url is null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlIsNotNull() {
         this.addCriterion("url is not null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlEqualTo(String value) {
         this.addCriterion("url =", value, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlNotEqualTo(String value) {
         this.addCriterion("url <>", value, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlGreaterThan(String value) {
         this.addCriterion("url >", value, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlGreaterThanOrEqualTo(String value) {
         this.addCriterion("url >=", value, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlLessThan(String value) {
         this.addCriterion("url <", value, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlLessThanOrEqualTo(String value) {
         this.addCriterion("url <=", value, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlLike(String value) {
         this.addCriterion("url like", value, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlNotLike(String value) {
         this.addCriterion("url not like", value, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlIn(List<String> values) {
         this.addCriterion("url in", values, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlNotIn(List<String> values) {
         this.addCriterion("url not in", values, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlBetween(String value1, String value2) {
         this.addCriterion("url between", value1, value2, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andUrlNotBetween(String value1, String value2) {
         this.addCriterion("url not between", value1, value2, "url");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusIsNull() {
         this.addCriterion("status is null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusIsNotNull() {
         this.addCriterion("status is not null");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusEqualTo(String value) {
         this.addCriterion("status =", value, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusNotEqualTo(String value) {
         this.addCriterion("status <>", value, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusGreaterThan(String value) {
         this.addCriterion("status >", value, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
         this.addCriterion("status >=", value, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusLessThan(String value) {
         this.addCriterion("status <", value, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusLessThanOrEqualTo(String value) {
         this.addCriterion("status <=", value, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusLike(String value) {
         this.addCriterion("status like", value, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusNotLike(String value) {
         this.addCriterion("status not like", value, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusIn(List<String> values) {
         this.addCriterion("status in", values, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusNotIn(List<String> values) {
         this.addCriterion("status not in", values, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusBetween(String value1, String value2) {
         this.addCriterion("status between", value1, value2, "status");
         return (CarouselExample.Criteria)this;
      }

      public CarouselExample.Criteria andStatusNotBetween(String value1, String value2) {
         this.addCriterion("status not between", value1, value2, "status");
         return (CarouselExample.Criteria)this;
      }
   }
}
