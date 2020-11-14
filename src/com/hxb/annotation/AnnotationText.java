package com.hxb.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationText {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/annotation/bean6.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
       userController.say();
    }
}
