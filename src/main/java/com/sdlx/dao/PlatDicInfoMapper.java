package com.sdlx.dao;

import com.sdlx.model.PlatDicInfo;

public interface PlatDicInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlatDicInfo record);

    int insertSelective(PlatDicInfo record);

    PlatDicInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlatDicInfo record);

    int updateByPrimaryKey(PlatDicInfo record);
}