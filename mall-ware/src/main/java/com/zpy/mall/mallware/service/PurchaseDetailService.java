package com.zpy.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.common.utils.PageUtils;
import com.zpy.mall.mallware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 16:02:50
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

