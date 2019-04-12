package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Category;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ICategoryDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}