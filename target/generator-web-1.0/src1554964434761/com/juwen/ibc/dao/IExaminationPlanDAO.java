package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExaminationPlan;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExaminationPlanDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExaminationPlan record);

    int insertSelective(ExaminationPlan record);

    ExaminationPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExaminationPlan record);

    int updateByPrimaryKey(ExaminationPlan record);
}