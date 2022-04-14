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
 *          默认 public(保留空间) 默认洗澡能的所有配置都在public命名空间
 *           1、开发 生产 测试 利用命名空间来做环境隔离
 *          注意 在bootstrap.properties中配置需要使用那个配置命名空间 id
 *          2.为每一个微服务创建自己的命名空间
 *      2.配置集
 *          所有配置的集合
 *      3.配置集ID
 *          类似于配置文件名 Data ID：文件名
 *
 *      4.配置分组
 *          默认所有的配置集 都属于：DEFAULT_GROUP
 *          1111 。 618 。1212
 *
 * 每个微服务创建自己的命名空间 使用配置分组区分环境 dev test prod
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
