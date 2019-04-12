package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemVideoPlayRecord;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemVideoPlayRecordDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemVideoPlayRecord record);

    int insertSelective(SystemVideoPlayRecord record);

    SystemVideoPlayRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemVideoPlayRecord record);

    int updateByPrimaryKey(SystemVideoPlayRecord record);
}