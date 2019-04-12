package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ProfessionSchool;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IProfessionSchoolDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ProfessionSchool record);

    int insertSelective(ProfessionSchool record);

    ProfessionSchool selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProfessionSchool record);

    int updateByPrimaryKey(ProfessionSchool record);
}