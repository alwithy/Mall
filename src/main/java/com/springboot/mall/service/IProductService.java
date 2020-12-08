package com.springboot.mall.service;

import com.github.pagehelper.PageInfo;
import com.springboot.mall.vo.ResponseVo;

public interface IProductService {

    ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);
}
