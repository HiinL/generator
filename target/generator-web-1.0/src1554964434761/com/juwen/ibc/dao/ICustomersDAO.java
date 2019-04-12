package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Customers;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ICustomersDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Customers record);

    int insertSelective(Customers record);

    Customers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customers record);

    int updateByPrimaryKeyWithBLOBs(Customers record);

    int updateByPrimaryKey(Customers record);
}