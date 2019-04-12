package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemVideoDetail;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemVideoDetailDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemVideoDetail record);

    int insertSelective(SystemVideoDetail record);

    SystemVideoDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemVideoDetail record);

    int updateByPrimaryKey(SystemVideoDetail record);
}