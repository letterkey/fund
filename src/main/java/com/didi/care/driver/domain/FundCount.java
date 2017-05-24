package com.didi.care.driver.domain;

import java.util.Date;

public class FundCount {
    private Integer id;

    private Double fundNumber;

    private Date dataDate;

    private Date createTime;

    private Integer areaId;

    private Integer careRuleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFundNumber() {
        return fundNumber;
    }

    public void setFundNumber(Double fundNumber) {
        this.fundNumber = fundNumber;
    }

    public Date getDataDate() {
        return dataDate;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getCareRuleId() {
        return careRuleId;
    }

    public void setCareRuleId(Integer careRuleId) {
        this.careRuleId = careRuleId;
    }
}