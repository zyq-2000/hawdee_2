package com.example.hawdee.demo.service;

import com.example.hawdee.demo.entity.User;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

public interface UserService {

    public User getUserByMail(String umail);
    public int login(String uname,String upassword);
    public int register(String umail,String uname,String upassword);

}
