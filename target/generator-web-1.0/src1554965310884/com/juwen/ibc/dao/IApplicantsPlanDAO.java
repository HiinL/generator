package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ApplicantsPlan;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IApplicantsPlanDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplicantsPlan record);

    int insertSelective(ApplicantsPlan record);

    ApplicantsPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplicantsPlan record);

    int updateByPrimaryKey(ApplicantsPlan record);
}