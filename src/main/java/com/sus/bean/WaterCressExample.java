package com.sus.bean;

import java.util.ArrayList;
import java.util.List;

public class WaterCressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaterCressExample() {
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

        public Criteria andWatercressIdIsNull() {
            addCriterion("watercress_Id is null");
            return (Criteria) this;
        }

        public Criteria andWatercressIdIsNotNull() {
            addCriterion("watercress_Id is not null");
            return (Criteria) this;
        }

        public Criteria andWatercressIdEqualTo(Integer value) {
            addCriterion("watercress_Id =", value, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdNotEqualTo(Integer value) {
            addCriterion("watercress_Id <>", value, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdGreaterThan(Integer value) {
            addCriterion("watercress_Id >", value, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("watercress_Id >=", value, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdLessThan(Integer value) {
            addCriterion("watercress_Id <", value, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdLessThanOrEqualTo(Integer value) {
            addCriterion("watercress_Id <=", value, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdIn(List<Integer> values) {
            addCriterion("watercress_Id in", values, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdNotIn(List<Integer> values) {
            addCriterion("watercress_Id not in", values, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdBetween(Integer value1, Integer value2) {
            addCriterion("watercress_Id between", value1, value2, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("watercress_Id not between", value1, value2, "watercressId");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeIsNull() {
            addCriterion("watercress_Volume is null");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeIsNotNull() {
            addCriterion("watercress_Volume is not null");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeEqualTo(Integer value) {
            addCriterion("watercress_Volume =", value, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeNotEqualTo(Integer value) {
            addCriterion("watercress_Volume <>", value, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeGreaterThan(Integer value) {
            addCriterion("watercress_Volume >", value, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("watercress_Volume >=", value, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeLessThan(Integer value) {
            addCriterion("watercress_Volume <", value, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("watercress_Volume <=", value, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeIn(List<Integer> values) {
            addCriterion("watercress_Volume in", values, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeNotIn(List<Integer> values) {
            addCriterion("watercress_Volume not in", values, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeBetween(Integer value1, Integer value2) {
            addCriterion("watercress_Volume between", value1, value2, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andWatercressVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("watercress_Volume not between", value1, value2, "watercressVolume");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdIsNull() {
            addCriterion("subscriber_Id is null");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdIsNotNull() {
            addCriterion("subscriber_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdEqualTo(Integer value) {
            addCriterion("subscriber_Id =", value, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdNotEqualTo(Integer value) {
            addCriterion("subscriber_Id <>", value, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdGreaterThan(Integer value) {
            addCriterion("subscriber_Id >", value, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subscriber_Id >=", value, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdLessThan(Integer value) {
            addCriterion("subscriber_Id <", value, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdLessThanOrEqualTo(Integer value) {
            addCriterion("subscriber_Id <=", value, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdIn(List<Integer> values) {
            addCriterion("subscriber_Id in", values, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdNotIn(List<Integer> values) {
            addCriterion("subscriber_Id not in", values, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdBetween(Integer value1, Integer value2) {
            addCriterion("subscriber_Id between", value1, value2, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andSubscriberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subscriber_Id not between", value1, value2, "subscriberId");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNull() {
            addCriterion("appointment_Time is null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIsNotNull() {
            addCriterion("appointment_Time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeEqualTo(String value) {
            addCriterion("appointment_Time =", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotEqualTo(String value) {
            addCriterion("appointment_Time <>", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThan(String value) {
            addCriterion("appointment_Time >", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeGreaterThanOrEqualTo(String value) {
            addCriterion("appointment_Time >=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThan(String value) {
            addCriterion("appointment_Time <", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLessThanOrEqualTo(String value) {
            addCriterion("appointment_Time <=", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeLike(String value) {
            addCriterion("appointment_Time like", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotLike(String value) {
            addCriterion("appointment_Time not like", value, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeIn(List<String> values) {
            addCriterion("appointment_Time in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotIn(List<String> values) {
            addCriterion("appointment_Time not in", values, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeBetween(String value1, String value2) {
            addCriterion("appointment_Time between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andAppointmentTimeNotBetween(String value1, String value2) {
            addCriterion("appointment_Time not between", value1, value2, "appointmentTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeIsNull() {
            addCriterion("extraction_Time is null");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeIsNotNull() {
            addCriterion("extraction_Time is not null");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeEqualTo(String value) {
            addCriterion("extraction_Time =", value, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeNotEqualTo(String value) {
            addCriterion("extraction_Time <>", value, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeGreaterThan(String value) {
            addCriterion("extraction_Time >", value, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("extraction_Time >=", value, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeLessThan(String value) {
            addCriterion("extraction_Time <", value, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeLessThanOrEqualTo(String value) {
            addCriterion("extraction_Time <=", value, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeLike(String value) {
            addCriterion("extraction_Time like", value, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeNotLike(String value) {
            addCriterion("extraction_Time not like", value, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeIn(List<String> values) {
            addCriterion("extraction_Time in", values, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeNotIn(List<String> values) {
            addCriterion("extraction_Time not in", values, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeBetween(String value1, String value2) {
            addCriterion("extraction_Time between", value1, value2, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andExtractionTimeNotBetween(String value1, String value2) {
            addCriterion("extraction_Time not between", value1, value2, "extractionTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
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