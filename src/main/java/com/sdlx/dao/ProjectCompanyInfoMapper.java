package com.sdlx.dao;

import com.sdlx.model.ProjectCompanyInfo;

public interface ProjectCompanyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectCompanyInfo record);

    int insertSelective(ProjectCompanyInfo record);

    ProjectCompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectCompanyInfo record);

    int updateByPrimaryKey(ProjectCompanyInfo record);
}