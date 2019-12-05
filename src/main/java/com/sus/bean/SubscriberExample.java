package com.sus.bean;

import java.util.ArrayList;
import java.util.List;

public class SubscriberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubscriberExample() {
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

        public Criteria andSubscriberNameIsNull() {
            addCriterion("subscriber_Name is null");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameIsNotNull() {
            addCriterion("subscriber_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameEqualTo(String value) {
            addCriterion("subscriber_Name =", value, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameNotEqualTo(String value) {
            addCriterion("subscriber_Name <>", value, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameGreaterThan(String value) {
            addCriterion("subscriber_Name >", value, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameGreaterThanOrEqualTo(String value) {
            addCriterion("subscriber_Name >=", value, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameLessThan(String value) {
            addCriterion("subscriber_Name <", value, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameLessThanOrEqualTo(String value) {
            addCriterion("subscriber_Name <=", value, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameLike(String value) {
            addCriterion("subscriber_Name like", value, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameNotLike(String value) {
            addCriterion("subscriber_Name not like", value, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameIn(List<String> values) {
            addCriterion("subscriber_Name in", values, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameNotIn(List<String> values) {
            addCriterion("subscriber_Name not in", values, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameBetween(String value1, String value2) {
            addCriterion("subscriber_Name between", value1, value2, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberNameNotBetween(String value1, String value2) {
            addCriterion("subscriber_Name not between", value1, value2, "subscriberName");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordIsNull() {
            addCriterion("subscriber_Password is null");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordIsNotNull() {
            addCriterion("subscriber_Password is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordEqualTo(String value) {
            addCriterion("subscriber_Password =", value, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordNotEqualTo(String value) {
            addCriterion("subscriber_Password <>", value, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordGreaterThan(String value) {
            addCriterion("subscriber_Password >", value, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("subscriber_Password >=", value, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordLessThan(String value) {
            addCriterion("subscriber_Password <", value, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordLessThanOrEqualTo(String value) {
            addCriterion("subscriber_Password <=", value, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordLike(String value) {
            addCriterion("subscriber_Password like", value, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordNotLike(String value) {
            addCriterion("subscriber_Password not like", value, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordIn(List<String> values) {
            addCriterion("subscriber_Password in", values, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordNotIn(List<String> values) {
            addCriterion("subscriber_Password not in", values, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordBetween(String value1, String value2) {
            addCriterion("subscriber_Password between", value1, value2, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPasswordNotBetween(String value1, String value2) {
            addCriterion("subscriber_Password not between", value1, value2, "subscriberPassword");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionIsNull() {
            addCriterion("subscriber_Permission is null");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionIsNotNull() {
            addCriterion("subscriber_Permission is not null");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionEqualTo(Integer value) {
            addCriterion("subscriber_Permission =", value, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionNotEqualTo(Integer value) {
            addCriterion("subscriber_Permission <>", value, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionGreaterThan(Integer value) {
            addCriterion("subscriber_Permission >", value, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("subscriber_Permission >=", value, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionLessThan(Integer value) {
            addCriterion("subscriber_Permission <", value, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionLessThanOrEqualTo(Integer value) {
            addCriterion("subscriber_Permission <=", value, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionIn(List<Integer> values) {
            addCriterion("subscriber_Permission in", values, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionNotIn(List<Integer> values) {
            addCriterion("subscriber_Permission not in", values, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionBetween(Integer value1, Integer value2) {
            addCriterion("subscriber_Permission between", value1, value2, "subscriberPermission");
            return (Criteria) this;
        }

        public Criteria andSubscriberPermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("subscriber_Permission not between", value1, value2, "subscriberPermission");
            return (Criteria) this;
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