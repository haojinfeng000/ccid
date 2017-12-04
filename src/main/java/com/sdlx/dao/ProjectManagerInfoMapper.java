package com.sdlx.dao;

import com.sdlx.model.ProjectManagerInfo;

public interface ProjectManagerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectManagerInfo record);

    int insertSelective(ProjectManagerInfo record);

    ProjectManagerInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectManagerInfo record);

    int updateByPrimaryKey(ProjectManagerInfo record);
}