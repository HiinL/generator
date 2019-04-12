package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExaminationScore;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExaminationScoreDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExaminationScore record);

    int insertSelective(ExaminationScore record);

    ExaminationScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExaminationScore record);

    int updateByPrimaryKey(ExaminationScore record);
}