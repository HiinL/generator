package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.Region;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IRegionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);
}