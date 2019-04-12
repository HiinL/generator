package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.StudyCommentLikeRecord;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IStudyCommentLikeRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(StudyCommentLikeRecord record);

    int insertSelective(StudyCommentLikeRecord record);

    StudyCommentLikeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudyCommentLikeRecord record);

    int updateByPrimaryKey(StudyCommentLikeRecord record);
}