package com.example.board.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") //url 허용범위 : '*' 전체를 뜻함
                .allowedMethods("*") //메소드 허용 범위
                .allowedHeaders("*"); //Access-Control-Request-Headers 헤더를 통해 preflight 요청에 허용되는 헤더를 지정
    }
}
