package com.springboot.mall.controller;


import com.springboot.mall.enums.ResponseEnum;
import com.springboot.mall.form.UserForm;
import com.springboot.mall.pojo.User;
import com.springboot.mall.service.IUserService;
import com.springboot.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Objects;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseVo register(@Valid @RequestBody UserForm userForm,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.info("注册提交的参数有误，{} {}",
                    Objects.requireNonNull(bindingResult.getFieldError()).getField(),
                    bindingResult.getFieldError().getDefaultMessage());

            return ResponseVo.error(ResponseEnum.PARAM_ERROR,
                    bindingResult);
        }

        User user = new User();
        BeanUtils.copyProperties(userForm, user);

        return userService.register(user);
    }
}
