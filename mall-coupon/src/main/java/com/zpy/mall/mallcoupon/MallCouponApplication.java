package com.zpy.mall.mallcoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 如何使用nacos配置中心
 * <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *
 * 创建一个bootstrap.properties
 *
 *  需要给配置中心添加数据集
 *   data id    默认规则： 应用名.properties
 *
 *   在配置中动态修改获取值
 *
 *   动态刷新配置获取
 *      引入注解
 *      @RefreshScope 动态获取并刷新配置
 *      @Vaule("${配置项的名}") 获取到配置
 *      如果配置中心和当前应用配置文件中都配置了相同的项 优先使用配置中心的配置
 *  细节
 *      1.命名空间
 *          默认 public(保留空间)
 *      2.配置集
 *      3.配置集ID
 *      4.配置分组
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
