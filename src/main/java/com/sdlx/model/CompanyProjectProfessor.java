package com.sdlx.model;

import java.util.Date;

public class CompanyProjectProfessor {
    private Integer id;

    private Integer companyProjectId;

    private Integer professorId;

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

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
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