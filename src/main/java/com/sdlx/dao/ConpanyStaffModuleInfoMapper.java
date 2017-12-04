package com.sdlx.dao;

import com.sdlx.model.ConpanyStaffModuleInfo;
import com.sdlx.model.ConpanyStaffModuleInfoKey;

public interface ConpanyStaffModuleInfoMapper {
    int deleteByPrimaryKey(ConpanyStaffModuleInfoKey key);

    int insert(ConpanyStaffModuleInfo record);

    int insertSelective(ConpanyStaffModuleInfo record);

    ConpanyStaffModuleInfo selectByPrimaryKey(ConpanyStaffModuleInfoKey key);

    int updateByPrimaryKeySelective(ConpanyStaffModuleInfo record);

    int updateByPrimaryKey(ConpanyStaffModuleInfo record);
}