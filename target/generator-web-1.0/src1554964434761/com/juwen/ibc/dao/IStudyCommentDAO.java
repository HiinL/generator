package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudyComment;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudyCommentDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudyComment record);

    int insertSelective(StudyComment record);

    StudyComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudyComment record);

    int updateByPrimaryKey(StudyComment record);
}