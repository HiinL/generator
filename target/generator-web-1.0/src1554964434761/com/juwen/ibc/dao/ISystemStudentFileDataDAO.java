package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemStudentFileData;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemStudentFileDataDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemStudentFileData record);

    int insertSelective(SystemStudentFileData record);

    SystemStudentFileData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemStudentFileData record);

    int updateByPrimaryKeyWithBLOBs(SystemStudentFileData record);

    int updateByPrimaryKey(SystemStudentFileData record);
}