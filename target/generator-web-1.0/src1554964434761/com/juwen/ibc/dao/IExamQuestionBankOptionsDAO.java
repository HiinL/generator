package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamQuestionBankOptions;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamQuestionBankOptionsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamQuestionBankOptions record);

    int insertSelective(ExamQuestionBankOptions record);

    ExamQuestionBankOptions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamQuestionBankOptions record);

    int updateByPrimaryKeyWithBLOBs(ExamQuestionBankOptions record);

    int updateByPrimaryKey(ExamQuestionBankOptions record);
}