package com.zpy.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.common.utils.PageUtils;
import com.zpy.mall.mallproduct.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-08 22:04:14
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

