package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Evaluation;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IEvaluationDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    Evaluation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKey(Evaluation record);
}