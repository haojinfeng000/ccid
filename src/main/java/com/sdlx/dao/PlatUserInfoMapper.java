package com.sdlx.dao;

import com.sdlx.model.PlatUserInfo;

public interface PlatUserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlatUserInfo record);

    int insertSelective(PlatUserInfo record);

    PlatUserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlatUserInfo record);

    int updateByPrimaryKey(PlatUserInfo record);
}