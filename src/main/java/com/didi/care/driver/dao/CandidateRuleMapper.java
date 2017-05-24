package com.didi.care.driver.dao;


import com.didi.care.driver.domain.CandidateRule;

public interface CandidateRuleMapper {
    int deleteByPrimaryKey(Integer candidateRuleId);

    int insert(CandidateRule record);

    int insertSelective(CandidateRule record);

    CandidateRule selectByPrimaryKey(Integer candidateRuleId);

    int updateByPrimaryKeySelective(CandidateRule record);

    int updateByPrimaryKey(CandidateRule record);
}