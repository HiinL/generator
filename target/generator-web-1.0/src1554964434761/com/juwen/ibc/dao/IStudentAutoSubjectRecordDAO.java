package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudentAutoSubjectRecord;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudentAutoSubjectRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentAutoSubjectRecord record);

    int insertSelective(StudentAutoSubjectRecord record);

    StudentAutoSubjectRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentAutoSubjectRecord record);

    int updateByPrimaryKeyWithBLOBs(StudentAutoSubjectRecord record);

    int updateByPrimaryKey(StudentAutoSubjectRecord record);
}