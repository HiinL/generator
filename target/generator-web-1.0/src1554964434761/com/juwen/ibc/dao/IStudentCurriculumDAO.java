package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentCurriculum;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentCurriculumDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentCurriculum record);

    int insertSelective(StudentCurriculum record);

    StudentCurriculum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentCurriculum record);

    int updateByPrimaryKey(StudentCurriculum record);
}