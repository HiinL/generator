package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.AppVersion;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAppVersionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AppVersion record);

    int insertSelective(AppVersion record);

    AppVersion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppVersion record);

    int updateByPrimaryKey(AppVersion record);
}