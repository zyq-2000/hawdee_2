package com.example.hawdee.demo.filter;

import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebFilter(filterName = "test",urlPatterns = {"/test/*"})
//public class UrlFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//    System.out.println("创建过滤器*****************************************");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req=(HttpServletRequest) servletRequest;
//        String requestUrl=req.getRequestURL().toString();
//        System.out.println("过滤器地址："+requestUrl+"************************");
//        if(!requestUrl.contains("info"))
//        {
//            servletRequest.getRequestDispatcher("/test/fail").forward(servletRequest,servletResponse);
//        }
//        else
//            filterChain.doFilter(servletRequest,servletResponse);
//
//    }
//
//    @Override
//    public void destroy() {
//    System.out.println("过滤器销毁******************************");
//    }
//}
