package com.zpy.mall.mallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1.整合Mybatis-plus
 *  1）导入相关依赖
 *  <dependency>
 *         <groupId>com.baomidou</groupId>
 *         <artifactId>mybatis-plus-boot-starter</artifactId>
 *         <version>3.5.1</version>
 *     </dependency>
 *   2）配置
 *      1.配置数据源
 *          1）导入数据库驱动
 *          2）在application.yml中配置数据源相关信息
 *      2.配置mybatis-plus相关信息
 *          1) 使用MapperScan
 *          2) 告诉mybatis-plus sql映射文件的位置
 *
 */
@MapperScan("com.zpy.mall.mallproduct.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
