package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentPay;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentPayDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentPay record);

    int insertSelective(StudentPay record);

    StudentPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentPay record);

    int updateByPrimaryKey(StudentPay record);
}