package com.example.hawdee.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageController {
    @RequestMapping("/toManage")
    public String toManage()
    {
        return "nav";
    }
}
