package com.sdlx.dao;

import com.sdlx.model.ObserverInfo;

public interface ObserverInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ObserverInfo record);

    int insertSelective(ObserverInfo record);

    ObserverInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ObserverInfo record);

    int updateByPrimaryKey(ObserverInfo record);
}