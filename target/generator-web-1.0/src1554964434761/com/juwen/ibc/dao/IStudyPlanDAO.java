package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudyPlan;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudyPlanDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudyPlan record);

    int insertSelective(StudyPlan record);

    StudyPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudyPlan record);

    int updateByPrimaryKey(StudyPlan record);
}