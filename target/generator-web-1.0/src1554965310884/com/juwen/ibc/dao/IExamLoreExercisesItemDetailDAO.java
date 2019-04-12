package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ExamLoreExercisesItemDetail;
import com.juwen.ibc.pojo.ExamLoreExercisesItemDetailWithBLOBs;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IExamLoreExercisesItemDetailDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamLoreExercisesItemDetailWithBLOBs record);

    int insertSelective(ExamLoreExercisesItemDetailWithBLOBs record);

    ExamLoreExercisesItemDetailWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamLoreExercisesItemDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ExamLoreExercisesItemDetailWithBLOBs record);

    int updateByPrimaryKey(ExamLoreExercisesItemDetail record);
}