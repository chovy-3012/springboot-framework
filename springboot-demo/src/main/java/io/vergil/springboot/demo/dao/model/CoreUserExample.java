package io.vergil.springboot.demo.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CoreUserExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public CoreUserExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginname is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginname is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginname =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginname <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginname >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginname >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginname <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginname <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginname like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginname not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginname in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginname not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginname between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginname not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("mobilephone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("mobilephone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("mobilephone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilephone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("mobilephone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("mobilephone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("mobilephone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("mobilephone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("mobilephone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("mobilephone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("mobilephone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("mobilephone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(String value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(String value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(String value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(String value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(String value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(String value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLike(String value) {
            addCriterion("enable like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotLike(String value) {
            addCriterion("enable not like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<String> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<String> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(String value1, String value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(String value1, String value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andAdminIsNull() {
            addCriterion("admin is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsNotNull() {
            addCriterion("admin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEqualTo(String value) {
            addCriterion("admin =", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotEqualTo(String value) {
            addCriterion("admin <>", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThan(String value) {
            addCriterion("admin >", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminGreaterThanOrEqualTo(String value) {
            addCriterion("admin >=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThan(String value) {
            addCriterion("admin <", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLessThanOrEqualTo(String value) {
            addCriterion("admin <=", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminLike(String value) {
            addCriterion("admin like", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotLike(String value) {
            addCriterion("admin not like", value, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminIn(List<String> values) {
            addCriterion("admin in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotIn(List<String> values) {
            addCriterion("admin not in", values, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminBetween(String value1, String value2) {
            addCriterion("admin between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andAdminNotBetween(String value1, String value2) {
            addCriterion("admin not between", value1, value2, "admin");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andParentUseridIsNull() {
            addCriterion("parent_userid is null");
            return (Criteria) this;
        }

        public Criteria andParentUseridIsNotNull() {
            addCriterion("parent_userid is not null");
            return (Criteria) this;
        }

        public Criteria andParentUseridEqualTo(Integer value) {
            addCriterion("parent_userid =", value, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridNotEqualTo(Integer value) {
            addCriterion("parent_userid <>", value, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridGreaterThan(Integer value) {
            addCriterion("parent_userid >", value, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_userid >=", value, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridLessThan(Integer value) {
            addCriterion("parent_userid <", value, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridLessThanOrEqualTo(Integer value) {
            addCriterion("parent_userid <=", value, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridIn(List<Integer> values) {
            addCriterion("parent_userid in", values, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridNotIn(List<Integer> values) {
            addCriterion("parent_userid not in", values, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridBetween(Integer value1, Integer value2) {
            addCriterion("parent_userid between", value1, value2, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andParentUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_userid not between", value1, value2, "parentUserid");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workid is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(String value) {
            addCriterion("workid =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(String value) {
            addCriterion("workid <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(String value) {
            addCriterion("workid >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(String value) {
            addCriterion("workid >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(String value) {
            addCriterion("workid <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(String value) {
            addCriterion("workid <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLike(String value) {
            addCriterion("workid like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotLike(String value) {
            addCriterion("workid not like", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<String> values) {
            addCriterion("workid in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<String> values) {
            addCriterion("workid not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(String value1, String value2) {
            addCriterion("workid between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(String value1, String value2) {
            addCriterion("workid not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andPage1IsNull() {
            addCriterion("page1 is null");
            return (Criteria) this;
        }

        public Criteria andPage1IsNotNull() {
            addCriterion("page1 is not null");
            return (Criteria) this;
        }

        public Criteria andPage1EqualTo(String value) {
            addCriterion("page1 =", value, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1NotEqualTo(String value) {
            addCriterion("page1 <>", value, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1GreaterThan(String value) {
            addCriterion("page1 >", value, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1GreaterThanOrEqualTo(String value) {
            addCriterion("page1 >=", value, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1LessThan(String value) {
            addCriterion("page1 <", value, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1LessThanOrEqualTo(String value) {
            addCriterion("page1 <=", value, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1Like(String value) {
            addCriterion("page1 like", value, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1NotLike(String value) {
            addCriterion("page1 not like", value, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1In(List<String> values) {
            addCriterion("page1 in", values, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1NotIn(List<String> values) {
            addCriterion("page1 not in", values, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1Between(String value1, String value2) {
            addCriterion("page1 between", value1, value2, "page1");
            return (Criteria) this;
        }

        public Criteria andPage1NotBetween(String value1, String value2) {
            addCriterion("page1 not between", value1, value2, "page1");
            return (Criteria) this;
        }

        public Criteria andPage2IsNull() {
            addCriterion("page2 is null");
            return (Criteria) this;
        }

        public Criteria andPage2IsNotNull() {
            addCriterion("page2 is not null");
            return (Criteria) this;
        }

        public Criteria andPage2EqualTo(String value) {
            addCriterion("page2 =", value, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2NotEqualTo(String value) {
            addCriterion("page2 <>", value, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2GreaterThan(String value) {
            addCriterion("page2 >", value, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2GreaterThanOrEqualTo(String value) {
            addCriterion("page2 >=", value, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2LessThan(String value) {
            addCriterion("page2 <", value, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2LessThanOrEqualTo(String value) {
            addCriterion("page2 <=", value, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2Like(String value) {
            addCriterion("page2 like", value, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2NotLike(String value) {
            addCriterion("page2 not like", value, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2In(List<String> values) {
            addCriterion("page2 in", values, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2NotIn(List<String> values) {
            addCriterion("page2 not in", values, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2Between(String value1, String value2) {
            addCriterion("page2 between", value1, value2, "page2");
            return (Criteria) this;
        }

        public Criteria andPage2NotBetween(String value1, String value2) {
            addCriterion("page2 not between", value1, value2, "page2");
            return (Criteria) this;
        }

        public Criteria andPage3IsNull() {
            addCriterion("page3 is null");
            return (Criteria) this;
        }

        public Criteria andPage3IsNotNull() {
            addCriterion("page3 is not null");
            return (Criteria) this;
        }

        public Criteria andPage3EqualTo(String value) {
            addCriterion("page3 =", value, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3NotEqualTo(String value) {
            addCriterion("page3 <>", value, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3GreaterThan(String value) {
            addCriterion("page3 >", value, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3GreaterThanOrEqualTo(String value) {
            addCriterion("page3 >=", value, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3LessThan(String value) {
            addCriterion("page3 <", value, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3LessThanOrEqualTo(String value) {
            addCriterion("page3 <=", value, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3Like(String value) {
            addCriterion("page3 like", value, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3NotLike(String value) {
            addCriterion("page3 not like", value, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3In(List<String> values) {
            addCriterion("page3 in", values, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3NotIn(List<String> values) {
            addCriterion("page3 not in", values, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3Between(String value1, String value2) {
            addCriterion("page3 between", value1, value2, "page3");
            return (Criteria) this;
        }

        public Criteria andPage3NotBetween(String value1, String value2) {
            addCriterion("page3 not between", value1, value2, "page3");
            return (Criteria) this;
        }

        public Criteria andPage4IsNull() {
            addCriterion("page4 is null");
            return (Criteria) this;
        }

        public Criteria andPage4IsNotNull() {
            addCriterion("page4 is not null");
            return (Criteria) this;
        }

        public Criteria andPage4EqualTo(String value) {
            addCriterion("page4 =", value, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4NotEqualTo(String value) {
            addCriterion("page4 <>", value, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4GreaterThan(String value) {
            addCriterion("page4 >", value, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4GreaterThanOrEqualTo(String value) {
            addCriterion("page4 >=", value, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4LessThan(String value) {
            addCriterion("page4 <", value, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4LessThanOrEqualTo(String value) {
            addCriterion("page4 <=", value, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4Like(String value) {
            addCriterion("page4 like", value, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4NotLike(String value) {
            addCriterion("page4 not like", value, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4In(List<String> values) {
            addCriterion("page4 in", values, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4NotIn(List<String> values) {
            addCriterion("page4 not in", values, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4Between(String value1, String value2) {
            addCriterion("page4 between", value1, value2, "page4");
            return (Criteria) this;
        }

        public Criteria andPage4NotBetween(String value1, String value2) {
            addCriterion("page4 not between", value1, value2, "page4");
            return (Criteria) this;
        }

        public Criteria andPage5IsNull() {
            addCriterion("page5 is null");
            return (Criteria) this;
        }

        public Criteria andPage5IsNotNull() {
            addCriterion("page5 is not null");
            return (Criteria) this;
        }

        public Criteria andPage5EqualTo(String value) {
            addCriterion("page5 =", value, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5NotEqualTo(String value) {
            addCriterion("page5 <>", value, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5GreaterThan(String value) {
            addCriterion("page5 >", value, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5GreaterThanOrEqualTo(String value) {
            addCriterion("page5 >=", value, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5LessThan(String value) {
            addCriterion("page5 <", value, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5LessThanOrEqualTo(String value) {
            addCriterion("page5 <=", value, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5Like(String value) {
            addCriterion("page5 like", value, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5NotLike(String value) {
            addCriterion("page5 not like", value, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5In(List<String> values) {
            addCriterion("page5 in", values, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5NotIn(List<String> values) {
            addCriterion("page5 not in", values, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5Between(String value1, String value2) {
            addCriterion("page5 between", value1, value2, "page5");
            return (Criteria) this;
        }

        public Criteria andPage5NotBetween(String value1, String value2) {
            addCriterion("page5 not between", value1, value2, "page5");
            return (Criteria) this;
        }

        public Criteria andPage6IsNull() {
            addCriterion("page6 is null");
            return (Criteria) this;
        }

        public Criteria andPage6IsNotNull() {
            addCriterion("page6 is not null");
            return (Criteria) this;
        }

        public Criteria andPage6EqualTo(String value) {
            addCriterion("page6 =", value, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6NotEqualTo(String value) {
            addCriterion("page6 <>", value, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6GreaterThan(String value) {
            addCriterion("page6 >", value, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6GreaterThanOrEqualTo(String value) {
            addCriterion("page6 >=", value, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6LessThan(String value) {
            addCriterion("page6 <", value, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6LessThanOrEqualTo(String value) {
            addCriterion("page6 <=", value, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6Like(String value) {
            addCriterion("page6 like", value, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6NotLike(String value) {
            addCriterion("page6 not like", value, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6In(List<String> values) {
            addCriterion("page6 in", values, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6NotIn(List<String> values) {
            addCriterion("page6 not in", values, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6Between(String value1, String value2) {
            addCriterion("page6 between", value1, value2, "page6");
            return (Criteria) this;
        }

        public Criteria andPage6NotBetween(String value1, String value2) {
            addCriterion("page6 not between", value1, value2, "page6");
            return (Criteria) this;
        }

        public Criteria andPage7IsNull() {
            addCriterion("page7 is null");
            return (Criteria) this;
        }

        public Criteria andPage7IsNotNull() {
            addCriterion("page7 is not null");
            return (Criteria) this;
        }

        public Criteria andPage7EqualTo(String value) {
            addCriterion("page7 =", value, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7NotEqualTo(String value) {
            addCriterion("page7 <>", value, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7GreaterThan(String value) {
            addCriterion("page7 >", value, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7GreaterThanOrEqualTo(String value) {
            addCriterion("page7 >=", value, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7LessThan(String value) {
            addCriterion("page7 <", value, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7LessThanOrEqualTo(String value) {
            addCriterion("page7 <=", value, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7Like(String value) {
            addCriterion("page7 like", value, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7NotLike(String value) {
            addCriterion("page7 not like", value, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7In(List<String> values) {
            addCriterion("page7 in", values, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7NotIn(List<String> values) {
            addCriterion("page7 not in", values, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7Between(String value1, String value2) {
            addCriterion("page7 between", value1, value2, "page7");
            return (Criteria) this;
        }

        public Criteria andPage7NotBetween(String value1, String value2) {
            addCriterion("page7 not between", value1, value2, "page7");
            return (Criteria) this;
        }

        public Criteria andPage8IsNull() {
            addCriterion("page8 is null");
            return (Criteria) this;
        }

        public Criteria andPage8IsNotNull() {
            addCriterion("page8 is not null");
            return (Criteria) this;
        }

        public Criteria andPage8EqualTo(String value) {
            addCriterion("page8 =", value, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8NotEqualTo(String value) {
            addCriterion("page8 <>", value, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8GreaterThan(String value) {
            addCriterion("page8 >", value, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8GreaterThanOrEqualTo(String value) {
            addCriterion("page8 >=", value, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8LessThan(String value) {
            addCriterion("page8 <", value, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8LessThanOrEqualTo(String value) {
            addCriterion("page8 <=", value, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8Like(String value) {
            addCriterion("page8 like", value, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8NotLike(String value) {
            addCriterion("page8 not like", value, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8In(List<String> values) {
            addCriterion("page8 in", values, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8NotIn(List<String> values) {
            addCriterion("page8 not in", values, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8Between(String value1, String value2) {
            addCriterion("page8 between", value1, value2, "page8");
            return (Criteria) this;
        }

        public Criteria andPage8NotBetween(String value1, String value2) {
            addCriterion("page8 not between", value1, value2, "page8");
            return (Criteria) this;
        }

        public Criteria andPage9IsNull() {
            addCriterion("page9 is null");
            return (Criteria) this;
        }

        public Criteria andPage9IsNotNull() {
            addCriterion("page9 is not null");
            return (Criteria) this;
        }

        public Criteria andPage9EqualTo(String value) {
            addCriterion("page9 =", value, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9NotEqualTo(String value) {
            addCriterion("page9 <>", value, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9GreaterThan(String value) {
            addCriterion("page9 >", value, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9GreaterThanOrEqualTo(String value) {
            addCriterion("page9 >=", value, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9LessThan(String value) {
            addCriterion("page9 <", value, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9LessThanOrEqualTo(String value) {
            addCriterion("page9 <=", value, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9Like(String value) {
            addCriterion("page9 like", value, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9NotLike(String value) {
            addCriterion("page9 not like", value, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9In(List<String> values) {
            addCriterion("page9 in", values, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9NotIn(List<String> values) {
            addCriterion("page9 not in", values, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9Between(String value1, String value2) {
            addCriterion("page9 between", value1, value2, "page9");
            return (Criteria) this;
        }

        public Criteria andPage9NotBetween(String value1, String value2) {
            addCriterion("page9 not between", value1, value2, "page9");
            return (Criteria) this;
        }

        public Criteria andPage10IsNull() {
            addCriterion("page10 is null");
            return (Criteria) this;
        }

        public Criteria andPage10IsNotNull() {
            addCriterion("page10 is not null");
            return (Criteria) this;
        }

        public Criteria andPage10EqualTo(String value) {
            addCriterion("page10 =", value, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10NotEqualTo(String value) {
            addCriterion("page10 <>", value, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10GreaterThan(String value) {
            addCriterion("page10 >", value, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10GreaterThanOrEqualTo(String value) {
            addCriterion("page10 >=", value, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10LessThan(String value) {
            addCriterion("page10 <", value, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10LessThanOrEqualTo(String value) {
            addCriterion("page10 <=", value, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10Like(String value) {
            addCriterion("page10 like", value, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10NotLike(String value) {
            addCriterion("page10 not like", value, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10In(List<String> values) {
            addCriterion("page10 in", values, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10NotIn(List<String> values) {
            addCriterion("page10 not in", values, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10Between(String value1, String value2) {
            addCriterion("page10 between", value1, value2, "page10");
            return (Criteria) this;
        }

        public Criteria andPage10NotBetween(String value1, String value2) {
            addCriterion("page10 not between", value1, value2, "page10");
            return (Criteria) this;
        }

        public Criteria andPage11IsNull() {
            addCriterion("page11 is null");
            return (Criteria) this;
        }

        public Criteria andPage11IsNotNull() {
            addCriterion("page11 is not null");
            return (Criteria) this;
        }

        public Criteria andPage11EqualTo(String value) {
            addCriterion("page11 =", value, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11NotEqualTo(String value) {
            addCriterion("page11 <>", value, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11GreaterThan(String value) {
            addCriterion("page11 >", value, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11GreaterThanOrEqualTo(String value) {
            addCriterion("page11 >=", value, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11LessThan(String value) {
            addCriterion("page11 <", value, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11LessThanOrEqualTo(String value) {
            addCriterion("page11 <=", value, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11Like(String value) {
            addCriterion("page11 like", value, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11NotLike(String value) {
            addCriterion("page11 not like", value, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11In(List<String> values) {
            addCriterion("page11 in", values, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11NotIn(List<String> values) {
            addCriterion("page11 not in", values, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11Between(String value1, String value2) {
            addCriterion("page11 between", value1, value2, "page11");
            return (Criteria) this;
        }

        public Criteria andPage11NotBetween(String value1, String value2) {
            addCriterion("page11 not between", value1, value2, "page11");
            return (Criteria) this;
        }

        public Criteria andPage12IsNull() {
            addCriterion("page12 is null");
            return (Criteria) this;
        }

        public Criteria andPage12IsNotNull() {
            addCriterion("page12 is not null");
            return (Criteria) this;
        }

        public Criteria andPage12EqualTo(String value) {
            addCriterion("page12 =", value, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12NotEqualTo(String value) {
            addCriterion("page12 <>", value, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12GreaterThan(String value) {
            addCriterion("page12 >", value, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12GreaterThanOrEqualTo(String value) {
            addCriterion("page12 >=", value, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12LessThan(String value) {
            addCriterion("page12 <", value, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12LessThanOrEqualTo(String value) {
            addCriterion("page12 <=", value, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12Like(String value) {
            addCriterion("page12 like", value, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12NotLike(String value) {
            addCriterion("page12 not like", value, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12In(List<String> values) {
            addCriterion("page12 in", values, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12NotIn(List<String> values) {
            addCriterion("page12 not in", values, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12Between(String value1, String value2) {
            addCriterion("page12 between", value1, value2, "page12");
            return (Criteria) this;
        }

        public Criteria andPage12NotBetween(String value1, String value2) {
            addCriterion("page12 not between", value1, value2, "page12");
            return (Criteria) this;
        }

        public Criteria andPage13IsNull() {
            addCriterion("page13 is null");
            return (Criteria) this;
        }

        public Criteria andPage13IsNotNull() {
            addCriterion("page13 is not null");
            return (Criteria) this;
        }

        public Criteria andPage13EqualTo(String value) {
            addCriterion("page13 =", value, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13NotEqualTo(String value) {
            addCriterion("page13 <>", value, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13GreaterThan(String value) {
            addCriterion("page13 >", value, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13GreaterThanOrEqualTo(String value) {
            addCriterion("page13 >=", value, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13LessThan(String value) {
            addCriterion("page13 <", value, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13LessThanOrEqualTo(String value) {
            addCriterion("page13 <=", value, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13Like(String value) {
            addCriterion("page13 like", value, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13NotLike(String value) {
            addCriterion("page13 not like", value, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13In(List<String> values) {
            addCriterion("page13 in", values, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13NotIn(List<String> values) {
            addCriterion("page13 not in", values, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13Between(String value1, String value2) {
            addCriterion("page13 between", value1, value2, "page13");
            return (Criteria) this;
        }

        public Criteria andPage13NotBetween(String value1, String value2) {
            addCriterion("page13 not between", value1, value2, "page13");
            return (Criteria) this;
        }

        public Criteria andPage14IsNull() {
            addCriterion("page14 is null");
            return (Criteria) this;
        }

        public Criteria andPage14IsNotNull() {
            addCriterion("page14 is not null");
            return (Criteria) this;
        }

        public Criteria andPage14EqualTo(String value) {
            addCriterion("page14 =", value, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14NotEqualTo(String value) {
            addCriterion("page14 <>", value, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14GreaterThan(String value) {
            addCriterion("page14 >", value, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14GreaterThanOrEqualTo(String value) {
            addCriterion("page14 >=", value, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14LessThan(String value) {
            addCriterion("page14 <", value, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14LessThanOrEqualTo(String value) {
            addCriterion("page14 <=", value, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14Like(String value) {
            addCriterion("page14 like", value, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14NotLike(String value) {
            addCriterion("page14 not like", value, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14In(List<String> values) {
            addCriterion("page14 in", values, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14NotIn(List<String> values) {
            addCriterion("page14 not in", values, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14Between(String value1, String value2) {
            addCriterion("page14 between", value1, value2, "page14");
            return (Criteria) this;
        }

        public Criteria andPage14NotBetween(String value1, String value2) {
            addCriterion("page14 not between", value1, value2, "page14");
            return (Criteria) this;
        }

        public Criteria andPage15IsNull() {
            addCriterion("page15 is null");
            return (Criteria) this;
        }

        public Criteria andPage15IsNotNull() {
            addCriterion("page15 is not null");
            return (Criteria) this;
        }

        public Criteria andPage15EqualTo(String value) {
            addCriterion("page15 =", value, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15NotEqualTo(String value) {
            addCriterion("page15 <>", value, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15GreaterThan(String value) {
            addCriterion("page15 >", value, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15GreaterThanOrEqualTo(String value) {
            addCriterion("page15 >=", value, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15LessThan(String value) {
            addCriterion("page15 <", value, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15LessThanOrEqualTo(String value) {
            addCriterion("page15 <=", value, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15Like(String value) {
            addCriterion("page15 like", value, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15NotLike(String value) {
            addCriterion("page15 not like", value, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15In(List<String> values) {
            addCriterion("page15 in", values, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15NotIn(List<String> values) {
            addCriterion("page15 not in", values, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15Between(String value1, String value2) {
            addCriterion("page15 between", value1, value2, "page15");
            return (Criteria) this;
        }

        public Criteria andPage15NotBetween(String value1, String value2) {
            addCriterion("page15 not between", value1, value2, "page15");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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