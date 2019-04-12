package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentStudyRecord;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentStudyRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentStudyRecord record);

    int insertSelective(StudentStudyRecord record);

    StudentStudyRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentStudyRecord record);

    int updateByPrimaryKey(StudentStudyRecord record);
}