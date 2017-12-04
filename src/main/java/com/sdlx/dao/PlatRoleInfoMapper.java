package com.sdlx.dao;

import com.sdlx.model.PlatRoleInfo;

public interface PlatRoleInfoMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(PlatRoleInfo record);

    int insertSelective(PlatRoleInfo record);

    PlatRoleInfo selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(PlatRoleInfo record);

    int updateByPrimaryKey(PlatRoleInfo record);
}