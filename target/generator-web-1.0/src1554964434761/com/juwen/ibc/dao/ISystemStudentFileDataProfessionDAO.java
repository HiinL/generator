package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemStudentFileDataProfession;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemStudentFileDataProfessionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemStudentFileDataProfession record);

    int insertSelective(SystemStudentFileDataProfession record);

    SystemStudentFileDataProfession selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemStudentFileDataProfession record);

    int updateByPrimaryKey(SystemStudentFileDataProfession record);
}