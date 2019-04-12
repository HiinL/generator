package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.AutoSubjectStudentAnswerProgress;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAutoSubjectStudentAnswerProgressDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AutoSubjectStudentAnswerProgress record);

    int insertSelective(AutoSubjectStudentAnswerProgress record);

    AutoSubjectStudentAnswerProgress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AutoSubjectStudentAnswerProgress record);

    int updateByPrimaryKey(AutoSubjectStudentAnswerProgress record);
}