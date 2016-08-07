package cn.com.controllers;

import cn.com.service.ICustomerService;
import cn.com.vo.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/8/6.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("customerId") String customerId,
                        @RequestParam("pwd") String pwd, HttpServletResponse response) {
        if (customerId == null || customerId.trim().length() == 0) {
            return "login";
        }
        CustomerModel cm = customerService.getByCustomerId(customerId);
        if (cm == null || cm.getUuid() <= 0) {
            return "login";
        }
        Cookie cookie = new Cookie("MyLogin", cm.getUuid() + "," + System.currentTimeMillis());
        response.addCookie(cookie);
        return "redirect:/toIndex";
    }

}
