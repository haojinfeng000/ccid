package com.sdlx.dao;

import com.sdlx.model.PaperUnitInfo;

public interface PaperUnitInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaperUnitInfo record);

    int insertSelective(PaperUnitInfo record);

    PaperUnitInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperUnitInfo record);

    int updateByPrimaryKey(PaperUnitInfo record);
}