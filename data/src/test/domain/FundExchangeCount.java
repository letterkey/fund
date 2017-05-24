package test.domain;

import java.util.Date;

public class FundExchangeCount {
    private Integer id;

    private Double fundExchangeNumber;

    private Date dataDate;

    private Date createTime;

    private Integer areaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFundExchangeNumber() {
        return fundExchangeNumber;
    }

    public void setFundExchangeNumber(Double fundExchangeNumber) {
        this.fundExchangeNumber = fundExchangeNumber;
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
}