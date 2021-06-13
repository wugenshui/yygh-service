package com.github.wugenshui.yygh.service.hosp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : chenbo
 * @date : 2021-06-13
 */
@SpringBootApplication
@MapperScan("com.github.wugenshui.yygh.service.hosp.mapper")
@ComponentScan(basePackages = "com.github.wugenshui")
public class YyghServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(YyghServiceHospApplication.class, args);
    }
}
