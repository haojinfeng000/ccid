package com.sdlx.model;

public class BaseIncomeInfo {
    private Integer incomeScalId;

    private String incomeScal;

    public Integer getIncomeScalId() {
        return incomeScalId;
    }

    public void setIncomeScalId(Integer incomeScalId) {
        this.incomeScalId = incomeScalId;
    }

    public String getIncomeScal() {
        return incomeScal;
    }

    public void setIncomeScal(String incomeScal) {
        this.incomeScal = incomeScal == null ? null : incomeScal.trim();
    }
}