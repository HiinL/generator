package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamOptionAnswer;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamOptionAnswerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamOptionAnswer record);

    int insertSelective(ExamOptionAnswer record);

    ExamOptionAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamOptionAnswer record);

    int updateByPrimaryKey(ExamOptionAnswer record);
}