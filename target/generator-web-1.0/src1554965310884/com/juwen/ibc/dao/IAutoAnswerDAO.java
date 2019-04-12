package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.AutoAnswer;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAutoAnswerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AutoAnswer record);

    int insertSelective(AutoAnswer record);

    AutoAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AutoAnswer record);

    int updateByPrimaryKeyWithBLOBs(AutoAnswer record);

    int updateByPrimaryKey(AutoAnswer record);
}