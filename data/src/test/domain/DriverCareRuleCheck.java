package test.domain;

import java.util.Date;

public class DriverCareRuleCheck {
    private Integer id;

    private String driverId;

    private String candidateRuleId;

    private String candidateRule;

    private Double fundNumber;

    private Date orderTime;

    private String dataId;

    private String dataType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId == null ? null : driverId.trim();
    }

    public String getCandidateRuleId() {
        return candidateRuleId;
    }

    public void setCandidateRuleId(String candidateRuleId) {
        this.candidateRuleId = candidateRuleId == null ? null : candidateRuleId.trim();
    }

    public String getCandidateRule() {
        return candidateRule;
    }

    public void setCandidateRule(String candidateRule) {
        this.candidateRule = candidateRule == null ? null : candidateRule.trim();
    }

    public Double getFundNumber() {
        return fundNumber;
    }

    public void setFundNumber(Double fundNumber) {
        this.fundNumber = fundNumber;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }
}