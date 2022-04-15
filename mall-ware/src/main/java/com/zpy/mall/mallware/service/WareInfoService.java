package com.zpy.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zpy.common.utils.PageUtils;
import com.zpy.mall.mallware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 16:02:50
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

