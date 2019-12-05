package com.sus.bean;

import java.util.ArrayList;
import java.util.List;

public class DormitoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DormitoryExample() {
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

        public Criteria andDormitoryIdIsNull() {
            addCriterion("dormitory_Id is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdIsNotNull() {
            addCriterion("dormitory_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdEqualTo(Integer value) {
            addCriterion("dormitory_Id =", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotEqualTo(Integer value) {
            addCriterion("dormitory_Id <>", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdGreaterThan(Integer value) {
            addCriterion("dormitory_Id >", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dormitory_Id >=", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdLessThan(Integer value) {
            addCriterion("dormitory_Id <", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("dormitory_Id <=", value, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdIn(List<Integer> values) {
            addCriterion("dormitory_Id in", values, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotIn(List<Integer> values) {
            addCriterion("dormitory_Id not in", values, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_Id between", value1, value2, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dormitory_Id not between", value1, value2, "dormitoryId");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameIsNull() {
            addCriterion("dormitory_Name is null");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameIsNotNull() {
            addCriterion("dormitory_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameEqualTo(String value) {
            addCriterion("dormitory_Name =", value, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameNotEqualTo(String value) {
            addCriterion("dormitory_Name <>", value, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameGreaterThan(String value) {
            addCriterion("dormitory_Name >", value, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("dormitory_Name >=", value, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameLessThan(String value) {
            addCriterion("dormitory_Name <", value, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameLessThanOrEqualTo(String value) {
            addCriterion("dormitory_Name <=", value, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameLike(String value) {
            addCriterion("dormitory_Name like", value, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameNotLike(String value) {
            addCriterion("dormitory_Name not like", value, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameIn(List<String> values) {
            addCriterion("dormitory_Name in", values, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameNotIn(List<String> values) {
            addCriterion("dormitory_Name not in", values, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameBetween(String value1, String value2) {
            addCriterion("dormitory_Name between", value1, value2, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andDormitoryNameNotBetween(String value1, String value2) {
            addCriterion("dormitory_Name not between", value1, value2, "dormitoryName");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNull() {
            addCriterion("floor_Id is null");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNotNull() {
            addCriterion("floor_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIdEqualTo(Integer value) {
            addCriterion("floor_Id =", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotEqualTo(Integer value) {
            addCriterion("floor_Id <>", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThan(Integer value) {
            addCriterion("floor_Id >", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_Id >=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThan(Integer value) {
            addCriterion("floor_Id <", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThanOrEqualTo(Integer value) {
            addCriterion("floor_Id <=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIn(List<Integer> values) {
            addCriterion("floor_Id in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotIn(List<Integer> values) {
            addCriterion("floor_Id not in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdBetween(Integer value1, Integer value2) {
            addCriterion("floor_Id between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_Id not between", value1, value2, "floorId");
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