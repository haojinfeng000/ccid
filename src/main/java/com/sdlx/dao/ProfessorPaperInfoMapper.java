package com.sdlx.dao;

import com.sdlx.model.ProfessorPaperInfo;
import com.sdlx.model.ProfessorPaperInfoKey;

public interface ProfessorPaperInfoMapper {
    int deleteByPrimaryKey(ProfessorPaperInfoKey key);

    int insert(ProfessorPaperInfo record);

    int insertSelective(ProfessorPaperInfo record);

    ProfessorPaperInfo selectByPrimaryKey(ProfessorPaperInfoKey key);

    int updateByPrimaryKeySelective(ProfessorPaperInfo record);

    int updateByPrimaryKey(ProfessorPaperInfo record);
}