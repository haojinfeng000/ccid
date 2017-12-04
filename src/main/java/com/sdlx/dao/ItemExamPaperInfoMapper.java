package com.sdlx.dao;

import com.sdlx.model.ItemExamPaperInfo;

public interface ItemExamPaperInfoMapper {
    int deleteByPrimaryKey(Integer paperId);

    int insert(ItemExamPaperInfo record);

    int insertSelective(ItemExamPaperInfo record);

    ItemExamPaperInfo selectByPrimaryKey(Integer paperId);

    int updateByPrimaryKeySelective(ItemExamPaperInfo record);

    int updateByPrimaryKey(ItemExamPaperInfo record);
}