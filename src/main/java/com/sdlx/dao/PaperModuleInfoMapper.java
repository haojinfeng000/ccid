package com.sdlx.dao;

import com.sdlx.model.PaperModuleInfo;

public interface PaperModuleInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaperModuleInfo record);

    int insertSelective(PaperModuleInfo record);

    PaperModuleInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperModuleInfo record);

    int updateByPrimaryKey(PaperModuleInfo record);
}