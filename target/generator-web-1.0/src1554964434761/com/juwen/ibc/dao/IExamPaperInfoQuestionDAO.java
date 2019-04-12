package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamPaperInfoQuestion;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamPaperInfoQuestionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamPaperInfoQuestion record);

    int insertSelective(ExamPaperInfoQuestion record);

    ExamPaperInfoQuestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamPaperInfoQuestion record);

    int updateByPrimaryKey(ExamPaperInfoQuestion record);
}