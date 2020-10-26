package com.springboot.mall.dao;

import com.springboot.mall.MallApplicationTests;
import com.springboot.mall.pojo.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryMapperTest extends MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void findById() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }

    @Test
    public void queryById() {
        Category category = categoryMapper.queryById(100001);
        System.out.println(category.toString());
    }
}