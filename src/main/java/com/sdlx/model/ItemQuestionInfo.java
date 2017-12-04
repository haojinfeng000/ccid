package com.sdlx.model;

import java.util.Date;

public class ItemQuestionInfo {
    private Integer questId;

    private Integer paperId;

    private Integer type;

    private Integer moduleId;

    private Integer questWeight;

    private Integer questLevel;

    private String questName;

    private Integer state;

    private String remark;

    private Integer orderList;

    private Date createDate;

    private Date updateDate;

    public Integer getQuestId() {
        return questId;
    }

    public void setQuestId(Integer questId) {
        this.questId = questId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getQuestWeight() {
        return questWeight;
    }

    public void setQuestWeight(Integer questWeight) {
        this.questWeight = questWeight;
    }

    public Integer getQuestLevel() {
        return questLevel;
    }

    public void setQuestLevel(Integer questLevel) {
        this.questLevel = questLevel;
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName == null ? null : questName.trim();
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

    public Integer getOrderList() {
        return orderList;
    }

    public void setOrderList(Integer orderList) {
        this.orderList = orderList;
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