package com.sdlx.dao;

import com.sdlx.model.ProjectManageReportInfo;

public interface ProjectManageReportInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectManageReportInfo record);

    int insertSelective(ProjectManageReportInfo record);

    ProjectManageReportInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectManageReportInfo record);

    int updateByPrimaryKey(ProjectManageReportInfo record);
}