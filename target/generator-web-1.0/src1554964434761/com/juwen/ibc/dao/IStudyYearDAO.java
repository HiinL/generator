package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudyYear;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudyYearDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudyYear record);

    int insertSelective(StudyYear record);

    StudyYear selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudyYear record);

    int updateByPrimaryKey(StudyYear record);
}