package com.juwen.ibc.dao;

import com.juwen.ibc.pojo.ContactType;

/**
* Created by Mybatis Generator on 2019/04/11
*/
public interface IContactTypeDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ContactType record);

    int insertSelective(ContactType record);

    ContactType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContactType record);

    int updateByPrimaryKey(ContactType record);
}