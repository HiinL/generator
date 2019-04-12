package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemVideoProfession;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemVideoProfessionDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemVideoProfession record);

    int insertSelective(SystemVideoProfession record);

    SystemVideoProfession selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemVideoProfession record);

    int updateByPrimaryKey(SystemVideoProfession record);
}