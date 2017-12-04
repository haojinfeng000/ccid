package com.sdlx.dao;

import com.sdlx.model.PlatUserReportInfo;

public interface PlatUserReportInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlatUserReportInfo record);

    int insertSelective(PlatUserReportInfo record);

    PlatUserReportInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlatUserReportInfo record);

    int updateByPrimaryKey(PlatUserReportInfo record);
}