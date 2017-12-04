package com.sdlx.dao;

import com.sdlx.model.BaseCompanyType;

public interface BaseCompanyTypeMapper {
    int deleteByPrimaryKey(Integer companyTypeId);

    int insert(BaseCompanyType record);

    int insertSelective(BaseCompanyType record);

    BaseCompanyType selectByPrimaryKey(Integer companyTypeId);

    int updateByPrimaryKeySelective(BaseCompanyType record);

    int updateByPrimaryKey(BaseCompanyType record);
}