//package com.example.hawdee.demo.config;
//
//import com.example.hawdee.demo.interceptor.AuthorityInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
//public class WebMvcConfigure implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
//            registry.addInterceptor(new AuthorityInterceptor())
//                    .addPathPatterns("/**")
//                    .excludePathPatterns("/login.html","/test/login");
//        }
//
//
//}
