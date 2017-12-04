package com.sdlx.dao;

import com.sdlx.model.BaseIndustryInfo;

public interface BaseIndustryInfoMapper {
    int deleteByPrimaryKey(Integer industryId);

    int insert(BaseIndustryInfo record);

    int insertSelective(BaseIndustryInfo record);

    BaseIndustryInfo selectByPrimaryKey(Integer industryId);

    int updateByPrimaryKeySelective(BaseIndustryInfo record);

    int updateByPrimaryKey(BaseIndustryInfo record);
}