package com.didi.care.driver.domain;

import java.util.Date;

public class CareRule {
    private Integer id;

    private Integer candidateRuleId;

    private String candidateRule;

    private Integer areaId;

    private Byte state;

    private Double compensatoryFund;

    private Date startDate;

    private Date endDate;

    private Date createTime;

    private String createrUserId;

    private String serviceLineId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Double getCompensatoryFund() {
        return compensatoryFund;
    }

    public void setCompensatoryFund(Double compensatoryFund) {
        this.compensatoryFund = compensatoryFund;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreaterUserId() {
        return createrUserId;
    }

    public void setCreaterUserId(String createrUserId) {
        this.createrUserId = createrUserId == null ? null : createrUserId.trim();
    }

    public String getServiceLineId() {
        return serviceLineId;
    }

    public void setServiceLineId(String serviceLineId) {
        this.serviceLineId = serviceLineId == null ? null : serviceLineId.trim();
    }
}