package com.sdlx.dao;

import com.sdlx.model.CompanyProjectReportInfo;

public interface CompanyProjectReportInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyProjectReportInfo record);

    int insertSelective(CompanyProjectReportInfo record);

    CompanyProjectReportInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyProjectReportInfo record);

    int updateByPrimaryKey(CompanyProjectReportInfo record);
}