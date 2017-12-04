package com.sdlx.dao;

import com.sdlx.model.ItemQuestionOptionInfo;

public interface ItemQuestionOptionInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemQuestionOptionInfo record);

    int insertSelective(ItemQuestionOptionInfo record);

    ItemQuestionOptionInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemQuestionOptionInfo record);

    int updateByPrimaryKey(ItemQuestionOptionInfo record);
}