package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import test.domain.User;
import test.service.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yinmuyang on 17/5/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping(value="/showUser",method = RequestMethod.GET)
    public
    @ResponseBody Model toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("name", "namexxxx");
        map.put("pro", "proxxxx");

        ModelAndView mav=new ModelAndView("products/list",map);


        return model;
    }
}
