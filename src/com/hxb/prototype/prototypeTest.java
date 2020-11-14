package com.hxb.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class prototypeTest {
    public static void main(String[] args) {
        //Spring容器prototype作用域,每一个创建一个实例
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/prototype/bean4-prototype.xml");
        System.out.println(applicationContext.getBean("prototype"));
        System.out.println(applicationContext.getBean("prototype"));
    }
}
