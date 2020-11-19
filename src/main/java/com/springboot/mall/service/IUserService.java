package com.springboot.mall.service;

import com.springboot.mall.pojo.User;
import com.springboot.mall.vo.ResponseVo;

public interface IUserService {

    /**
     * 注册
     */
    ResponseVo register(User user);

    /**
     * 登录
     */
}
