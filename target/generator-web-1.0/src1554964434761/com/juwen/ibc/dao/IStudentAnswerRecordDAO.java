package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentAnswerRecord;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentAnswerRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentAnswerRecord record);

    int insertSelective(StudentAnswerRecord record);

    StudentAnswerRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentAnswerRecord record);

    int updateByPrimaryKeyWithBLOBs(StudentAnswerRecord record);

    int updateByPrimaryKey(StudentAnswerRecord record);
}