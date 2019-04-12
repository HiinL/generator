package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SendMessageLogs;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISendMessageLogsDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SendMessageLogs record);

    int insertSelective(SendMessageLogs record);

    SendMessageLogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SendMessageLogs record);

    int updateByPrimaryKey(SendMessageLogs record);
}