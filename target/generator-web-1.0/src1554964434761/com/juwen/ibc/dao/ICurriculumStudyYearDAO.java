package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.CurriculumStudyYear;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ICurriculumStudyYearDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CurriculumStudyYear record);

    int insertSelective(CurriculumStudyYear record);

    CurriculumStudyYear selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CurriculumStudyYear record);

    int updateByPrimaryKey(CurriculumStudyYear record);
}