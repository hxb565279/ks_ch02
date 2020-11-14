package com.hxb.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource(name = "userDao")
    private UserDao userDao;
    @Override
    public void save() {
        this.userDao.say();
        System.out.println("userService....save..");
    }
}
