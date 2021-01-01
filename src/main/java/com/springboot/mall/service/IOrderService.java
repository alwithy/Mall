package com.springboot.mall.service;

import com.springboot.mall.vo.OrderVo;
import com.springboot.mall.vo.ResponseVo;

public interface IOrderService {
    ResponseVo<OrderVo> create(Integer uid, Integer shippingId);
}
