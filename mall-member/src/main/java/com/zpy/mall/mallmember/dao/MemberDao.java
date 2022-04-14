package com.zpy.mall.mallmember.dao;

import com.zpy.mall.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 15:29:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
