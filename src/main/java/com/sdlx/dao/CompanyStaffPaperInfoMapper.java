package com.sdlx.dao;

import com.sdlx.model.CompanyStaffPaperInfo;

public interface CompanyStaffPaperInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyStaffPaperInfo record);

    int insertSelective(CompanyStaffPaperInfo record);

    CompanyStaffPaperInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyStaffPaperInfo record);

    int updateByPrimaryKey(CompanyStaffPaperInfo record);
}