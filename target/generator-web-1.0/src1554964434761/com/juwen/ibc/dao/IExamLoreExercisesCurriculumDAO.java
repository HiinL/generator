package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamLoreExercisesCurriculum;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamLoreExercisesCurriculumDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamLoreExercisesCurriculum record);

    int insertSelective(ExamLoreExercisesCurriculum record);

    ExamLoreExercisesCurriculum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamLoreExercisesCurriculum record);

    int updateByPrimaryKey(ExamLoreExercisesCurriculum record);
}