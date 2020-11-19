package com.springboot.mall.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserForm {

    //用于String判断空格
    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    private String email;
}
