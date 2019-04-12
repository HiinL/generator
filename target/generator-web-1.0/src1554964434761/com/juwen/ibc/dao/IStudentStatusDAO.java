package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentStatus;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentStatusDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentStatus record);

    int insertSelective(StudentStatus record);

    StudentStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentStatus record);

    int updateByPrimaryKey(StudentStatus record);
}