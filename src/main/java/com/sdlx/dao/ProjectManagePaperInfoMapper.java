package com.sdlx.dao;

import com.sdlx.model.ProjectManagePaperInfo;

public interface ProjectManagePaperInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectManagePaperInfo record);

    int insertSelective(ProjectManagePaperInfo record);

    ProjectManagePaperInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectManagePaperInfo record);

    int updateByPrimaryKey(ProjectManagePaperInfo record);
}