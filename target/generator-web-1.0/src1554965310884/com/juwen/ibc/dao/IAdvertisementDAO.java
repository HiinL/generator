package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Advertisement;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAdvertisementDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Advertisement record);

    int insertSelective(Advertisement record);

    Advertisement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Advertisement record);

    int updateByPrimaryKey(Advertisement record);
}