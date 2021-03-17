package com.lidantao.ersc.controller;

import com.lidantao.ersc.entity.User;
import com.lidantao.ersc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lidantao
 * @data 2021/3/17 9:04
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/loginUser")
    @ResponseBody
    public String loginUser(User user){
        return userService.loginUser(user);
    }


}
