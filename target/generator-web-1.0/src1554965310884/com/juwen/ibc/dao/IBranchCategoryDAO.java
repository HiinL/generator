package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.BranchCategory;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IBranchCategoryDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(BranchCategory record);

    int insertSelective(BranchCategory record);

    BranchCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BranchCategory record);

    int updateByPrimaryKey(BranchCategory record);
}