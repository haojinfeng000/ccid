package com.sdlx.model;

import java.util.Date;

public class CompanyStaffPaperInfo {
    private Integer id;

    private Integer staffId;

    private Integer companyProjectId;

    private Integer paperId;

    private Integer typeId;

    private Integer moduleId;

    private Integer questId;

    private Integer questOptionId;

    private Double score;

    private Date createDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getCompanyProjectId() {
        return companyProjectId;
    }

    public void setCompanyProjectId(Integer companyProjectId) {
        this.companyProjectId = companyProjectId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getQuestId() {
        return questId;
    }

    public void setQuestId(Integer questId) {
        this.questId = questId;
    }

    public Integer getQuestOptionId() {
        return questOptionId;
    }

    public void setQuestOptionId(Integer questOptionId) {
        this.questOptionId = questOptionId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
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