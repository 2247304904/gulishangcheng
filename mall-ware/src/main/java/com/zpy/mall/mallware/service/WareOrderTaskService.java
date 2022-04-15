package com.zpy.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.common.utils.PageUtils;
import com.zpy.mall.mallware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 16:02:49
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

