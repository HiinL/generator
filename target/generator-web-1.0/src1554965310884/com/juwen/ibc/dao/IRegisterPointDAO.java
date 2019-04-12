package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.RegisterPoint;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IRegisterPointDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterPoint record);

    int insertSelective(RegisterPoint record);

    RegisterPoint selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterPoint record);

    int updateByPrimaryKey(RegisterPoint record);
}