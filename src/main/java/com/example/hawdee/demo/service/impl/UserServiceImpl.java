package com.example.hawdee.demo.service.impl;

import com.example.hawdee.demo.entity.User;
import com.example.hawdee.demo.mapper.UserMapper;
import com.example.hawdee.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserMapper userMapper;


    @Override
    public int login(String umail, String upassword) {
        return userMapper.login(umail,upassword);
    }


    @Override
    public int register(String umail, String uname, String upassword) {
        int isExist=userMapper.findUserByMail(umail);
        if(isExist>0)
        {
            return -1;

        }
        else
        {
            userMapper.register(umail,uname,upassword);
            return 1;
        }



    }
    @Override
    public User getUserByMail(String umail){
        return userMapper.getUserByMail(umail);
    }
}
