package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.SystemVideoCurriculum;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface ISystemVideoCurriculumDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemVideoCurriculum record);

    int insertSelective(SystemVideoCurriculum record);

    SystemVideoCurriculum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemVideoCurriculum record);

    int updateByPrimaryKey(SystemVideoCurriculum record);
}