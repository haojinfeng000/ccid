package com.sdlx.dao;

import com.sdlx.model.BasePeopleScalInfo;

public interface BasePeopleScalInfoMapper {
    int deleteByPrimaryKey(Integer peopleScaleId);

    int insert(BasePeopleScalInfo record);

    int insertSelective(BasePeopleScalInfo record);

    BasePeopleScalInfo selectByPrimaryKey(Integer peopleScaleId);

    int updateByPrimaryKeySelective(BasePeopleScalInfo record);

    int updateByPrimaryKey(BasePeopleScalInfo record);
}