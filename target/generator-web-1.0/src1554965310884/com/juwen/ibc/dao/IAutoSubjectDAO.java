package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.AutoSubject;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAutoSubjectDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AutoSubject record);

    int insertSelective(AutoSubject record);

    AutoSubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AutoSubject record);

    int updateByPrimaryKeyWithBLOBs(AutoSubject record);

    int updateByPrimaryKey(AutoSubject record);
}