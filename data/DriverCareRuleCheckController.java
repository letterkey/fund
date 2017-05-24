package com.didi.care.driver.controller;

import com.didi.care.driver.model.CareRule;
import com.didi.care.driver.model.DriverCareRuleCheck;
import com.didi.care.driver.service.CareRuleService;
import com.didi.care.driver.service.DriverCareRuleCheckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 规则控制
 * Created by yinmuyang on 17/5/23.
 */
@Controller
@RequestMapping("/driver")
public class DriverCareRuleCheckController {
    @Resource
    private DriverCareRuleCheckService service;


    @RequestMapping("/getCheckList/{driverId}")
    @ResponseBody
    public List<DriverCareRuleCheck> getList(@PathVariable(value="driverId") String driverId , HttpSession session, HttpServletResponse response){
        List<DriverCareRuleCheck> list = null;
//        this.service.getByDriverId(driverId);
        return list;
    }
}
