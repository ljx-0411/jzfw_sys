package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<AddressExample.Criteria> oredCriteria = new ArrayList();

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

   public List<AddressExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(AddressExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public AddressExample.Criteria or() {
      AddressExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public AddressExample.Criteria createCriteria() {
      AddressExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected AddressExample.Criteria createCriteriaInternal() {
      AddressExample.Criteria criteria = new AddressExample.Criteria();
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

   public static class Criteria extends AddressExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<AddressExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<AddressExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<AddressExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new AddressExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new AddressExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new AddressExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public AddressExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdEqualTo(Long value) {
         this.addCriterion("id =", value, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdNotEqualTo(Long value) {
         this.addCriterion("id <>", value, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdGreaterThan(Long value) {
         this.addCriterion("id >", value, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("id >=", value, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdLessThan(Long value) {
         this.addCriterion("id <", value, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdLessThanOrEqualTo(Long value) {
         this.addCriterion("id <=", value, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdIn(List<Long> values) {
         this.addCriterion("id in", values, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdNotIn(List<Long> values) {
         this.addCriterion("id not in", values, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdBetween(Long value1, Long value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIdNotBetween(Long value1, Long value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameIsNull() {
         this.addCriterion("username is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameIsNotNull() {
         this.addCriterion("username is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameEqualTo(String value) {
         this.addCriterion("username =", value, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameNotEqualTo(String value) {
         this.addCriterion("username <>", value, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameGreaterThan(String value) {
         this.addCriterion("username >", value, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameGreaterThanOrEqualTo(String value) {
         this.addCriterion("username >=", value, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameLessThan(String value) {
         this.addCriterion("username <", value, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameLessThanOrEqualTo(String value) {
         this.addCriterion("username <=", value, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameLike(String value) {
         this.addCriterion("username like", value, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameNotLike(String value) {
         this.addCriterion("username not like", value, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameIn(List<String> values) {
         this.addCriterion("username in", values, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameNotIn(List<String> values) {
         this.addCriterion("username not in", values, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameBetween(String value1, String value2) {
         this.addCriterion("username between", value1, value2, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUsernameNotBetween(String value1, String value2) {
         this.addCriterion("username not between", value1, value2, "username");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneIsNull() {
         this.addCriterion("telephone is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneIsNotNull() {
         this.addCriterion("telephone is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneEqualTo(String value) {
         this.addCriterion("telephone =", value, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneNotEqualTo(String value) {
         this.addCriterion("telephone <>", value, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneGreaterThan(String value) {
         this.addCriterion("telephone >", value, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneGreaterThanOrEqualTo(String value) {
         this.addCriterion("telephone >=", value, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneLessThan(String value) {
         this.addCriterion("telephone <", value, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneLessThanOrEqualTo(String value) {
         this.addCriterion("telephone <=", value, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneLike(String value) {
         this.addCriterion("telephone like", value, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneNotLike(String value) {
         this.addCriterion("telephone not like", value, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneIn(List<String> values) {
         this.addCriterion("telephone in", values, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneNotIn(List<String> values) {
         this.addCriterion("telephone not in", values, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneBetween(String value1, String value2) {
         this.addCriterion("telephone between", value1, value2, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andTelephoneNotBetween(String value1, String value2) {
         this.addCriterion("telephone not between", value1, value2, "telephone");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceIsNull() {
         this.addCriterion("province is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceIsNotNull() {
         this.addCriterion("province is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceEqualTo(String value) {
         this.addCriterion("province =", value, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceNotEqualTo(String value) {
         this.addCriterion("province <>", value, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceGreaterThan(String value) {
         this.addCriterion("province >", value, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceGreaterThanOrEqualTo(String value) {
         this.addCriterion("province >=", value, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceLessThan(String value) {
         this.addCriterion("province <", value, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceLessThanOrEqualTo(String value) {
         this.addCriterion("province <=", value, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceLike(String value) {
         this.addCriterion("province like", value, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceNotLike(String value) {
         this.addCriterion("province not like", value, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceIn(List<String> values) {
         this.addCriterion("province in", values, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceNotIn(List<String> values) {
         this.addCriterion("province not in", values, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceBetween(String value1, String value2) {
         this.addCriterion("province between", value1, value2, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andProvinceNotBetween(String value1, String value2) {
         this.addCriterion("province not between", value1, value2, "province");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityIsNull() {
         this.addCriterion("city is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityIsNotNull() {
         this.addCriterion("city is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityEqualTo(String value) {
         this.addCriterion("city =", value, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityNotEqualTo(String value) {
         this.addCriterion("city <>", value, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityGreaterThan(String value) {
         this.addCriterion("city >", value, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityGreaterThanOrEqualTo(String value) {
         this.addCriterion("city >=", value, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityLessThan(String value) {
         this.addCriterion("city <", value, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityLessThanOrEqualTo(String value) {
         this.addCriterion("city <=", value, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityLike(String value) {
         this.addCriterion("city like", value, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityNotLike(String value) {
         this.addCriterion("city not like", value, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityIn(List<String> values) {
         this.addCriterion("city in", values, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityNotIn(List<String> values) {
         this.addCriterion("city not in", values, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityBetween(String value1, String value2) {
         this.addCriterion("city between", value1, value2, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andCityNotBetween(String value1, String value2) {
         this.addCriterion("city not between", value1, value2, "city");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaIsNull() {
         this.addCriterion("area is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaIsNotNull() {
         this.addCriterion("area is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaEqualTo(String value) {
         this.addCriterion("area =", value, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaNotEqualTo(String value) {
         this.addCriterion("area <>", value, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaGreaterThan(String value) {
         this.addCriterion("area >", value, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaGreaterThanOrEqualTo(String value) {
         this.addCriterion("area >=", value, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaLessThan(String value) {
         this.addCriterion("area <", value, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaLessThanOrEqualTo(String value) {
         this.addCriterion("area <=", value, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaLike(String value) {
         this.addCriterion("area like", value, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaNotLike(String value) {
         this.addCriterion("area not like", value, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaIn(List<String> values) {
         this.addCriterion("area in", values, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaNotIn(List<String> values) {
         this.addCriterion("area not in", values, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaBetween(String value1, String value2) {
         this.addCriterion("area between", value1, value2, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAreaNotBetween(String value1, String value2) {
         this.addCriterion("area not between", value1, value2, "area");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressIsNull() {
         this.addCriterion("address is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressIsNotNull() {
         this.addCriterion("address is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressEqualTo(String value) {
         this.addCriterion("address =", value, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressNotEqualTo(String value) {
         this.addCriterion("address <>", value, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressGreaterThan(String value) {
         this.addCriterion("address >", value, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressGreaterThanOrEqualTo(String value) {
         this.addCriterion("address >=", value, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressLessThan(String value) {
         this.addCriterion("address <", value, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressLessThanOrEqualTo(String value) {
         this.addCriterion("address <=", value, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressLike(String value) {
         this.addCriterion("address like", value, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressNotLike(String value) {
         this.addCriterion("address not like", value, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressIn(List<String> values) {
         this.addCriterion("address in", values, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressNotIn(List<String> values) {
         this.addCriterion("address not in", values, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressBetween(String value1, String value2) {
         this.addCriterion("address between", value1, value2, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andAddressNotBetween(String value1, String value2) {
         this.addCriterion("address not between", value1, value2, "address");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultIsNull() {
         this.addCriterion("is_default is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultIsNotNull() {
         this.addCriterion("is_default is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultEqualTo(Integer value) {
         this.addCriterion("is_default =", value, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultNotEqualTo(Integer value) {
         this.addCriterion("is_default <>", value, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultGreaterThan(Integer value) {
         this.addCriterion("is_default >", value, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultGreaterThanOrEqualTo(Integer value) {
         this.addCriterion("is_default >=", value, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultLessThan(Integer value) {
         this.addCriterion("is_default <", value, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultLessThanOrEqualTo(Integer value) {
         this.addCriterion("is_default <=", value, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultIn(List<Integer> values) {
         this.addCriterion("is_default in", values, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultNotIn(List<Integer> values) {
         this.addCriterion("is_default not in", values, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultBetween(Integer value1, Integer value2) {
         this.addCriterion("is_default between", value1, value2, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andIsDefaultNotBetween(Integer value1, Integer value2) {
         this.addCriterion("is_default not between", value1, value2, "isDefault");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdIsNull() {
         this.addCriterion("user_id is null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdIsNotNull() {
         this.addCriterion("user_id is not null");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdEqualTo(Long value) {
         this.addCriterion("user_id =", value, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdNotEqualTo(Long value) {
         this.addCriterion("user_id <>", value, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdGreaterThan(Long value) {
         this.addCriterion("user_id >", value, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdGreaterThanOrEqualTo(Long value) {
         this.addCriterion("user_id >=", value, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdLessThan(Long value) {
         this.addCriterion("user_id <", value, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdLessThanOrEqualTo(Long value) {
         this.addCriterion("user_id <=", value, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdIn(List<Long> values) {
         this.addCriterion("user_id in", values, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdNotIn(List<Long> values) {
         this.addCriterion("user_id not in", values, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdBetween(Long value1, Long value2) {
         this.addCriterion("user_id between", value1, value2, "userId");
         return (AddressExample.Criteria)this;
      }

      public AddressExample.Criteria andUserIdNotBetween(Long value1, Long value2) {
         this.addCriterion("user_id not between", value1, value2, "userId");
         return (AddressExample.Criteria)this;
      }
   }
}
