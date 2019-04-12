package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamPaperInfoQuestionType;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamPaperInfoQuestionTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamPaperInfoQuestionType record);

    int insertSelective(ExamPaperInfoQuestionType record);

    ExamPaperInfoQuestionType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamPaperInfoQuestionType record);

    int updateByPrimaryKey(ExamPaperInfoQuestionType record);
}