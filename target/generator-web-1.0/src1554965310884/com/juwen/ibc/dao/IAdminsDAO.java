package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Admins;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAdminsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Admins record);

    int insertSelective(Admins record);

    Admins selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admins record);

    int updateByPrimaryKey(Admins record);
}