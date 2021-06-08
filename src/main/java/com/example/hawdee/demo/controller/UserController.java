package com.example.hawdee.demo.controller;

import com.example.hawdee.demo.entity.User;
import com.example.hawdee.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.security.x509.URIName;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
//@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;

  @PostMapping("/user/login")
  @ResponseBody
    public String login(String umail,String upassword)
  {
      if(userService.login(umail,upassword)==1)
          return "sucess";
      else
          return "fail";
  }
  @PostMapping("/user/register")
  @ResponseBody
    public String register(String umail,String uname,String upassword)
  {
      if(userService.register(umail,uname,upassword)==-1)
          return "fail";
      else
          return "success";

  }

}
