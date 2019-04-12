package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamQuestionBankType;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamQuestionBankTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamQuestionBankType record);

    int insertSelective(ExamQuestionBankType record);

    ExamQuestionBankType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamQuestionBankType record);

    int updateByPrimaryKey(ExamQuestionBankType record);
}