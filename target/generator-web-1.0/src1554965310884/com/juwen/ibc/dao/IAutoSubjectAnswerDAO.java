package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.AutoSubjectAnswer;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAutoSubjectAnswerDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AutoSubjectAnswer record);

    int insertSelective(AutoSubjectAnswer record);

    AutoSubjectAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AutoSubjectAnswer record);

    int updateByPrimaryKeyWithBLOBs(AutoSubjectAnswer record);

    int updateByPrimaryKey(AutoSubjectAnswer record);
}