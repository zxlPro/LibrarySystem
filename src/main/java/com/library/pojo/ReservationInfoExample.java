package com.library.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReservationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReservationInfoExample() {
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Long value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Long value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Long value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Long value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Long value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Long> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Long> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Long value1, Long value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Long value1, Long value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andReaderIdIsNull() {
            addCriterion("reader_id is null");
            return (Criteria) this;
        }

        public Criteria andReaderIdIsNotNull() {
            addCriterion("reader_id is not null");
            return (Criteria) this;
        }

        public Criteria andReaderIdEqualTo(Long value) {
            addCriterion("reader_id =", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotEqualTo(Long value) {
            addCriterion("reader_id <>", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdGreaterThan(Long value) {
            addCriterion("reader_id >", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reader_id >=", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLessThan(Long value) {
            addCriterion("reader_id <", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLessThanOrEqualTo(Long value) {
            addCriterion("reader_id <=", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdIn(List<Long> values) {
            addCriterion("reader_id in", values, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotIn(List<Long> values) {
            addCriterion("reader_id not in", values, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdBetween(Long value1, Long value2) {
            addCriterion("reader_id between", value1, value2, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotBetween(Long value1, Long value2) {
            addCriterion("reader_id not between", value1, value2, "readerId");
            return (Criteria) this;
        }

        public Criteria andReserDateIsNull() {
            addCriterion("reser_date is null");
            return (Criteria) this;
        }

        public Criteria andReserDateIsNotNull() {
            addCriterion("reser_date is not null");
            return (Criteria) this;
        }

        public Criteria andReserDateEqualTo(Date value) {
            addCriterionForJDBCDate("reser_date =", value, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reser_date <>", value, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reser_date >", value, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reser_date >=", value, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateLessThan(Date value) {
            addCriterionForJDBCDate("reser_date <", value, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reser_date <=", value, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateIn(List<Date> values) {
            addCriterionForJDBCDate("reser_date in", values, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reser_date not in", values, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reser_date between", value1, value2, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reser_date not between", value1, value2, "reserDate");
            return (Criteria) this;
        }

        public Criteria andReserStatusIsNull() {
            addCriterion("reser_status is null");
            return (Criteria) this;
        }

        public Criteria andReserStatusIsNotNull() {
            addCriterion("reser_status is not null");
            return (Criteria) this;
        }

        public Criteria andReserStatusEqualTo(String value) {
            addCriterion("reser_status =", value, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusNotEqualTo(String value) {
            addCriterion("reser_status <>", value, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusGreaterThan(String value) {
            addCriterion("reser_status >", value, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("reser_status >=", value, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusLessThan(String value) {
            addCriterion("reser_status <", value, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusLessThanOrEqualTo(String value) {
            addCriterion("reser_status <=", value, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusLike(String value) {
            addCriterion("reser_status like", value, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusNotLike(String value) {
            addCriterion("reser_status not like", value, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusIn(List<String> values) {
            addCriterion("reser_status in", values, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusNotIn(List<String> values) {
            addCriterion("reser_status not in", values, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusBetween(String value1, String value2) {
            addCriterion("reser_status between", value1, value2, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andReserStatusNotBetween(String value1, String value2) {
            addCriterion("reser_status not between", value1, value2, "reserStatus");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateIsNull() {
            addCriterion("time_out_date is null");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateIsNotNull() {
            addCriterion("time_out_date is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateEqualTo(Date value) {
            addCriterionForJDBCDate("time_out_date =", value, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("time_out_date <>", value, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("time_out_date >", value, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_out_date >=", value, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateLessThan(Date value) {
            addCriterionForJDBCDate("time_out_date <", value, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time_out_date <=", value, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateIn(List<Date> values) {
            addCriterionForJDBCDate("time_out_date in", values, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("time_out_date not in", values, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_out_date between", value1, value2, "timeOutDate");
            return (Criteria) this;
        }

        public Criteria andTimeOutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time_out_date not between", value1, value2, "timeOutDate");
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