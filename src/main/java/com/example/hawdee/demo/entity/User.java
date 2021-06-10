package com.example.hawdee.demo.entity;

public class User {
    private String umail;
    private String uname;
//    private  int id;
    private  String password;


    public String getUmail() {
        return umail;
    }

    public String getUname() {
        return uname;
    }

    public String getPassword() {
        return password;
    }

    public void setUmail(String umail) {
        this.umail = umail;
    }


    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String umail, String uname, String password) {
        this.umail = umail;
        this.uname = uname;
        this.password = password;
    }
}

