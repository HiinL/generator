package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Profession;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IProfessionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Profession record);

    int insertSelective(Profession record);

    Profession selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Profession record);

    int updateByPrimaryKey(Profession record);
}