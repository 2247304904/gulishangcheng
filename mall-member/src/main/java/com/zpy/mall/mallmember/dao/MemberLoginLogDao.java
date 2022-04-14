package com.zpy.mall.mallmember.dao;

import com.zpy.mall.mallmember.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 15:29:16
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
