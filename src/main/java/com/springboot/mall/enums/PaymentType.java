package com.springboot.mall.enums;

import lombok.Getter;

@Getter
public enum PaymentType {

    PAY_ONLINE(1),
    ;

    Integer code;

    PaymentType(Integer code) {
        this.code = code;
    }
}
