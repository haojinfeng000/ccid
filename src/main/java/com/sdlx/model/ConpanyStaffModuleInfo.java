package com.sdlx.model;

import java.util.Date;

public class ConpanyStaffModuleInfo extends ConpanyStaffModuleInfoKey {
    private Integer issubmit;

    private Date startTime;

    private Date endTime;

    private Double moduleScore;

    private String reportSource;

    private Date createDate;

    private Date updateDate;

    public Integer getIssubmit() {
        return issubmit;
    }

    public void setIssubmit(Integer issubmit) {
        this.issubmit = issubmit;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getModuleScore() {
        return moduleScore;
    }

    public void setModuleScore(Double moduleScore) {
        this.moduleScore = moduleScore;
    }

    public String getReportSource() {
        return reportSource;
    }

    public void setReportSource(String reportSource) {
        this.reportSource = reportSource == null ? null : reportSource.trim();
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