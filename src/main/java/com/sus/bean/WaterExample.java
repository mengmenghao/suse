package com.sus.bean;

import java.util.ArrayList;
import java.util.List;

public class WaterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterExample() {
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

        public Criteria andWaterStockIsNull() {
            addCriterion("water_Stock is null");
            return (Criteria) this;
        }

        public Criteria andWaterStockIsNotNull() {
            addCriterion("water_Stock is not null");
            return (Criteria) this;
        }

        public Criteria andWaterStockEqualTo(Integer value) {
            addCriterion("water_Stock =", value, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockNotEqualTo(Integer value) {
            addCriterion("water_Stock <>", value, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockGreaterThan(Integer value) {
            addCriterion("water_Stock >", value, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_Stock >=", value, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockLessThan(Integer value) {
            addCriterion("water_Stock <", value, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockLessThanOrEqualTo(Integer value) {
            addCriterion("water_Stock <=", value, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockIn(List<Integer> values) {
            addCriterion("water_Stock in", values, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockNotIn(List<Integer> values) {
            addCriterion("water_Stock not in", values, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockBetween(Integer value1, Integer value2) {
            addCriterion("water_Stock between", value1, value2, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterStockNotBetween(Integer value1, Integer value2) {
            addCriterion("water_Stock not between", value1, value2, "waterStock");
            return (Criteria) this;
        }

        public Criteria andWaterReservationIsNull() {
            addCriterion("water_Reservation is null");
            return (Criteria) this;
        }

        public Criteria andWaterReservationIsNotNull() {
            addCriterion("water_Reservation is not null");
            return (Criteria) this;
        }

        public Criteria andWaterReservationEqualTo(Integer value) {
            addCriterion("water_Reservation =", value, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationNotEqualTo(Integer value) {
            addCriterion("water_Reservation <>", value, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationGreaterThan(Integer value) {
            addCriterion("water_Reservation >", value, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_Reservation >=", value, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationLessThan(Integer value) {
            addCriterion("water_Reservation <", value, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationLessThanOrEqualTo(Integer value) {
            addCriterion("water_Reservation <=", value, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationIn(List<Integer> values) {
            addCriterion("water_Reservation in", values, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationNotIn(List<Integer> values) {
            addCriterion("water_Reservation not in", values, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationBetween(Integer value1, Integer value2) {
            addCriterion("water_Reservation between", value1, value2, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterReservationNotBetween(Integer value1, Integer value2) {
            addCriterion("water_Reservation not between", value1, value2, "waterReservation");
            return (Criteria) this;
        }

        public Criteria andWaterExtractIsNull() {
            addCriterion("water_Extract is null");
            return (Criteria) this;
        }

        public Criteria andWaterExtractIsNotNull() {
            addCriterion("water_Extract is not null");
            return (Criteria) this;
        }

        public Criteria andWaterExtractEqualTo(Integer value) {
            addCriterion("water_Extract =", value, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractNotEqualTo(Integer value) {
            addCriterion("water_Extract <>", value, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractGreaterThan(Integer value) {
            addCriterion("water_Extract >", value, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractGreaterThanOrEqualTo(Integer value) {
            addCriterion("water_Extract >=", value, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractLessThan(Integer value) {
            addCriterion("water_Extract <", value, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractLessThanOrEqualTo(Integer value) {
            addCriterion("water_Extract <=", value, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractIn(List<Integer> values) {
            addCriterion("water_Extract in", values, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractNotIn(List<Integer> values) {
            addCriterion("water_Extract not in", values, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractBetween(Integer value1, Integer value2) {
            addCriterion("water_Extract between", value1, value2, "waterExtract");
            return (Criteria) this;
        }

        public Criteria andWaterExtractNotBetween(Integer value1, Integer value2) {
            addCriterion("water_Extract not between", value1, value2, "waterExtract");
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