package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.AutoSubtype;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAutoSubtypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AutoSubtype record);

    int insertSelective(AutoSubtype record);

    AutoSubtype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AutoSubtype record);

    int updateByPrimaryKey(AutoSubtype record);
}