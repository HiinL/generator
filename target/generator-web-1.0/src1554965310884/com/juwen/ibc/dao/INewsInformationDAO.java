package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.NewsInformation;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface INewsInformationDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsInformation record);

    int insertSelective(NewsInformation record);

    NewsInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsInformation record);

    int updateByPrimaryKeyWithBLOBs(NewsInformation record);

    int updateByPrimaryKey(NewsInformation record);
}