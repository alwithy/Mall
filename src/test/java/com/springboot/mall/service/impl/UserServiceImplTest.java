package com.springboot.mall.service.impl;

import com.springboot.mall.MallApplicationTests;
import com.springboot.mall.enums.ResponseEnum;
import com.springboot.mall.enums.RoleEnum;
import com.springboot.mall.pojo.User;
import com.springboot.mall.service.IUserService;
import com.springboot.mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class UserServiceImplTest extends MallApplicationTests {

    public static final String USERNAME = "jack";

    public static final String PASSWORD = "123456";

    @Autowired
    private IUserService userService;

    @Before
    public void register() {
        User user = new User(USERNAME, PASSWORD, "jack@qq.com", RoleEnum.CUSTOMER.getCode());
        userService.register(user);
    }

    @Test
    public void login() {
        ResponseVo<User> responseVo = userService.login(USERNAME, PASSWORD);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode()
                , responseVo.getStatus());
    }
}