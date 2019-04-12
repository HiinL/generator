package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentStudyNotes;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentStudyNotesDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentStudyNotes record);

    int insertSelective(StudentStudyNotes record);

    StudentStudyNotes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentStudyNotes record);

    int updateByPrimaryKey(StudentStudyNotes record);
}