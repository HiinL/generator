package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentFeedback;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentFeedbackDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentFeedback record);

    int insertSelective(StudentFeedback record);

    StudentFeedback selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentFeedback record);

    int updateByPrimaryKey(StudentFeedback record);
}