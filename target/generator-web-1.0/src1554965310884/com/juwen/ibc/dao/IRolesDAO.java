package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Roles;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IRolesDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}