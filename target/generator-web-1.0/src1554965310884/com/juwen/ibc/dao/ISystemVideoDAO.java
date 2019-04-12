package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemVideo;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemVideoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemVideo record);

    int insertSelective(SystemVideo record);

    SystemVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemVideo record);

    int updateByPrimaryKey(SystemVideo record);
}