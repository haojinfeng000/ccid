package com.sdlx.dao;

import com.sdlx.model.ProfessorReportInfo;

public interface ProfessorReportInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProfessorReportInfo record);

    int insertSelective(ProfessorReportInfo record);

    ProfessorReportInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProfessorReportInfo record);

    int updateByPrimaryKey(ProfessorReportInfo record);
}