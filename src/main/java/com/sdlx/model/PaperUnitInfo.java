package com.sdlx.model;

public class PaperUnitInfo {
    private Integer id;

    private Integer paperId;

    private Integer unitId;

    private Double unitWeight;

    private String unitFormula;

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

    public Double getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Double unitWeight) {
        this.unitWeight = unitWeight;
    }

    public String getUnitFormula() {
        return unitFormula;
    }

    public void setUnitFormula(String unitFormula) {
        this.unitFormula = unitFormula == null ? null : unitFormula.trim();
    }
}