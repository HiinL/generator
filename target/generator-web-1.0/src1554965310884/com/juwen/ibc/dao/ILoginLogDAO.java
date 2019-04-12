package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.LoginLog;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ILoginLogDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}