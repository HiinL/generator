package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ProfessionCurriculum;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IProfessionCurriculumDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ProfessionCurriculum record);

    int insertSelective(ProfessionCurriculum record);

    ProfessionCurriculum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProfessionCurriculum record);

    int updateByPrimaryKey(ProfessionCurriculum record);
}