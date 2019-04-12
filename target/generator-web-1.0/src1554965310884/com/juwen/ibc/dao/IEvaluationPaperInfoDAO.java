package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.EvaluationPaperInfo;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IEvaluationPaperInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(EvaluationPaperInfo record);

    int insertSelective(EvaluationPaperInfo record);

    EvaluationPaperInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EvaluationPaperInfo record);

    int updateByPrimaryKey(EvaluationPaperInfo record);
}