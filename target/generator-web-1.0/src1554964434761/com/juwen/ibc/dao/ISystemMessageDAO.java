package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemMessage;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemMessageDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemMessage record);

    int insertSelective(SystemMessage record);

    SystemMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemMessage record);

    int updateByPrimaryKey(SystemMessage record);
}