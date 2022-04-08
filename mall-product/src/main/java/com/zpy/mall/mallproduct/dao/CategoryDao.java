package com.zpy.mall.mallproduct.dao;

import com.zpy.mall.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-08 22:04:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
