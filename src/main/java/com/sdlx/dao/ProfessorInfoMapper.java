package com.sdlx.dao;

import com.sdlx.model.ProfessorInfo;

public interface ProfessorInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProfessorInfo record);

    int insertSelective(ProfessorInfo record);

    ProfessorInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProfessorInfo record);

    int updateByPrimaryKey(ProfessorInfo record);
}