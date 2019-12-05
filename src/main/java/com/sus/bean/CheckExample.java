package com.sus.bean;

import java.util.ArrayList;
import java.util.List;

public class CheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCheckIdIsNull() {
            addCriterion("check_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckIdIsNotNull() {
            addCriterion("check_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckIdEqualTo(Integer value) {
            addCriterion("check_id =", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotEqualTo(Integer value) {
            addCriterion("check_id <>", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThan(Integer value) {
            addCriterion("check_id >", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_id >=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThan(Integer value) {
            addCriterion("check_id <", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("check_id <=", value, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdIn(List<Integer> values) {
            addCriterion("check_id in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotIn(List<Integer> values) {
            addCriterion("check_id not in", values, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdBetween(Integer value1, Integer value2) {
            addCriterion("check_id between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andCheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("check_id not between", value1, value2, "checkId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNull() {
            addCriterion("floor_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNotNull() {
            addCriterion("floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIdEqualTo(Integer value) {
            addCriterion("floor_id =", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotEqualTo(Integer value) {
            addCriterion("floor_id <>", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThan(Integer value) {
            addCriterion("floor_id >", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_id >=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThan(Integer value) {
            addCriterion("floor_id <", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThanOrEqualTo(Integer value) {
            addCriterion("floor_id <=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIn(List<Integer> values) {
            addCriterion("floor_id in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotIn(List<Integer> values) {
            addCriterion("floor_id not in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdBetween(Integer value1, Integer value2) {
            addCriterion("floor_id between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_id not between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdIsNull() {
            addCriterion("dormitory_id is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdIsNotNull() {
            addCriterion("dormitory_id is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdEqualTo(Integer value) {
            addCriterion("dormitory_id =", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotEqualTo(Integer value) {
            addCriterion("dormitory_id <>", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdGreaterThan(Integer value) {
            addCriterion("dormitory_id >", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dormitory_id >=", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdLessThan(Integer value) {
            addCriterion("dormitory_id <", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("dormitory_id <=", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdIn(List<Integer> values) {
            addCriterion("dormitory_id in", values, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotIn(List<Integer> values) {
            addCriterion("dormitory_id not in", values, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_id between", value1, value2, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_id not between", value1, value2, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(String value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(String value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(String value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(String value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLike(String value) {
            addCriterion("check_time like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotLike(String value) {
            addCriterion("check_time not like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<String> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<String> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(String value1, String value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(String value1, String value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoIsNull() {
            addCriterion("check_photo is null");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoIsNotNull() {
            addCriterion("check_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoEqualTo(String value) {
            addCriterion("check_photo =", value, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoNotEqualTo(String value) {
            addCriterion("check_photo <>", value, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoGreaterThan(String value) {
            addCriterion("check_photo >", value, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("check_photo >=", value, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoLessThan(String value) {
            addCriterion("check_photo <", value, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoLessThanOrEqualTo(String value) {
            addCriterion("check_photo <=", value, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoLike(String value) {
            addCriterion("check_photo like", value, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoNotLike(String value) {
            addCriterion("check_photo not like", value, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoIn(List<String> values) {
            addCriterion("check_photo in", values, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoNotIn(List<String> values) {
            addCriterion("check_photo not in", values, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoBetween(String value1, String value2) {
            addCriterion("check_photo between", value1, value2, "checkPhoto");
            return (Criteria) this;
        }

        public Criteria andCheckPhotoNotBetween(String value1, String value2) {
            addCriterion("check_photo not between", value1, value2, "checkPhoto");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
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
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}