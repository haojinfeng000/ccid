package com.sdlx.dao;

import com.sdlx.model.BaseCityInfo;

public interface BaseCityInfoMapper {
    int deleteByPrimaryKey(Integer cityId);

    int insert(BaseCityInfo record);

    int insertSelective(BaseCityInfo record);

    BaseCityInfo selectByPrimaryKey(Integer cityId);

    int updateByPrimaryKeySelective(BaseCityInfo record);

    int updateByPrimaryKey(BaseCityInfo record);
}