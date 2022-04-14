package com.zpy.mall.mallcoupon.dao;

import com.zpy.mall.mallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 15:17:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
