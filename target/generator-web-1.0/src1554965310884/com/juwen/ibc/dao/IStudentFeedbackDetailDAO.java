package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentFeedbackDetail;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentFeedbackDetailDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentFeedbackDetail record);

    int insertSelective(StudentFeedbackDetail record);

    StudentFeedbackDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentFeedbackDetail record);

    int updateByPrimaryKey(StudentFeedbackDetail record);
}