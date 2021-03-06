package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages = {"com.imooc.mapper"}) //用于扫描mapper
@ComponentScan(basePackages = {"com.imooc","org.n3r.idworker"})

public class Application {
    public static void main(String[] args) {
         SpringApplication.run(Application.class, args);
    }

}
