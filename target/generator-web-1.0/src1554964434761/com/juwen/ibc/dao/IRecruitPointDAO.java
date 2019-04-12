package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.RecruitPoint;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IRecruitPointDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(RecruitPoint record);

    int insertSelective(RecruitPoint record);

    RecruitPoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecruitPoint record);

    int updateByPrimaryKey(RecruitPoint record);
}