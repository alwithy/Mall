package com.springboot.mall.form;

import lombok.Data;

@Data
public class CartUpdateForm {

    private Integer quantity;

    private Boolean selected;
}
