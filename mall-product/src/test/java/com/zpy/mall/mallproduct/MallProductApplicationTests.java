package com.zpy.mall.mallproduct;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zpy.mall.mallproduct.entity.BrandEntity;
import com.zpy.mall.mallproduct.service.BrandService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("huawei");
////        brandEntity.setName("华为");
////        brandService.save(brandEntity);
////        System.out.println("保存成功");
//        brandService.updateById(brandEntity);

        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach((item)->{
            System.out.println(item);
        });
    }

}
