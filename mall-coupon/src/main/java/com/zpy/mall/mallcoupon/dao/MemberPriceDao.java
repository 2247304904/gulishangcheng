package com.zpy.mall.mallcoupon.dao;

import com.zpy.mall.mallcoupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 15:17:56
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
