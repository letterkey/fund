package com.didi.care.driver.service;

import com.didi.care.driver.model.DriverCareRuleCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by YMY on 2017/5/23.
 */
@Service
public class DriverCareRuleCheckService {
    @Autowired
    private DriverCareRuleCheckMapper mapper;

    public List<DriverCareRuleCheck> getByDriverId(String driverId, Date startDate, Date endDate){
        List<DriverCareRuleCheck> list = mapper.getByDriverId(driverId,startDate,endDate);
        if(list == null)
            list = new ArrayList<DriverCareRuleCheck>();
        return list;
    }
}
