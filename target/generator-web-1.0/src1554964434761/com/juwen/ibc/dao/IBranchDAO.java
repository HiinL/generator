package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Branch;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IBranchDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Branch record);

    int insertSelective(Branch record);

    Branch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Branch record);

    int updateByPrimaryKey(Branch record);
}