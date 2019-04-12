package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemStudentFileDataCurriculum;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemStudentFileDataCurriculumDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemStudentFileDataCurriculum record);

    int insertSelective(SystemStudentFileDataCurriculum record);

    SystemStudentFileDataCurriculum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemStudentFileDataCurriculum record);

    int updateByPrimaryKey(SystemStudentFileDataCurriculum record);
}