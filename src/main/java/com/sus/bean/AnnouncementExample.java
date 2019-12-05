package com.sus.bean;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnouncementExample() {
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

        public Criteria andAnnouncementIdIsNull() {
            addCriterion("announcement_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdIsNotNull() {
            addCriterion("announcement_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdEqualTo(Integer value) {
            addCriterion("announcement_id =", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotEqualTo(Integer value) {
            addCriterion("announcement_id <>", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdGreaterThan(Integer value) {
            addCriterion("announcement_id >", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("announcement_id >=", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLessThan(Integer value) {
            addCriterion("announcement_id <", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdLessThanOrEqualTo(Integer value) {
            addCriterion("announcement_id <=", value, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdIn(List<Integer> values) {
            addCriterion("announcement_id in", values, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotIn(List<Integer> values) {
            addCriterion("announcement_id not in", values, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdBetween(Integer value1, Integer value2) {
            addCriterion("announcement_id between", value1, value2, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("announcement_id not between", value1, value2, "announcementId");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameIsNull() {
            addCriterion("announcement_name is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameIsNotNull() {
            addCriterion("announcement_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameEqualTo(String value) {
            addCriterion("announcement_name =", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameNotEqualTo(String value) {
            addCriterion("announcement_name <>", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameGreaterThan(String value) {
            addCriterion("announcement_name >", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_name >=", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameLessThan(String value) {
            addCriterion("announcement_name <", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameLessThanOrEqualTo(String value) {
            addCriterion("announcement_name <=", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameLike(String value) {
            addCriterion("announcement_name like", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameNotLike(String value) {
            addCriterion("announcement_name not like", value, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameIn(List<String> values) {
            addCriterion("announcement_name in", values, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameNotIn(List<String> values) {
            addCriterion("announcement_name not in", values, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameBetween(String value1, String value2) {
            addCriterion("announcement_name between", value1, value2, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNameNotBetween(String value1, String value2) {
            addCriterion("announcement_name not between", value1, value2, "announcementName");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentIsNull() {
            addCriterion("announcement_content is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentIsNotNull() {
            addCriterion("announcement_content is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentEqualTo(String value) {
            addCriterion("announcement_content =", value, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentNotEqualTo(String value) {
            addCriterion("announcement_content <>", value, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentGreaterThan(String value) {
            addCriterion("announcement_content >", value, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_content >=", value, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentLessThan(String value) {
            addCriterion("announcement_content <", value, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentLessThanOrEqualTo(String value) {
            addCriterion("announcement_content <=", value, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentLike(String value) {
            addCriterion("announcement_content like", value, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentNotLike(String value) {
            addCriterion("announcement_content not like", value, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentIn(List<String> values) {
            addCriterion("announcement_content in", values, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentNotIn(List<String> values) {
            addCriterion("announcement_content not in", values, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentBetween(String value1, String value2) {
            addCriterion("announcement_content between", value1, value2, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementContentNotBetween(String value1, String value2) {
            addCriterion("announcement_content not between", value1, value2, "announcementContent");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIsNull() {
            addCriterion("announcement_time is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIsNotNull() {
            addCriterion("announcement_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeEqualTo(String value) {
            addCriterion("announcement_time =", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotEqualTo(String value) {
            addCriterion("announcement_time <>", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeGreaterThan(String value) {
            addCriterion("announcement_time >", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeGreaterThanOrEqualTo(String value) {
            addCriterion("announcement_time >=", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLessThan(String value) {
            addCriterion("announcement_time <", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLessThanOrEqualTo(String value) {
            addCriterion("announcement_time <=", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeLike(String value) {
            addCriterion("announcement_time like", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotLike(String value) {
            addCriterion("announcement_time not like", value, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeIn(List<String> values) {
            addCriterion("announcement_time in", values, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotIn(List<String> values) {
            addCriterion("announcement_time not in", values, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeBetween(String value1, String value2) {
            addCriterion("announcement_time between", value1, value2, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncementTimeNotBetween(String value1, String value2) {
            addCriterion("announcement_time not between", value1, value2, "announcementTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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