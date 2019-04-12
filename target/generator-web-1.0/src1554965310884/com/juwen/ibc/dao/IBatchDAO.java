package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Batch;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IBatchDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Batch record);

    int insertSelective(Batch record);

    Batch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Batch record);

    int updateByPrimaryKey(Batch record);
}