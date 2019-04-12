package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.School;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISchoolDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}