package com.sdlx.dao;

import com.sdlx.model.BaseDeptInfo;

public interface BaseDeptInfoMapper {
    int deleteByPrimaryKey(Integer deptId);

    int insert(BaseDeptInfo record);

    int insertSelective(BaseDeptInfo record);

    BaseDeptInfo selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(BaseDeptInfo record);

    int updateByPrimaryKey(BaseDeptInfo record);
}