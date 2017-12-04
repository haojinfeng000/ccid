package com.sdlx.dao;

import com.sdlx.model.BaseModuleInfo;

public interface BaseModuleInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseModuleInfo record);

    int insertSelective(BaseModuleInfo record);

    BaseModuleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseModuleInfo record);

    int updateByPrimaryKey(BaseModuleInfo record);
}