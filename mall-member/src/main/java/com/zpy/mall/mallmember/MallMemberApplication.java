package com.zpy.mall.mallmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.想要远程调用别的服务
 * 1）引入open-feign
 * 2) 编写一个接口 告诉springcloud 这个接口需要调用程服务
 *   1.声明接口的每一个方法都是调用哪一个远程服务的请求
 * 3） 开启远程调用功能
 *          @EnableFeignClients
 */
@EnableFeignClients(basePackages = "com.zpy.mall.mallmember.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
