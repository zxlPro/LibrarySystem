package com.library.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReaderTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReaderTypeExample() {
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

        public Criteria andReaderTypeNameIsNull() {
            addCriterion("reader_type_name is null");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameIsNotNull() {
            addCriterion("reader_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameEqualTo(String value) {
            addCriterion("reader_type_name =", value, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameNotEqualTo(String value) {
            addCriterion("reader_type_name <>", value, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameGreaterThan(String value) {
            addCriterion("reader_type_name >", value, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("reader_type_name >=", value, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameLessThan(String value) {
            addCriterion("reader_type_name <", value, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameLessThanOrEqualTo(String value) {
            addCriterion("reader_type_name <=", value, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameLike(String value) {
            addCriterion("reader_type_name like", value, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameNotLike(String value) {
            addCriterion("reader_type_name not like", value, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameIn(List<String> values) {
            addCriterion("reader_type_name in", values, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameNotIn(List<String> values) {
            addCriterion("reader_type_name not in", values, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameBetween(String value1, String value2) {
            addCriterion("reader_type_name between", value1, value2, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andReaderTypeNameNotBetween(String value1, String value2) {
            addCriterion("reader_type_name not between", value1, value2, "readerTypeName");
            return (Criteria) this;
        }

        public Criteria andLendBookNumIsNull() {
            addCriterion("lend_book_num is null");
            return (Criteria) this;
        }

        public Criteria andLendBookNumIsNotNull() {
            addCriterion("lend_book_num is not null");
            return (Criteria) this;
        }

        public Criteria andLendBookNumEqualTo(Integer value) {
            addCriterion("lend_book_num =", value, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumNotEqualTo(Integer value) {
            addCriterion("lend_book_num <>", value, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumGreaterThan(Integer value) {
            addCriterion("lend_book_num >", value, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lend_book_num >=", value, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumLessThan(Integer value) {
            addCriterion("lend_book_num <", value, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumLessThanOrEqualTo(Integer value) {
            addCriterion("lend_book_num <=", value, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumIn(List<Integer> values) {
            addCriterion("lend_book_num in", values, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumNotIn(List<Integer> values) {
            addCriterion("lend_book_num not in", values, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumBetween(Integer value1, Integer value2) {
            addCriterion("lend_book_num between", value1, value2, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendBookNumNotBetween(Integer value1, Integer value2) {
            addCriterion("lend_book_num not between", value1, value2, "lendBookNum");
            return (Criteria) this;
        }

        public Criteria andLendDaysIsNull() {
            addCriterion("lend_days is null");
            return (Criteria) this;
        }

        public Criteria andLendDaysIsNotNull() {
            addCriterion("lend_days is not null");
            return (Criteria) this;
        }

        public Criteria andLendDaysEqualTo(Integer value) {
            addCriterion("lend_days =", value, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysNotEqualTo(Integer value) {
            addCriterion("lend_days <>", value, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysGreaterThan(Integer value) {
            addCriterion("lend_days >", value, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("lend_days >=", value, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysLessThan(Integer value) {
            addCriterion("lend_days <", value, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysLessThanOrEqualTo(Integer value) {
            addCriterion("lend_days <=", value, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysIn(List<Integer> values) {
            addCriterion("lend_days in", values, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysNotIn(List<Integer> values) {
            addCriterion("lend_days not in", values, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysBetween(Integer value1, Integer value2) {
            addCriterion("lend_days between", value1, value2, "lendDays");
            return (Criteria) this;
        }

        public Criteria andLendDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("lend_days not between", value1, value2, "lendDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysIsNull() {
            addCriterion("reservation_days is null");
            return (Criteria) this;
        }

        public Criteria andReservationDaysIsNotNull() {
            addCriterion("reservation_days is not null");
            return (Criteria) this;
        }

        public Criteria andReservationDaysEqualTo(Integer value) {
            addCriterion("reservation_days =", value, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysNotEqualTo(Integer value) {
            addCriterion("reservation_days <>", value, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysGreaterThan(Integer value) {
            addCriterion("reservation_days >", value, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("reservation_days >=", value, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysLessThan(Integer value) {
            addCriterion("reservation_days <", value, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysLessThanOrEqualTo(Integer value) {
            addCriterion("reservation_days <=", value, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysIn(List<Integer> values) {
            addCriterion("reservation_days in", values, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysNotIn(List<Integer> values) {
            addCriterion("reservation_days not in", values, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysBetween(Integer value1, Integer value2) {
            addCriterion("reservation_days between", value1, value2, "reservationDays");
            return (Criteria) this;
        }

        public Criteria andReservationDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("reservation_days not between", value1, value2, "reservationDays");
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