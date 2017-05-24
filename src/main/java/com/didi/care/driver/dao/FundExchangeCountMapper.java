package com.didi.care.driver.dao;


import com.didi.care.driver.domain.FundExchangeCount;

public interface FundExchangeCountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundExchangeCount record);

    int insertSelective(FundExchangeCount record);

    FundExchangeCount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundExchangeCount record);

    int updateByPrimaryKey(FundExchangeCount record);
}