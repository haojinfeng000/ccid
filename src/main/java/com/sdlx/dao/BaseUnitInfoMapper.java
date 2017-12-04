package com.sdlx.dao;

import com.sdlx.model.BaseUnitInfo;

public interface BaseUnitInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseUnitInfo record);

    int insertSelective(BaseUnitInfo record);

    BaseUnitInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseUnitInfo record);

    int updateByPrimaryKey(BaseUnitInfo record);
}