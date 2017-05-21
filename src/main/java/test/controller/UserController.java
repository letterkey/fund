package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import test.domain.User;
import test.service.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

/**
 * Created by yinmuyang on 17/5/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
