package com.sdlx.model;

import java.util.Date;

public class PlatModuleInfo {
    private Integer moduleId;

    private Integer parentModuleId;

    private String moduleName;

    private String moduleSource;

    private String remark;

    private Integer state;

    private Date createDate;

    private Date updateDate;

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getParentModuleId() {
        return parentModuleId;
    }

    public void setParentModuleId(Integer parentModuleId) {
        this.parentModuleId = parentModuleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleSource() {
        return moduleSource;
    }

    public void setModuleSource(String moduleSource) {
        this.moduleSource = moduleSource == null ? null : moduleSource.trim();
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