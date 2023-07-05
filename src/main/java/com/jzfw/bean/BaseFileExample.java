package com.jzfw.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseFileExample {
   protected String orderByClause;
   protected boolean distinct;
   protected List<BaseFileExample.Criteria> oredCriteria = new ArrayList();

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

   public List<BaseFileExample.Criteria> getOredCriteria() {
      return this.oredCriteria;
   }

   public void or(BaseFileExample.Criteria criteria) {
      this.oredCriteria.add(criteria);
   }

   public BaseFileExample.Criteria or() {
      BaseFileExample.Criteria criteria = this.createCriteriaInternal();
      this.oredCriteria.add(criteria);
      return criteria;
   }

   public BaseFileExample.Criteria createCriteria() {
      BaseFileExample.Criteria criteria = this.createCriteriaInternal();
      if (this.oredCriteria.size() == 0) {
         this.oredCriteria.add(criteria);
      }

      return criteria;
   }

   protected BaseFileExample.Criteria createCriteriaInternal() {
      BaseFileExample.Criteria criteria = new BaseFileExample.Criteria();
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

   public static class Criteria extends BaseFileExample.GeneratedCriteria {
      protected Criteria() {
      }
   }

   protected abstract static class GeneratedCriteria {
      protected List<BaseFileExample.Criterion> criteria = new ArrayList();

      public boolean isValid() {
         return this.criteria.size() > 0;
      }

      public List<BaseFileExample.Criterion> getAllCriteria() {
         return this.criteria;
      }

      public List<BaseFileExample.Criterion> getCriteria() {
         return this.criteria;
      }

      protected void addCriterion(String condition) {
         if (condition == null) {
            throw new RuntimeException("Value for condition cannot be null");
         } else {
            this.criteria.add(new BaseFileExample.Criterion(condition));
         }
      }

      protected void addCriterion(String condition, Object value, String property) {
         if (value == null) {
            throw new RuntimeException("Value for " + property + " cannot be null");
         } else {
            this.criteria.add(new BaseFileExample.Criterion(condition, value));
         }
      }

      protected void addCriterion(String condition, Object value1, Object value2, String property) {
         if (value1 != null && value2 != null) {
            this.criteria.add(new BaseFileExample.Criterion(condition, value1, value2));
         } else {
            throw new RuntimeException("Between values for " + property + " cannot be null");
         }
      }

      public BaseFileExample.Criteria andIdIsNull() {
         this.addCriterion("id is null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdIsNotNull() {
         this.addCriterion("id is not null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdEqualTo(String value) {
         this.addCriterion("id =", value, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdNotEqualTo(String value) {
         this.addCriterion("id <>", value, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdGreaterThan(String value) {
         this.addCriterion("id >", value, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdGreaterThanOrEqualTo(String value) {
         this.addCriterion("id >=", value, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdLessThan(String value) {
         this.addCriterion("id <", value, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdLessThanOrEqualTo(String value) {
         this.addCriterion("id <=", value, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdLike(String value) {
         this.addCriterion("id like", value, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdNotLike(String value) {
         this.addCriterion("id not like", value, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdIn(List<String> values) {
         this.addCriterion("id in", values, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdNotIn(List<String> values) {
         this.addCriterion("id not in", values, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdBetween(String value1, String value2) {
         this.addCriterion("id between", value1, value2, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andIdNotBetween(String value1, String value2) {
         this.addCriterion("id not between", value1, value2, "id");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameIsNull() {
         this.addCriterion("file_name is null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameIsNotNull() {
         this.addCriterion("file_name is not null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameEqualTo(String value) {
         this.addCriterion("file_name =", value, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameNotEqualTo(String value) {
         this.addCriterion("file_name <>", value, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameGreaterThan(String value) {
         this.addCriterion("file_name >", value, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("file_name >=", value, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameLessThan(String value) {
         this.addCriterion("file_name <", value, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameLessThanOrEqualTo(String value) {
         this.addCriterion("file_name <=", value, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameLike(String value) {
         this.addCriterion("file_name like", value, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameNotLike(String value) {
         this.addCriterion("file_name not like", value, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameIn(List<String> values) {
         this.addCriterion("file_name in", values, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameNotIn(List<String> values) {
         this.addCriterion("file_name not in", values, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameBetween(String value1, String value2) {
         this.addCriterion("file_name between", value1, value2, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileNameNotBetween(String value1, String value2) {
         this.addCriterion("file_name not between", value1, value2, "fileName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameIsNull() {
         this.addCriterion("group_name is null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameIsNotNull() {
         this.addCriterion("group_name is not null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameEqualTo(String value) {
         this.addCriterion("group_name =", value, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameNotEqualTo(String value) {
         this.addCriterion("group_name <>", value, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameGreaterThan(String value) {
         this.addCriterion("group_name >", value, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("group_name >=", value, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameLessThan(String value) {
         this.addCriterion("group_name <", value, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameLessThanOrEqualTo(String value) {
         this.addCriterion("group_name <=", value, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameLike(String value) {
         this.addCriterion("group_name like", value, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameNotLike(String value) {
         this.addCriterion("group_name not like", value, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameIn(List<String> values) {
         this.addCriterion("group_name in", values, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameNotIn(List<String> values) {
         this.addCriterion("group_name not in", values, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameBetween(String value1, String value2) {
         this.addCriterion("group_name between", value1, value2, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andGroupNameNotBetween(String value1, String value2) {
         this.addCriterion("group_name not between", value1, value2, "groupName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeIsNull() {
         this.addCriterion("upload_time is null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeIsNotNull() {
         this.addCriterion("upload_time is not null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeEqualTo(Long value) {
         this.addCriterion("upload_time =", value, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeNotEqualTo(Long value) {
         this.addCriterion("upload_time <>", value, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeGreaterThan(Long value) {
         this.addCriterion("upload_time >", value, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("upload_time >=", value, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeLessThan(Long value) {
         this.addCriterion("upload_time <", value, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeLessThanOrEqualTo(Long value) {
         this.addCriterion("upload_time <=", value, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeIn(List<Long> values) {
         this.addCriterion("upload_time in", values, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeNotIn(List<Long> values) {
         this.addCriterion("upload_time not in", values, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeBetween(Long value1, Long value2) {
         this.addCriterion("upload_time between", value1, value2, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andUploadTimeNotBetween(Long value1, Long value2) {
         this.addCriterion("upload_time not between", value1, value2, "uploadTime");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameIsNull() {
         this.addCriterion("ext_name is null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameIsNotNull() {
         this.addCriterion("ext_name is not null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameEqualTo(String value) {
         this.addCriterion("ext_name =", value, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameNotEqualTo(String value) {
         this.addCriterion("ext_name <>", value, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameGreaterThan(String value) {
         this.addCriterion("ext_name >", value, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameGreaterThanOrEqualTo(String value) {
         this.addCriterion("ext_name >=", value, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameLessThan(String value) {
         this.addCriterion("ext_name <", value, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameLessThanOrEqualTo(String value) {
         this.addCriterion("ext_name <=", value, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameLike(String value) {
         this.addCriterion("ext_name like", value, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameNotLike(String value) {
         this.addCriterion("ext_name not like", value, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameIn(List<String> values) {
         this.addCriterion("ext_name in", values, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameNotIn(List<String> values) {
         this.addCriterion("ext_name not in", values, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameBetween(String value1, String value2) {
         this.addCriterion("ext_name between", value1, value2, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andExtNameNotBetween(String value1, String value2) {
         this.addCriterion("ext_name not between", value1, value2, "extName");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeIsNull() {
         this.addCriterion("file_size is null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeIsNotNull() {
         this.addCriterion("file_size is not null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeEqualTo(Long value) {
         this.addCriterion("file_size =", value, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeNotEqualTo(Long value) {
         this.addCriterion("file_size <>", value, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeGreaterThan(Long value) {
         this.addCriterion("file_size >", value, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeGreaterThanOrEqualTo(Long value) {
         this.addCriterion("file_size >=", value, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeLessThan(Long value) {
         this.addCriterion("file_size <", value, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeLessThanOrEqualTo(Long value) {
         this.addCriterion("file_size <=", value, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeIn(List<Long> values) {
         this.addCriterion("file_size in", values, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeNotIn(List<Long> values) {
         this.addCriterion("file_size not in", values, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeBetween(Long value1, Long value2) {
         this.addCriterion("file_size between", value1, value2, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileSizeNotBetween(Long value1, Long value2) {
         this.addCriterion("file_size not between", value1, value2, "fileSize");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeIsNull() {
         this.addCriterion("file_type is null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeIsNotNull() {
         this.addCriterion("file_type is not null");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeEqualTo(String value) {
         this.addCriterion("file_type =", value, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeNotEqualTo(String value) {
         this.addCriterion("file_type <>", value, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeGreaterThan(String value) {
         this.addCriterion("file_type >", value, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeGreaterThanOrEqualTo(String value) {
         this.addCriterion("file_type >=", value, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeLessThan(String value) {
         this.addCriterion("file_type <", value, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeLessThanOrEqualTo(String value) {
         this.addCriterion("file_type <=", value, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeLike(String value) {
         this.addCriterion("file_type like", value, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeNotLike(String value) {
         this.addCriterion("file_type not like", value, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeIn(List<String> values) {
         this.addCriterion("file_type in", values, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeNotIn(List<String> values) {
         this.addCriterion("file_type not in", values, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeBetween(String value1, String value2) {
         this.addCriterion("file_type between", value1, value2, "fileType");
         return (BaseFileExample.Criteria)this;
      }

      public BaseFileExample.Criteria andFileTypeNotBetween(String value1, String value2) {
         this.addCriterion("file_type not between", value1, value2, "fileType");
         return (BaseFileExample.Criteria)this;
      }
   }
}
