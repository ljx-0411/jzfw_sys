package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class BasePrivilegeExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<BasePrivilegeExample.Criteria> oredCriteria = new ArrayList();

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

   public List<BasePrivilegeExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(BasePrivilegeExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public BasePrivilegeExample.Criteria or() {
      BasePrivilegeExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public BasePrivilegeExample.Criteria createCriteria() {
      BasePrivilegeExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected BasePrivilegeExample.Criteria createCriteriaInternal() {
      BasePrivilegeExample.Criteria criteria = new BasePrivilegeExample.Criteria();
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

   public static class Criteria extends BasePrivilegeExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<BasePrivilegeExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<BasePrivilegeExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<BasePrivilegeExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new BasePrivilegeExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new BasePrivilegeExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new BasePrivilegeExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public BasePrivilegeExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameIsNull() {
         this.addCriterion("name is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameIsNotNull() {
         this.addCriterion("name is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameEqualTo(String value) {
         this.addCriterion("name =", value, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameNotEqualTo(String value) {
         this.addCriterion("name <>", value, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameGreaterThan(String value) {
         this.addCriterion("name >", value, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("name >=", value, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameLessThan(String value) {
         this.addCriterion("name <", value, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameLessThanOrEqualTo(String value) {
         this.addCriterion("name <=", value, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameLike(String value) {
         this.addCriterion("name like", value, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameNotLike(String value) {
         this.addCriterion("name not like", value, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameIn(List<String> values) {
         this.addCriterion("name in", values, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameNotIn(List<String> values) {
         this.addCriterion("name not in", values, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameBetween(String value1, String value2) {
         this.addCriterion("name between", value1, value2, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNameNotBetween(String value1, String value2) {
         this.addCriterion("name not between", value1, value2, "name");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionIsNull() {
         this.addCriterion("description is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionIsNotNull() {
         this.addCriterion("description is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionEqualTo(String value) {
         this.addCriterion("description =", value, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionNotEqualTo(String value) {
         this.addCriterion("description <>", value, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionGreaterThan(String value) {
         this.addCriterion("description >", value, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionGreaterThanOrEqualTo(String value) {
         this.addCriterion("description >=", value, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionLessThan(String value) {
         this.addCriterion("description <", value, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionLessThanOrEqualTo(String value) {
         this.addCriterion("description <=", value, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionLike(String value) {
         this.addCriterion("description like", value, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionNotLike(String value) {
         this.addCriterion("description not like", value, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionIn(List<String> values) {
         this.addCriterion("description in", values, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionNotIn(List<String> values) {
         this.addCriterion("description not in", values, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionBetween(String value1, String value2) {
         this.addCriterion("description between", value1, value2, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andDescriptionNotBetween(String value1, String value2) {
         this.addCriterion("description not between", value1, value2, "description");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteIsNull() {
         this.addCriterion("route is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteIsNotNull() {
         this.addCriterion("route is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteEqualTo(String value) {
         this.addCriterion("route =", value, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNotEqualTo(String value) {
         this.addCriterion("route <>", value, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteGreaterThan(String value) {
         this.addCriterion("route >", value, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteGreaterThanOrEqualTo(String value) {
         this.addCriterion("route >=", value, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteLessThan(String value) {
         this.addCriterion("route <", value, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteLessThanOrEqualTo(String value) {
         this.addCriterion("route <=", value, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteLike(String value) {
         this.addCriterion("route like", value, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNotLike(String value) {
         this.addCriterion("route not like", value, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteIn(List<String> values) {
         this.addCriterion("route in", values, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNotIn(List<String> values) {
         this.addCriterion("route not in", values, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteBetween(String value1, String value2) {
         this.addCriterion("route between", value1, value2, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNotBetween(String value1, String value2) {
         this.addCriterion("route not between", value1, value2, "route");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameIsNull() {
         this.addCriterion("route_name is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameIsNotNull() {
         this.addCriterion("route_name is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameEqualTo(String value) {
         this.addCriterion("route_name =", value, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameNotEqualTo(String value) {
         this.addCriterion("route_name <>", value, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameGreaterThan(String value) {
         this.addCriterion("route_name >", value, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("route_name >=", value, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameLessThan(String value) {
         this.addCriterion("route_name <", value, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameLessThanOrEqualTo(String value) {
         this.addCriterion("route_name <=", value, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameLike(String value) {
         this.addCriterion("route_name like", value, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameNotLike(String value) {
         this.addCriterion("route_name not like", value, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameIn(List<String> values) {
         this.addCriterion("route_name in", values, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameNotIn(List<String> values) {
         this.addCriterion("route_name not in", values, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameBetween(String value1, String value2) {
         this.addCriterion("route_name between", value1, value2, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andRouteNameNotBetween(String value1, String value2) {
         this.addCriterion("route_name not between", value1, value2, "routeName");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeIsNull() {
         this.addCriterion("type is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeIsNotNull() {
         this.addCriterion("type is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeEqualTo(String value) {
         this.addCriterion("type =", value, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeNotEqualTo(String value) {
         this.addCriterion("type <>", value, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeGreaterThan(String value) {
         this.addCriterion("type >", value, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeGreaterThanOrEqualTo(String value) {
         this.addCriterion("type >=", value, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeLessThan(String value) {
         this.addCriterion("type <", value, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeLessThanOrEqualTo(String value) {
         this.addCriterion("type <=", value, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeLike(String value) {
         this.addCriterion("type like", value, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeNotLike(String value) {
         this.addCriterion("type not like", value, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeIn(List<String> values) {
         this.addCriterion("type in", values, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeNotIn(List<String> values) {
         this.addCriterion("type not in", values, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeBetween(String value1, String value2) {
         this.addCriterion("type between", value1, value2, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andTypeNotBetween(String value1, String value2) {
         this.addCriterion("type not between", value1, value2, "type");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconIsNull() {
         this.addCriterion("icon is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconIsNotNull() {
         this.addCriterion("icon is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconEqualTo(String value) {
         this.addCriterion("icon =", value, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconNotEqualTo(String value) {
         this.addCriterion("icon <>", value, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconGreaterThan(String value) {
         this.addCriterion("icon >", value, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconGreaterThanOrEqualTo(String value) {
         this.addCriterion("icon >=", value, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconLessThan(String value) {
         this.addCriterion("icon <", value, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconLessThanOrEqualTo(String value) {
         this.addCriterion("icon <=", value, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconLike(String value) {
         this.addCriterion("icon like", value, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconNotLike(String value) {
         this.addCriterion("icon not like", value, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconIn(List<String> values) {
         this.addCriterion("icon in", values, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconNotIn(List<String> values) {
         this.addCriterion("icon not in", values, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconBetween(String value1, String value2) {
         this.addCriterion("icon between", value1, value2, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andIconNotBetween(String value1, String value2) {
         this.addCriterion("icon not between", value1, value2, "icon");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenIsNull() {
         this.addCriterion("hidden is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenIsNotNull() {
         this.addCriterion("hidden is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenEqualTo(Integer value) {
         this.addCriterion("hidden =", value, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenNotEqualTo(Integer value) {
         this.addCriterion("hidden <>", value, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenGreaterThan(Integer value) {
         this.addCriterion("hidden >", value, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("hidden >=", value, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenLessThan(Integer value) {
         this.addCriterion("hidden <", value, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenLessThanOrEqualTo(Integer value) {
         this.addCriterion("hidden <=", value, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenIn(List<Integer> values) {
         this.addCriterion("hidden in", values, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenNotIn(List<Integer> values) {
         this.addCriterion("hidden not in", values, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenBetween(Integer value1, Integer value2) {
         this.addCriterion("hidden between", value1, value2, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andHiddenNotBetween(Integer value1, Integer value2) {
         this.addCriterion("hidden not between", value1, value2, "hidden");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumIsNull() {
         this.addCriterion("num is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumIsNotNull() {
         this.addCriterion("num is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumEqualTo(Integer value) {
         this.addCriterion("num =", value, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumNotEqualTo(Integer value) {
         this.addCriterion("num <>", value, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumGreaterThan(Integer value) {
         this.addCriterion("num >", value, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("num >=", value, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumLessThan(Integer value) {
         this.addCriterion("num <", value, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumLessThanOrEqualTo(Integer value) {
         this.addCriterion("num <=", value, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumIn(List<Integer> values) {
         this.addCriterion("num in", values, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumNotIn(List<Integer> values) {
         this.addCriterion("num not in", values, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumBetween(Integer value1, Integer value2) {
         this.addCriterion("num between", value1, value2, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andNumNotBetween(Integer value1, Integer value2) {
         this.addCriterion("num not between", value1, value2, "num");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdIsNull() {
         this.addCriterion("parent_id is null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdIsNotNull() {
         this.addCriterion("parent_id is not null");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdEqualTo(Long value) {
         this.addCriterion("parent_id =", value, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdNotEqualTo(Long value) {
         this.addCriterion("parent_id <>", value, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdGreaterThan(Long value) {
         this.addCriterion("parent_id >", value, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("parent_id >=", value, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdLessThan(Long value) {
         this.addCriterion("parent_id <", value, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdLessThanOrEqualTo(Long value) {
         this.addCriterion("parent_id <=", value, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdIn(List<Long> values) {
         this.addCriterion("parent_id in", values, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdNotIn(List<Long> values) {
         this.addCriterion("parent_id not in", values, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdBetween(Long value1, Long value2) {
         this.addCriterion("parent_id between", value1, value2, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }

      public BasePrivilegeExample.Criteria andParentIdNotBetween(Long value1, Long value2) {
         this.addCriterion("parent_id not between", value1, value2, "parentId");
         return (BasePrivilegeExample.Criteria)this;
      }
   }
}
