package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentNotice;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentNoticeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentNotice record);

    int insertSelective(StudentNotice record);

    StudentNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentNotice record);

    int updateByPrimaryKey(StudentNotice record);
}