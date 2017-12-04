package com.sdlx.model;

public class BaseCompanyType {
    private Integer companyTypeId;

    private String companyTypeName;

    public Integer getCompanyTypeId() {
        return companyTypeId;
    }

    public void setCompanyTypeId(Integer companyTypeId) {
        this.companyTypeId = companyTypeId;
    }

    public String getCompanyTypeName() {
        return companyTypeName;
    }

    public void setCompanyTypeName(String companyTypeName) {
        this.companyTypeName = companyTypeName == null ? null : companyTypeName.trim();
    }
}