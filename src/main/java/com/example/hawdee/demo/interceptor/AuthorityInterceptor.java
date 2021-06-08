package com.example.hawdee.demo.interceptor;

import com.example.hawdee.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Slf4j
public class AuthorityInterceptor implements HandlerInterceptor{
    private static final Set<String> NOT_INTERCEPT_URL=new HashSet<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler instanceof HandlerMethod){
            System.out.println("进入拦截器");
            //判断session中是否有对象
            //UserContext为自设工具类，主要是从session中取对象用的
            HttpSession session = request.getSession();
            User user=(User) session.getAttribute("user");
            if(user==null){
                System.out.println(request.getRequestURL()+"**********");
                response.sendRedirect("/login.html");
                return false;
            }
            System.out.println(user);
        }
        //其他情况放行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
