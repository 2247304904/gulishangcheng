package com.zpy.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.common.utils.PageUtils;
import com.zpy.mall.mallware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 16:02:49
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

