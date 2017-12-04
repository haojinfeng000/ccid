package com.sdlx.model;

public class BasePeopleScalInfo {
    private Integer peopleScaleId;

    private String peopleScale;

    public Integer getPeopleScaleId() {
        return peopleScaleId;
    }

    public void setPeopleScaleId(Integer peopleScaleId) {
        this.peopleScaleId = peopleScaleId;
    }

    public String getPeopleScale() {
        return peopleScale;
    }

    public void setPeopleScale(String peopleScale) {
        this.peopleScale = peopleScale == null ? null : peopleScale.trim();
    }
}