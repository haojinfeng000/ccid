package com.sdlx.dao;

import com.sdlx.model.CompanyStaffInfo;

public interface CompanyStaffInfoMapper {
    int deleteByPrimaryKey(Integer staffId);

    int insert(CompanyStaffInfo record);

    int insertSelective(CompanyStaffInfo record);

    CompanyStaffInfo selectByPrimaryKey(Integer staffId);

    int updateByPrimaryKeySelective(CompanyStaffInfo record);

    int updateByPrimaryKey(CompanyStaffInfo record);
}