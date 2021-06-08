package com.example.hawdee.demo.entity;

public class User {
    private String uname;
    private  int id;
    private  String password;

    public String getName() {
        return uname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public User(int id,String uname, String password) {
        this.uname = uname;
        this.id = id;
        this.password = password;
    }
    public User()
    {

    }

    public void setName(String name) {
        this.uname = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

