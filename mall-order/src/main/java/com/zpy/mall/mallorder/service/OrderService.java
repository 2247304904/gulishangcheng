package com.zpy.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.common.utils.PageUtils;
import com.zpy.mall.mallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 15:37:56
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

