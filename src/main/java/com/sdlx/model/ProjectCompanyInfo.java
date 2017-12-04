package com.sdlx.model;

import java.util.Date;

public class ProjectCompanyInfo {
    private Integer id;

    private Integer projectId;

    private Integer companyId;

    private Integer projectManageId;

    private Integer paperId;

    private String account;

    private String inviteCode;

    private Integer isRegist;

    private Integer state;

    private Date startTime;

    private Date endTime;

    private Integer iscomplate;

    private Date createDate;

    private Date updateDate;

    private Date invalidDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getProjectManageId() {
        return projectManageId;
    }

    public void setProjectManageId(Integer projectManageId) {
        this.projectManageId = projectManageId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Integer getIsRegist() {
        return isRegist;
    }

    public void setIsRegist(Integer isRegist) {
        this.isRegist = isRegist;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getIscomplate() {
        return iscomplate;
    }

    public void setIscomplate(Integer iscomplate) {
        this.iscomplate = iscomplate;
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

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }
}