package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.AutoSubjectDetail;
import com.juwen.ibc.pojo.AutoSubjectDetailWithBLOBs;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAutoSubjectDetailDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AutoSubjectDetailWithBLOBs record);

    int insertSelective(AutoSubjectDetailWithBLOBs record);

    AutoSubjectDetailWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AutoSubjectDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AutoSubjectDetailWithBLOBs record);

    int updateByPrimaryKey(AutoSubjectDetail record);
}