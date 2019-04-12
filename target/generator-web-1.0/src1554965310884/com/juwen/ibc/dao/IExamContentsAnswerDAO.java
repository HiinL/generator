package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamContentsAnswer;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamContentsAnswerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamContentsAnswer record);

    int insertSelective(ExamContentsAnswer record);

    ExamContentsAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamContentsAnswer record);

    int updateByPrimaryKeyWithBLOBs(ExamContentsAnswer record);

    int updateByPrimaryKey(ExamContentsAnswer record);
}