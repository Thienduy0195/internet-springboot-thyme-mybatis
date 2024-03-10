package com.fsoft.internet.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public RecordExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andComputerIdIsNull() {
            addCriterion("computer_id is null");
            return (Criteria) this;
        }

        public Criteria andComputerIdIsNotNull() {
            addCriterion("computer_id is not null");
            return (Criteria) this;
        }

        public Criteria andComputerIdEqualTo(String value) {
            addCriterion("computer_id =", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdNotEqualTo(String value) {
            addCriterion("computer_id <>", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdGreaterThan(String value) {
            addCriterion("computer_id >", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdGreaterThanOrEqualTo(String value) {
            addCriterion("computer_id >=", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdLessThan(String value) {
            addCriterion("computer_id <", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdLessThanOrEqualTo(String value) {
            addCriterion("computer_id <=", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdLike(String value) {
            addCriterion("computer_id like", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdNotLike(String value) {
            addCriterion("computer_id not like", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdIn(List<String> values) {
            addCriterion("computer_id in", values, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdNotIn(List<String> values) {
            addCriterion("computer_id not in", values, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdBetween(String value1, String value2) {
            addCriterion("computer_id between", value1, value2, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdNotBetween(String value1, String value2) {
            addCriterion("computer_id not between", value1, value2, "computerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andStartingDateIsNull() {
            addCriterion("starting_date is null");
            return (Criteria) this;
        }

        public Criteria andStartingDateIsNotNull() {
            addCriterion("starting_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartingDateEqualTo(Date value) {
            addCriterionForJDBCDate("starting_date =", value, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("starting_date <>", value, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("starting_date >", value, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starting_date >=", value, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateLessThan(Date value) {
            addCriterionForJDBCDate("starting_date <", value, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starting_date <=", value, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateIn(List<Date> values) {
            addCriterionForJDBCDate("starting_date in", values, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("starting_date not in", values, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starting_date between", value1, value2, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starting_date not between", value1, value2, "startingDate");
            return (Criteria) this;
        }

        public Criteria andStartingHourIsNull() {
            addCriterion("starting_hour is null");
            return (Criteria) this;
        }

        public Criteria andStartingHourIsNotNull() {
            addCriterion("starting_hour is not null");
            return (Criteria) this;
        }

        public Criteria andStartingHourEqualTo(Date value) {
            addCriterionForJDBCTime("starting_hour =", value, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourNotEqualTo(Date value) {
            addCriterionForJDBCTime("starting_hour <>", value, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourGreaterThan(Date value) {
            addCriterionForJDBCTime("starting_hour >", value, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("starting_hour >=", value, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourLessThan(Date value) {
            addCriterionForJDBCTime("starting_hour <", value, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("starting_hour <=", value, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourIn(List<Date> values) {
            addCriterionForJDBCTime("starting_hour in", values, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourNotIn(List<Date> values) {
            addCriterionForJDBCTime("starting_hour not in", values, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("starting_hour between", value1, value2, "startingHour");
            return (Criteria) this;
        }

        public Criteria andStartingHourNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("starting_hour not between", value1, value2, "startingHour");
            return (Criteria) this;
        }

        public Criteria andUsingTimeIsNull() {
            addCriterion("using_time is null");
            return (Criteria) this;
        }

        public Criteria andUsingTimeIsNotNull() {
            addCriterion("using_time is not null");
            return (Criteria) this;
        }

        public Criteria andUsingTimeEqualTo(Integer value) {
            addCriterion("using_time =", value, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeNotEqualTo(Integer value) {
            addCriterion("using_time <>", value, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeGreaterThan(Integer value) {
            addCriterion("using_time >", value, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("using_time >=", value, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeLessThan(Integer value) {
            addCriterion("using_time <", value, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeLessThanOrEqualTo(Integer value) {
            addCriterion("using_time <=", value, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeIn(List<Integer> values) {
            addCriterion("using_time in", values, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeNotIn(List<Integer> values) {
            addCriterion("using_time not in", values, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeBetween(Integer value1, Integer value2) {
            addCriterion("using_time between", value1, value2, "usingTime");
            return (Criteria) this;
        }

        public Criteria andUsingTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("using_time not between", value1, value2, "usingTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table record
     *
     * @mbg.generated do_not_delete_during_merge Sun Mar 10 08:56:35 ICT 2024
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table record
     *
     * @mbg.generated Sun Mar 10 08:56:35 ICT 2024
     */
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