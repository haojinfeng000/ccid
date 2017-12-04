package com.sdlx.dao;

import com.sdlx.model.PlatRoleModuleInfo;
import com.sdlx.model.PlatRoleModuleInfoKey;

public interface PlatRoleModuleInfoMapper {
    int deleteByPrimaryKey(PlatRoleModuleInfoKey key);

    int insert(PlatRoleModuleInfo record);

    int insertSelective(PlatRoleModuleInfo record);

    PlatRoleModuleInfo selectByPrimaryKey(PlatRoleModuleInfoKey key);

    int updateByPrimaryKeySelective(PlatRoleModuleInfo record);

    int updateByPrimaryKey(PlatRoleModuleInfo record);
}