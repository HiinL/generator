package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Classes;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IClassesDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}