package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamPaperInfo;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamPaperInfoDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamPaperInfo record);

    int insertSelective(ExamPaperInfo record);

    ExamPaperInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamPaperInfo record);

    int updateByPrimaryKeyWithBLOBs(ExamPaperInfo record);

    int updateByPrimaryKey(ExamPaperInfo record);
}