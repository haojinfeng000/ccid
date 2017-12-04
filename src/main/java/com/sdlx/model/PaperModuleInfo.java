package com.sdlx.model;

public class PaperModuleInfo {
    private Integer id;

    private Integer paperId;

    private Integer unitId;

    private Integer moduleId;

    private Double moduleWeight;

    private String moduleFormula;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Double getModuleWeight() {
        return moduleWeight;
    }

    public void setModuleWeight(Double moduleWeight) {
        this.moduleWeight = moduleWeight;
    }

    public String getModuleFormula() {
        return moduleFormula;
    }

    public void setModuleFormula(String moduleFormula) {
        this.moduleFormula = moduleFormula == null ? null : moduleFormula.trim();
    }
}