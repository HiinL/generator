package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentInfoDetail;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentInfoDetailDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfoDetail record);

    int insertSelective(StudentInfoDetail record);

    StudentInfoDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentInfoDetail record);

    int updateByPrimaryKey(StudentInfoDetail record);
}