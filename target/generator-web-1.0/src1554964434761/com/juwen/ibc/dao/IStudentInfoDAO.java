package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentInfo;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}