package com.didi.care.driver.domain;

import java.util.Date;

public class CandidateRule {
    private Integer candidateRuleId;

    private String candidateRule;

    private String candidateRuleDescription;

    private Integer areaId;

    private Double compensatoryFund;

    private String subruleIdList;

    private Date createTime;

    public Integer getCandidateRuleId() {
        return candidateRuleId;
    }

    public void setCandidateRuleId(Integer candidateRuleId) {
        this.candidateRuleId = candidateRuleId;
    }

    public String getCandidateRule() {
        return candidateRule;
    }

    public void setCandidateRule(String candidateRule) {
        this.candidateRule = candidateRule == null ? null : candidateRule.trim();
    }

    public String getCandidateRuleDescription() {
        return candidateRuleDescription;
    }

    public void setCandidateRuleDescription(String candidateRuleDescription) {
        this.candidateRuleDescription = candidateRuleDescription == null ? null : candidateRuleDescription.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Double getCompensatoryFund() {
        return compensatoryFund;
    }

    public void setCompensatoryFund(Double compensatoryFund) {
        this.compensatoryFund = compensatoryFund;
    }

    public String getSubruleIdList() {
        return subruleIdList;
    }

    public void setSubruleIdList(String subruleIdList) {
        this.subruleIdList = subruleIdList == null ? null : subruleIdList.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}