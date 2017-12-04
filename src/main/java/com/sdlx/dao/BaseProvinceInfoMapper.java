package com.sdlx.dao;

import com.sdlx.model.BaseProvinceInfo;

public interface BaseProvinceInfoMapper {
    int deleteByPrimaryKey(Integer provinceId);

    int insert(BaseProvinceInfo record);

    int insertSelective(BaseProvinceInfo record);

    BaseProvinceInfo selectByPrimaryKey(Integer provinceId);

    int updateByPrimaryKeySelective(BaseProvinceInfo record);

    int updateByPrimaryKey(BaseProvinceInfo record);
}