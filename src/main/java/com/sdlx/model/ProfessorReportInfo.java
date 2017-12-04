package com.sdlx.model;

import java.util.Date;

public class ProfessorReportInfo {
    private Integer id;

    private Integer companyProjectId;

    private String reportSource;

    private Integer proId;

    private String proName;

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

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
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