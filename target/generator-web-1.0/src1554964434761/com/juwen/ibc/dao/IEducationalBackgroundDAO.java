package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.EducationalBackground;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IEducationalBackgroundDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(EducationalBackground record);

    int insertSelective(EducationalBackground record);

    EducationalBackground selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EducationalBackground record);

    int updateByPrimaryKey(EducationalBackground record);
}