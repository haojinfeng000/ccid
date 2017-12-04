package com.sdlx.dao;

import com.sdlx.model.CompanyProjectProfessor;

public interface CompanyProjectProfessorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyProjectProfessor record);

    int insertSelective(CompanyProjectProfessor record);

    CompanyProjectProfessor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyProjectProfessor record);

    int updateByPrimaryKey(CompanyProjectProfessor record);
}