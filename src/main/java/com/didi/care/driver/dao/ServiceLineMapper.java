package com.didi.care.driver.dao;


import com.didi.care.driver.domain.ServiceLine;

public interface ServiceLineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceLine record);

    int insertSelective(ServiceLine record);

    ServiceLine selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceLine record);

    int updateByPrimaryKey(ServiceLine record);
}