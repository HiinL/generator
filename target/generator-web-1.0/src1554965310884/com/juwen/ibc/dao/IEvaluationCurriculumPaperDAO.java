package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.EvaluationCurriculumPaper;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IEvaluationCurriculumPaperDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(EvaluationCurriculumPaper record);

    int insertSelective(EvaluationCurriculumPaper record);

    EvaluationCurriculumPaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EvaluationCurriculumPaper record);

    int updateByPrimaryKey(EvaluationCurriculumPaper record);
}