package com.hxb.assemble;

import java.util.List;

public class User {
    private String username;
    private Integer password;
    private List<String> list;


    //构造注入
    public User(String username, Integer password, List<String> list) {
        super();
        this.username = username;
        this.password = password;
        this.list = list;
    }
   //设值注入
    public User() {
        super();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", list=" + list +
                '}';
    }
}
