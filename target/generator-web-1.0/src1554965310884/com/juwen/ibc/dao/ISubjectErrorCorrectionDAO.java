package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SubjectErrorCorrection;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISubjectErrorCorrectionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SubjectErrorCorrection record);

    int insertSelective(SubjectErrorCorrection record);

    SubjectErrorCorrection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SubjectErrorCorrection record);

    int updateByPrimaryKey(SubjectErrorCorrection record);
}