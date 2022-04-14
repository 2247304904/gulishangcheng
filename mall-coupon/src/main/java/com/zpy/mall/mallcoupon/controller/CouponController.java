package com.zpy.mall.mallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zpy.mall.mallcoupon.entity.CouponEntity;
import com.zpy.mall.mallcoupon.service.CouponService;
import com.zpy.common.utils.PageUtils;
import com.zpy.common.utils.R;



/**
 * 优惠券信息
 *
 * @author zpy
 * @email sunlightcs@gmail.com
 * @date 2022-04-14 15:17:57
 */
@RefreshScope
@RestController
@RequestMapping("mallcoupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;
    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.age}")
    private Integer age;
    @RequestMapping("/test")
    public R test(){
        return R.ok().put("name",name).put("age",age);
    }

    @RequestMapping("/member/list")
    public R membercoupons(){
        CouponEntity coupon = new CouponEntity();
        coupon.setCouponName("满100减10");
        return R.ok().put("coupons",Arrays.asList(coupon));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("mallcoupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
//    @RequiresPermissions("mallcoupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("mallcoupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
//    @RequiresPermissions("mallcoupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
//   @RequiresPermissions("mallcoupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
