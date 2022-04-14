package com.zpy.mall.mallorder.dao;

import com.zpy.mall.mallorder.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 15:37:55
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
