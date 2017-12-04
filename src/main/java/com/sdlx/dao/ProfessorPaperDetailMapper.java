package com.sdlx.dao;

import com.sdlx.model.ProfessorPaperDetail;

public interface ProfessorPaperDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProfessorPaperDetail record);

    int insertSelective(ProfessorPaperDetail record);

    ProfessorPaperDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProfessorPaperDetail record);

    int updateByPrimaryKey(ProfessorPaperDetail record);
}