package com.evio.samll2.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Double value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Double value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Double value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Double value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Double value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Double> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Double> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Double value1, Double value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Double value1, Double value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIsNull() {
            addCriterion("goodsImg is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIsNotNull() {
            addCriterion("goodsImg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgEqualTo(String value) {
            addCriterion("goodsImg =", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotEqualTo(String value) {
            addCriterion("goodsImg <>", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgGreaterThan(String value) {
            addCriterion("goodsImg >", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgGreaterThanOrEqualTo(String value) {
            addCriterion("goodsImg >=", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLessThan(String value) {
            addCriterion("goodsImg <", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLessThanOrEqualTo(String value) {
            addCriterion("goodsImg <=", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLike(String value) {
            addCriterion("goodsImg like", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotLike(String value) {
            addCriterion("goodsImg not like", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIn(List<String> values) {
            addCriterion("goodsImg in", values, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotIn(List<String> values) {
            addCriterion("goodsImg not in", values, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgBetween(String value1, String value2) {
            addCriterion("goodsImg between", value1, value2, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotBetween(String value1, String value2) {
            addCriterion("goodsImg not between", value1, value2, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodscountIsNull() {
            addCriterion("goodsCount is null");
            return (Criteria) this;
        }

        public Criteria andGoodscountIsNotNull() {
            addCriterion("goodsCount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscountEqualTo(Integer value) {
            addCriterion("goodsCount =", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotEqualTo(Integer value) {
            addCriterion("goodsCount <>", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountGreaterThan(Integer value) {
            addCriterion("goodsCount >", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsCount >=", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountLessThan(Integer value) {
            addCriterion("goodsCount <", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountLessThanOrEqualTo(Integer value) {
            addCriterion("goodsCount <=", value, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountIn(List<Integer> values) {
            addCriterion("goodsCount in", values, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotIn(List<Integer> values) {
            addCriterion("goodsCount not in", values, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountBetween(Integer value1, Integer value2) {
            addCriterion("goodsCount between", value1, value2, "goodscount");
            return (Criteria) this;
        }

        public Criteria andGoodscountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsCount not between", value1, value2, "goodscount");
            return (Criteria) this;
        }

        public Criteria andCreaetdateIsNull() {
            addCriterion("creaetDate is null");
            return (Criteria) this;
        }

        public Criteria andCreaetdateIsNotNull() {
            addCriterion("creaetDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreaetdateEqualTo(Date value) {
            addCriterion("creaetDate =", value, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateNotEqualTo(Date value) {
            addCriterion("creaetDate <>", value, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateGreaterThan(Date value) {
            addCriterion("creaetDate >", value, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateGreaterThanOrEqualTo(Date value) {
            addCriterion("creaetDate >=", value, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateLessThan(Date value) {
            addCriterion("creaetDate <", value, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateLessThanOrEqualTo(Date value) {
            addCriterion("creaetDate <=", value, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateIn(List<Date> values) {
            addCriterion("creaetDate in", values, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateNotIn(List<Date> values) {
            addCriterion("creaetDate not in", values, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateBetween(Date value1, Date value2) {
            addCriterion("creaetDate between", value1, value2, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andCreaetdateNotBetween(Date value1, Date value2) {
            addCriterion("creaetDate not between", value1, value2, "creaetdate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("updateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIsNull() {
            addCriterion("goodsStatus is null");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIsNotNull() {
            addCriterion("goodsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusEqualTo(Integer value) {
            addCriterion("goodsStatus =", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotEqualTo(Integer value) {
            addCriterion("goodsStatus <>", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusGreaterThan(Integer value) {
            addCriterion("goodsStatus >", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsStatus >=", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusLessThan(Integer value) {
            addCriterion("goodsStatus <", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusLessThanOrEqualTo(Integer value) {
            addCriterion("goodsStatus <=", value, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusIn(List<Integer> values) {
            addCriterion("goodsStatus in", values, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotIn(List<Integer> values) {
            addCriterion("goodsStatus not in", values, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusBetween(Integer value1, Integer value2) {
            addCriterion("goodsStatus between", value1, value2, "goodsstatus");
            return (Criteria) this;
        }

        public Criteria andGoodsstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsStatus not between", value1, value2, "goodsstatus");
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