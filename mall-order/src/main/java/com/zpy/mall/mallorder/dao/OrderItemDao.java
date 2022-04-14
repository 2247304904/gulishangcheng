package com.zpy.mall.mallorder.dao;

import com.zpy.mall.mallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 15:37:56
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
