package com.sdlx.model;

public class ProfessorPaperInfoKey {
    private Integer professorId;

    private Integer companyProjectId;

    private Integer moduleId;

    private Integer paperId;

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public Integer getCompanyProjectId() {
        return companyProjectId;
    }

    public void setCompanyProjectId(Integer companyProjectId) {
        this.companyProjectId = companyProjectId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }
}