package com.springboot.mall.service.impl;

import com.springboot.mall.MallApplicationTests;
import com.springboot.mall.enums.RoleEnum;
import com.springboot.mall.pojo.User;
import com.springboot.mall.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class UserServiceImplTest extends MallApplicationTests {

    @Autowired
    private IUserService UserService;

    @Test
    public void register() {
        User user = new User("jack", "123456", "jack@qq.com", RoleEnum.CUSTOMER.getCode());
        UserService.register(user);
    }
}