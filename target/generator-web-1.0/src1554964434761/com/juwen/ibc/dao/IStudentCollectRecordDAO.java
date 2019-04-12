package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentCollectRecord;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentCollectRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentCollectRecord record);

    int insertSelective(StudentCollectRecord record);

    StudentCollectRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentCollectRecord record);

    int updateByPrimaryKey(StudentCollectRecord record);
}