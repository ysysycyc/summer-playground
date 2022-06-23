package com.summer.shardingSphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lijiawei
 */
@MapperScan(basePackages = "com.summer.shardingSphere.mapper")
@SpringBootApplication
public class ShardingSphereSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereSpringApplication.class, args);
    }

}
