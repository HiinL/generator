package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.CrmFromType;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ICrmFromTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CrmFromType record);

    int insertSelective(CrmFromType record);

    CrmFromType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrmFromType record);

    int updateByPrimaryKey(CrmFromType record);
}