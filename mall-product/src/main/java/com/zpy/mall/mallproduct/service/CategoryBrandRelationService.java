package com.zpy.mall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.common.utils.PageUtils;
import com.zpy.mall.mallproduct.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-08 22:04:14
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

