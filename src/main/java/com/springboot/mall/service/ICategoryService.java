package com.springboot.mall.service;

import com.springboot.mall.vo.CategoryVo;
import com.springboot.mall.vo.ResponseVo;

import java.util.List;

public interface ICategoryService {

    ResponseVo<List<CategoryVo>> selectAll();
}
