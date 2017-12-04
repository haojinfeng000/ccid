package com.sdlx.model;

public class ItemQuestionOptionInfo {
    private Long id;

    private Integer questId;

    private String optionName;

    private Double optionScore;

    private Integer orderList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuestId() {
        return questId;
    }

    public void setQuestId(Integer questId) {
        this.questId = questId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public Double getOptionScore() {
        return optionScore;
    }

    public void setOptionScore(Double optionScore) {
        this.optionScore = optionScore;
    }

    public Integer getOrderList() {
        return orderList;
    }

    public void setOrderList(Integer orderList) {
        this.orderList = orderList;
    }
}