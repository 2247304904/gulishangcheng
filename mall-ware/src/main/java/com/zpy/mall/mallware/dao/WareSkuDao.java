package com.zpy.mall.mallware.dao;

import com.zpy.mall.mallware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 16:02:49
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
