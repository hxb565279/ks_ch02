package com.hxb.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;
    public void say(){
        this.userService.save();
        System.out.println("userController......say..");
    }


}
