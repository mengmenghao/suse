package com.sus.bean;

import java.util.ArrayList;
import java.util.List;

public class WasherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WasherExample() {
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

        public Criteria andWasherIdIsNull() {
            addCriterion("washer_Id is null");
            return (Criteria) this;
        }

        public Criteria andWasherIdIsNotNull() {
            addCriterion("washer_Id is not null");
            return (Criteria) this;
        }

        public Criteria andWasherIdEqualTo(Integer value) {
            addCriterion("washer_Id =", value, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdNotEqualTo(Integer value) {
            addCriterion("washer_Id <>", value, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdGreaterThan(Integer value) {
            addCriterion("washer_Id >", value, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("washer_Id >=", value, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdLessThan(Integer value) {
            addCriterion("washer_Id <", value, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdLessThanOrEqualTo(Integer value) {
            addCriterion("washer_Id <=", value, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdIn(List<Integer> values) {
            addCriterion("washer_Id in", values, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdNotIn(List<Integer> values) {
            addCriterion("washer_Id not in", values, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdBetween(Integer value1, Integer value2) {
            addCriterion("washer_Id between", value1, value2, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("washer_Id not between", value1, value2, "washerId");
            return (Criteria) this;
        }

        public Criteria andWasherNameIsNull() {
            addCriterion("washer_Name is null");
            return (Criteria) this;
        }

        public Criteria andWasherNameIsNotNull() {
            addCriterion("washer_Name is not null");
            return (Criteria) this;
        }

        public Criteria andWasherNameEqualTo(String value) {
            addCriterion("washer_Name =", value, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameNotEqualTo(String value) {
            addCriterion("washer_Name <>", value, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameGreaterThan(String value) {
            addCriterion("washer_Name >", value, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameGreaterThanOrEqualTo(String value) {
            addCriterion("washer_Name >=", value, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameLessThan(String value) {
            addCriterion("washer_Name <", value, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameLessThanOrEqualTo(String value) {
            addCriterion("washer_Name <=", value, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameLike(String value) {
            addCriterion("washer_Name like", value, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameNotLike(String value) {
            addCriterion("washer_Name not like", value, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameIn(List<String> values) {
            addCriterion("washer_Name in", values, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameNotIn(List<String> values) {
            addCriterion("washer_Name not in", values, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameBetween(String value1, String value2) {
            addCriterion("washer_Name between", value1, value2, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherNameNotBetween(String value1, String value2) {
            addCriterion("washer_Name not between", value1, value2, "washerName");
            return (Criteria) this;
        }

        public Criteria andWasherStatusIsNull() {
            addCriterion("washer_Status is null");
            return (Criteria) this;
        }

        public Criteria andWasherStatusIsNotNull() {
            addCriterion("washer_Status is not null");
            return (Criteria) this;
        }

        public Criteria andWasherStatusEqualTo(String value) {
            addCriterion("washer_Status =", value, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusNotEqualTo(String value) {
            addCriterion("washer_Status <>", value, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusGreaterThan(String value) {
            addCriterion("washer_Status >", value, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusGreaterThanOrEqualTo(String value) {
            addCriterion("washer_Status >=", value, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusLessThan(String value) {
            addCriterion("washer_Status <", value, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusLessThanOrEqualTo(String value) {
            addCriterion("washer_Status <=", value, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusLike(String value) {
            addCriterion("washer_Status like", value, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusNotLike(String value) {
            addCriterion("washer_Status not like", value, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusIn(List<String> values) {
            addCriterion("washer_Status in", values, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusNotIn(List<String> values) {
            addCriterion("washer_Status not in", values, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusBetween(String value1, String value2) {
            addCriterion("washer_Status between", value1, value2, "washerStatus");
            return (Criteria) this;
        }

        public Criteria andWasherStatusNotBetween(String value1, String value2) {
            addCriterion("washer_Status not between", value1, value2, "washerStatus");
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