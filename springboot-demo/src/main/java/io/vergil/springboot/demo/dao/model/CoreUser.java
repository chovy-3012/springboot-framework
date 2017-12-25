package io.vergil.springboot.demo.dao.model;

import java.io.Serializable;

public class CoreUser implements Serializable {
    private Integer id;

    private String guid;

    private String name;

    private String loginname;

    private String password;

    private String phone;

    private String mobilephone;

    private String enable;

    /**
     * 是否是超级管理员
     *
     * @mbggenerated
     */
    private String admin;

    private String userType;

    /**
     * 经销商标记父节点id
     *
     * @mbggenerated
     */
    private Integer parentUserid;

    private Integer orgId;

    private String departmentId;

    private String workid;

    private String page1;

    private String page2;

    private String page3;

    private String page4;

    private String page5;

    private String page6;

    private String page7;

    private String page8;

    private String page9;

    private String page10;

    private String page11;

    private String page12;

    private String page13;

    private String page14;

    private String page15;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin == null ? null : admin.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Integer getParentUserid() {
        return parentUserid;
    }

    public void setParentUserid(Integer parentUserid) {
        this.parentUserid = parentUserid;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getPage1() {
        return page1;
    }

    public void setPage1(String page1) {
        this.page1 = page1 == null ? null : page1.trim();
    }

    public String getPage2() {
        return page2;
    }

    public void setPage2(String page2) {
        this.page2 = page2 == null ? null : page2.trim();
    }

    public String getPage3() {
        return page3;
    }

    public void setPage3(String page3) {
        this.page3 = page3 == null ? null : page3.trim();
    }

    public String getPage4() {
        return page4;
    }

    public void setPage4(String page4) {
        this.page4 = page4 == null ? null : page4.trim();
    }

    public String getPage5() {
        return page5;
    }

    public void setPage5(String page5) {
        this.page5 = page5 == null ? null : page5.trim();
    }

    public String getPage6() {
        return page6;
    }

    public void setPage6(String page6) {
        this.page6 = page6 == null ? null : page6.trim();
    }

    public String getPage7() {
        return page7;
    }

    public void setPage7(String page7) {
        this.page7 = page7 == null ? null : page7.trim();
    }

    public String getPage8() {
        return page8;
    }

    public void setPage8(String page8) {
        this.page8 = page8 == null ? null : page8.trim();
    }

    public String getPage9() {
        return page9;
    }

    public void setPage9(String page9) {
        this.page9 = page9 == null ? null : page9.trim();
    }

    public String getPage10() {
        return page10;
    }

    public void setPage10(String page10) {
        this.page10 = page10 == null ? null : page10.trim();
    }

    public String getPage11() {
        return page11;
    }

    public void setPage11(String page11) {
        this.page11 = page11 == null ? null : page11.trim();
    }

    public String getPage12() {
        return page12;
    }

    public void setPage12(String page12) {
        this.page12 = page12 == null ? null : page12.trim();
    }

    public String getPage13() {
        return page13;
    }

    public void setPage13(String page13) {
        this.page13 = page13 == null ? null : page13.trim();
    }

    public String getPage14() {
        return page14;
    }

    public void setPage14(String page14) {
        this.page14 = page14 == null ? null : page14.trim();
    }

    public String getPage15() {
        return page15;
    }

    public void setPage15(String page15) {
        this.page15 = page15 == null ? null : page15.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", guid=").append(guid);
        sb.append(", name=").append(name);
        sb.append(", loginname=").append(loginname);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", mobilephone=").append(mobilephone);
        sb.append(", enable=").append(enable);
        sb.append(", admin=").append(admin);
        sb.append(", userType=").append(userType);
        sb.append(", parentUserid=").append(parentUserid);
        sb.append(", orgId=").append(orgId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", workid=").append(workid);
        sb.append(", page1=").append(page1);
        sb.append(", page2=").append(page2);
        sb.append(", page3=").append(page3);
        sb.append(", page4=").append(page4);
        sb.append(", page5=").append(page5);
        sb.append(", page6=").append(page6);
        sb.append(", page7=").append(page7);
        sb.append(", page8=").append(page8);
        sb.append(", page9=").append(page9);
        sb.append(", page10=").append(page10);
        sb.append(", page11=").append(page11);
        sb.append(", page12=").append(page12);
        sb.append(", page13=").append(page13);
        sb.append(", page14=").append(page14);
        sb.append(", page15=").append(page15);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CoreUser other = (CoreUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGuid() == null ? other.getGuid() == null : this.getGuid().equals(other.getGuid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLoginname() == null ? other.getLoginname() == null : this.getLoginname().equals(other.getLoginname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getMobilephone() == null ? other.getMobilephone() == null : this.getMobilephone().equals(other.getMobilephone()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getAdmin() == null ? other.getAdmin() == null : this.getAdmin().equals(other.getAdmin()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getParentUserid() == null ? other.getParentUserid() == null : this.getParentUserid().equals(other.getParentUserid()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getWorkid() == null ? other.getWorkid() == null : this.getWorkid().equals(other.getWorkid()))
            && (this.getPage1() == null ? other.getPage1() == null : this.getPage1().equals(other.getPage1()))
            && (this.getPage2() == null ? other.getPage2() == null : this.getPage2().equals(other.getPage2()))
            && (this.getPage3() == null ? other.getPage3() == null : this.getPage3().equals(other.getPage3()))
            && (this.getPage4() == null ? other.getPage4() == null : this.getPage4().equals(other.getPage4()))
            && (this.getPage5() == null ? other.getPage5() == null : this.getPage5().equals(other.getPage5()))
            && (this.getPage6() == null ? other.getPage6() == null : this.getPage6().equals(other.getPage6()))
            && (this.getPage7() == null ? other.getPage7() == null : this.getPage7().equals(other.getPage7()))
            && (this.getPage8() == null ? other.getPage8() == null : this.getPage8().equals(other.getPage8()))
            && (this.getPage9() == null ? other.getPage9() == null : this.getPage9().equals(other.getPage9()))
            && (this.getPage10() == null ? other.getPage10() == null : this.getPage10().equals(other.getPage10()))
            && (this.getPage11() == null ? other.getPage11() == null : this.getPage11().equals(other.getPage11()))
            && (this.getPage12() == null ? other.getPage12() == null : this.getPage12().equals(other.getPage12()))
            && (this.getPage13() == null ? other.getPage13() == null : this.getPage13().equals(other.getPage13()))
            && (this.getPage14() == null ? other.getPage14() == null : this.getPage14().equals(other.getPage14()))
            && (this.getPage15() == null ? other.getPage15() == null : this.getPage15().equals(other.getPage15()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGuid() == null) ? 0 : getGuid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLoginname() == null) ? 0 : getLoginname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getMobilephone() == null) ? 0 : getMobilephone().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getAdmin() == null) ? 0 : getAdmin().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getParentUserid() == null) ? 0 : getParentUserid().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getWorkid() == null) ? 0 : getWorkid().hashCode());
        result = prime * result + ((getPage1() == null) ? 0 : getPage1().hashCode());
        result = prime * result + ((getPage2() == null) ? 0 : getPage2().hashCode());
        result = prime * result + ((getPage3() == null) ? 0 : getPage3().hashCode());
        result = prime * result + ((getPage4() == null) ? 0 : getPage4().hashCode());
        result = prime * result + ((getPage5() == null) ? 0 : getPage5().hashCode());
        result = prime * result + ((getPage6() == null) ? 0 : getPage6().hashCode());
        result = prime * result + ((getPage7() == null) ? 0 : getPage7().hashCode());
        result = prime * result + ((getPage8() == null) ? 0 : getPage8().hashCode());
        result = prime * result + ((getPage9() == null) ? 0 : getPage9().hashCode());
        result = prime * result + ((getPage10() == null) ? 0 : getPage10().hashCode());
        result = prime * result + ((getPage11() == null) ? 0 : getPage11().hashCode());
        result = prime * result + ((getPage12() == null) ? 0 : getPage12().hashCode());
        result = prime * result + ((getPage13() == null) ? 0 : getPage13().hashCode());
        result = prime * result + ((getPage14() == null) ? 0 : getPage14().hashCode());
        result = prime * result + ((getPage15() == null) ? 0 : getPage15().hashCode());
        return result;
    }
}