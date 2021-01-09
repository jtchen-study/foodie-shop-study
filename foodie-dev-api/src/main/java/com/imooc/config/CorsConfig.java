package com.imooc.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@Configuration
public class CorsConfig {
    public CorsConfig() {}

    @Bean
    public CorsFilter corsFilter() {
        // 1、添加cors配置信息
        CorsConfiguration config = new CorsConfiguration();
        // 允许访问的客户端域名
        config.addAllowedOrigin("*");
       // config.addAllowedOrigin("http://121.89.195.81:8080");
       // config.addAllowedOrigin("http://chenjitong:8080");
        // 是否允许请求带有验证信息
        config.setAllowCredentials(true);
        // 允许访问的方法名 get/post
        config.addAllowedMethod("*");
        // 允许服务端访问的客户端请求头，前后端交互有一部分信息是放在header里面的
        config.addAllowedHeader("*");
        // 2、为url添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        // 3、返回重新定义好的corsSource
        corsSource.registerCorsConfiguration("/**", config);
        return new CorsFilter(corsSource);
    }
}
