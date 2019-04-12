package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamLoreExercisesProfession;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamLoreExercisesProfessionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamLoreExercisesProfession record);

    int insertSelective(ExamLoreExercisesProfession record);

    ExamLoreExercisesProfession selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamLoreExercisesProfession record);

    int updateByPrimaryKey(ExamLoreExercisesProfession record);
}