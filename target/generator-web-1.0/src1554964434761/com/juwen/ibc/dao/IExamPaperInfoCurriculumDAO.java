package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamPaperInfoCurriculum;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamPaperInfoCurriculumDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamPaperInfoCurriculum record);

    int insertSelective(ExamPaperInfoCurriculum record);

    ExamPaperInfoCurriculum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamPaperInfoCurriculum record);

    int updateByPrimaryKey(ExamPaperInfoCurriculum record);
}