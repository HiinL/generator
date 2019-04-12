package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemStudentFileDataType;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemStudentFileDataTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemStudentFileDataType record);

    int insertSelective(SystemStudentFileDataType record);

    SystemStudentFileDataType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemStudentFileDataType record);

    int updateByPrimaryKey(SystemStudentFileDataType record);
}