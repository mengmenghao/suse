package com.sus.bean;

import java.util.ArrayList;
import java.util.List;

public class FloorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FloorExample() {
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

        public Criteria andFloorNameIsNull() {
            addCriterion("floor_Name is null");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNotNull() {
            addCriterion("floor_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNameEqualTo(String value) {
            addCriterion("floor_Name =", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotEqualTo(String value) {
            addCriterion("floor_Name <>", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThan(String value) {
            addCriterion("floor_Name >", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_Name >=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThan(String value) {
            addCriterion("floor_Name <", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThanOrEqualTo(String value) {
            addCriterion("floor_Name <=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLike(String value) {
            addCriterion("floor_Name like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotLike(String value) {
            addCriterion("floor_Name not like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameIn(List<String> values) {
            addCriterion("floor_Name in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotIn(List<String> values) {
            addCriterion("floor_Name not in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameBetween(String value1, String value2) {
            addCriterion("floor_Name between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotBetween(String value1, String value2) {
            addCriterion("floor_Name not between", value1, value2, "floorName");
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