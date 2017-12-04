package com.sdlx.model;

import java.util.Date;

public class ItemExamPaperInfo {
    private Integer paperId;

    private String paperName;

    private Integer type;

    private String remark;

    private Integer state;

    private Integer userId;

    private Integer companyTypeId;

    private Integer incomeScalId;

    private Integer peopleScaleId;

    private Date createDate;

    private Date updateDate;

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyTypeId() {
        return companyTypeId;
    }

    public void setCompanyTypeId(Integer companyTypeId) {
        this.companyTypeId = companyTypeId;
    }

    public Integer getIncomeScalId() {
        return incomeScalId;
    }

    public void setIncomeScalId(Integer incomeScalId) {
        this.incomeScalId = incomeScalId;
    }

    public Integer getPeopleScaleId() {
        return peopleScaleId;
    }

    public void setPeopleScaleId(Integer peopleScaleId) {
        this.peopleScaleId = peopleScaleId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}