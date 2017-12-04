package com.sdlx.model;

import java.util.Date;

public class CompanyProjectReportInfo {
    private Integer id;

    private Integer companyProjectId;

    private String reportSource;

    private Date reportDate;

    private Integer state;

    private String remark;

    private Date createDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyProjectId() {
        return companyProjectId;
    }

    public void setCompanyProjectId(Integer companyProjectId) {
        this.companyProjectId = companyProjectId;
    }

    public String getReportSource() {
        return reportSource;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource == null ? null : reportSource.trim();
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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