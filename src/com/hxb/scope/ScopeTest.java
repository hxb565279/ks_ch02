package com.hxb.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/scope/bean4.xml");
        Scope scope = (Scope) applicationContext.getBean("scope");
       //Spring容器只创建了一个scope实例,默认作用域singleton
        System.out.println(scope);
    }
}
