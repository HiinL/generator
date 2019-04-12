package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.AdminRoles;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IAdminRolesDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminRoles record);

    int insertSelective(AdminRoles record);

    AdminRoles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminRoles record);

    int updateByPrimaryKey(AdminRoles record);
}