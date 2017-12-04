package com.sdlx.dao;

import com.sdlx.model.BaseIncomeInfo;

public interface BaseIncomeInfoMapper {
    int deleteByPrimaryKey(Integer incomeScalId);

    int insert(BaseIncomeInfo record);

    int insertSelective(BaseIncomeInfo record);

    BaseIncomeInfo selectByPrimaryKey(Integer incomeScalId);

    int updateByPrimaryKeySelective(BaseIncomeInfo record);

    int updateByPrimaryKey(BaseIncomeInfo record);
}