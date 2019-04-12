package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Curriculum;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ICurriculumDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    Curriculum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
}