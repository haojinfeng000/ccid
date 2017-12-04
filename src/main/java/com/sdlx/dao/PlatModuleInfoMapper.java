package com.sdlx.dao;

import com.sdlx.model.PlatModuleInfo;

public interface PlatModuleInfoMapper {
    int deleteByPrimaryKey(Integer moduleId);

    int insert(PlatModuleInfo record);

    int insertSelective(PlatModuleInfo record);

    PlatModuleInfo selectByPrimaryKey(Integer moduleId);

    int updateByPrimaryKeySelective(PlatModuleInfo record);

    int updateByPrimaryKey(PlatModuleInfo record);
}