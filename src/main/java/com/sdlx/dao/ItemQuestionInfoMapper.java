package com.sdlx.dao;

import com.sdlx.model.ItemQuestionInfo;

public interface ItemQuestionInfoMapper {
    int deleteByPrimaryKey(Integer questId);

    int insert(ItemQuestionInfo record);

    int insertSelective(ItemQuestionInfo record);

    ItemQuestionInfo selectByPrimaryKey(Integer questId);

    int updateByPrimaryKeySelective(ItemQuestionInfo record);

    int updateByPrimaryKey(ItemQuestionInfo record);
}