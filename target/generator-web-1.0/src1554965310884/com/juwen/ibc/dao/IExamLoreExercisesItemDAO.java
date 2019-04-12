package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamLoreExercisesItem;
import com.juwen.ibc.pojo.ExamLoreExercisesItemWithBLOBs;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamLoreExercisesItemDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamLoreExercisesItemWithBLOBs record);

    int insertSelective(ExamLoreExercisesItemWithBLOBs record);

    ExamLoreExercisesItemWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamLoreExercisesItemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ExamLoreExercisesItemWithBLOBs record);

    int updateByPrimaryKey(ExamLoreExercisesItem record);
}