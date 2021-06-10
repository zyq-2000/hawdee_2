package com.example.hawdee.demo.mapper;

import com.example.hawdee.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public int findUserByMail(String umail);
    public int register(String umail,String uname,String upassword);
    public int login(String umail, String upassword);
    public User getUserByMail(String umail);
}
