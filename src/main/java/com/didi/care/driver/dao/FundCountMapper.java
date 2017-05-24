package com.didi.care.driver.dao;


import com.didi.care.driver.domain.FundCount;

public interface FundCountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundCount record);

    int insertSelective(FundCount record);

    FundCount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundCount record);

    int updateByPrimaryKey(FundCount record);
}