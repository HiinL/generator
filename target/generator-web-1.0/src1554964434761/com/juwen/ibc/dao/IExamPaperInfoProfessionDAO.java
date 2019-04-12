package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamPaperInfoProfession;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamPaperInfoProfessionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamPaperInfoProfession record);

    int insertSelective(ExamPaperInfoProfession record);

    ExamPaperInfoProfession selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamPaperInfoProfession record);

    int updateByPrimaryKey(ExamPaperInfoProfession record);
}