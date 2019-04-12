package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExaminationObjection;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExaminationObjectionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExaminationObjection record);

    int insertSelective(ExaminationObjection record);

    ExaminationObjection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExaminationObjection record);

    int updateByPrimaryKey(ExaminationObjection record);
}