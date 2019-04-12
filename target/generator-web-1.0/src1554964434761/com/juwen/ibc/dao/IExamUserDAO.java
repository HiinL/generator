package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamUser;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamUserDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamUser record);

    int insertSelective(ExamUser record);

    ExamUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamUser record);

    int updateByPrimaryKey(ExamUser record);
}