package com.zpy.mall.mallmember.feign;

import com.zpy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 这是一个声明式的远程调用
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("mallcoupon/coupon/member/list")
    public R membercoupons();


}
