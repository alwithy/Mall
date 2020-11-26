package com.springboot.mall.service;

import com.springboot.mall.pojo.User;
import com.springboot.mall.vo.ResponseVo;



public interface IUserService {

    /**
     * 注册
     */
    ResponseVo<User> register(User user);

    /**
     * 登录
     */
    ResponseVo<User> login(String username, String password);
}
