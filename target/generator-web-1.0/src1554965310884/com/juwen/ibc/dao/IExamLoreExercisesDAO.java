package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamLoreExercises;
import com.juwen.ibc.pojo.ExamLoreExercisesWithBLOBs;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamLoreExercisesDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamLoreExercisesWithBLOBs record);

    int insertSelective(ExamLoreExercisesWithBLOBs record);

    ExamLoreExercisesWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamLoreExercisesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ExamLoreExercisesWithBLOBs record);

    int updateByPrimaryKey(ExamLoreExercises record);
}