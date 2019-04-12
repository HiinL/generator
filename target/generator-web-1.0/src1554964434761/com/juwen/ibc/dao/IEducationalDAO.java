package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Educational;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IEducationalDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Educational record);

    int insertSelective(Educational record);

    Educational selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Educational record);

    int updateByPrimaryKey(Educational record);
}