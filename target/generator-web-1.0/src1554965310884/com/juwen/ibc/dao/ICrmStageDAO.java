package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.CrmStage;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ICrmStageDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(CrmStage record);

    int insertSelective(CrmStage record);

    CrmStage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CrmStage record);

    int updateByPrimaryKey(CrmStage record);
}