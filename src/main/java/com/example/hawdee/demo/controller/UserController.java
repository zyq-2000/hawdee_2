package com.example.hawdee.demo.controller;

import com.example.hawdee.demo.entity.User;
import com.example.hawdee.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.security.x509.URIName;

import javax.jws.soap.SOAPBinding;
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
//  @ResponseBody
    public String login(HttpServletRequest res,String umail,String upassword,Model model)
  {
      if(userService.login(umail,upassword)==1)
      {
          User user=userService.getUserByMail(umail);
          HttpSession session =res.getSession();
          session.setAttribute("user",user);

          return "common";
      }
      else
      {
          model.addAttribute("msg","账号密码不匹配");
          return "index";
      }
  }
  @PostMapping("/user/register")
//  @ResponseBody
    public String register(String umail,String uname,String upassword,Model model)
  {
      if(userService.register(umail,uname,upassword)==-1)
      {
          model.addAttribute("msg","账号密码不匹配");
          return "index";
      }
      else
          return "test";

  }
  @RequestMapping("/toRegister")
  public String toRegister()
  {
      return "register";
  }
  @RequestMapping("/toIndex")
    public String toIndex()
    {
        return "index";
    }
  @RequestMapping("/test")
    public String test(Model model)
  {
      model.addAttribute("msg","测试信息");
      return "test";
  }

}
