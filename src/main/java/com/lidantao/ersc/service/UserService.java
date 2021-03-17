package com.lidantao.ersc.service;

import com.lidantao.ersc.dao.UserMapper;
import com.lidantao.ersc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lidantao
 * @data 2021/3/17 9:10
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String loginUser(User user) {
        int loginUser = userMapper.loginUser(user);
        if(loginUser > 0){
            return "登录成功";
        }
        return "登录失败";
    }

}
