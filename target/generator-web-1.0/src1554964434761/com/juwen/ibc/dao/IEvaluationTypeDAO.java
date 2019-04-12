package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.EvaluationType;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IEvaluationTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(EvaluationType record);

    int insertSelective(EvaluationType record);

    EvaluationType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EvaluationType record);

    int updateByPrimaryKey(EvaluationType record);
}