package com.didi.care.driver.controller;

import com.didi.care.driver.domain.Area;
import com.didi.care.driver.service.IAreaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.domain.User;
import test.service.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yinmuyang on 17/5/21.
 */
@Controller
@RequestMapping("/area")
public class AreaController {
    @Resource
    private IAreaService areaService;

    @RequestMapping("/getList")
    public @ResponseBody Object getList(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        List<Area> areas = this.areaService.getAreaList();
        model.addAttribute("areas", areas);
        return model;
    }
}
