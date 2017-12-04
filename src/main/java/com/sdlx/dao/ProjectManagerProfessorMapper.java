package com.sdlx.dao;

import com.sdlx.model.ProjectManagerProfessor;

public interface ProjectManagerProfessorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectManagerProfessor record);

    int insertSelective(ProjectManagerProfessor record);

    ProjectManagerProfessor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectManagerProfessor record);

    int updateByPrimaryKey(ProjectManagerProfessor record);
}