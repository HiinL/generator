package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Functions;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IFunctionsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Functions record);

    int insertSelective(Functions record);

    Functions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Functions record);

    int updateByPrimaryKey(Functions record);
}