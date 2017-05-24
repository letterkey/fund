package com.didi.care.driver.mapper;


import com.didi.care.driver.model.DriverCareRuleCheck;

import java.util.Date;
import java.util.List;

public interface DriverCareRuleCheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverCareRuleCheck record);

    int insertSelective(DriverCareRuleCheck record);

    List<DriverCareRuleCheck> getByDriverId(String driverId, Date startDate,Date endDate);

    DriverCareRuleCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverCareRuleCheck record);

    int updateByPrimaryKey(DriverCareRuleCheck record);
}