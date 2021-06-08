package com.example.hawdee.demo;

import com.example.hawdee.demo.entity.User;
import com.example.hawdee.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserServiceImpl userService;
    @Test
    void contextLoads() {
//        User user=new User("abc",10,"123");
//        System.out.println(userService.finById(1));


    }

}
