package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamQuestionBank;
import com.juwen.ibc.pojo.ExamQuestionBankWithBLOBs;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamQuestionBankDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamQuestionBankWithBLOBs record);

    int insertSelective(ExamQuestionBankWithBLOBs record);

    ExamQuestionBankWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamQuestionBankWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ExamQuestionBankWithBLOBs record);

    int updateByPrimaryKey(ExamQuestionBank record);
}