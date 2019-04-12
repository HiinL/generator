package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Notices;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface INoticesDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Notices record);

    int insertSelective(Notices record);

    Notices selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Notices record);

    int updateByPrimaryKey(Notices record);
}