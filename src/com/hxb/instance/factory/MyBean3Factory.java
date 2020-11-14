package com.hxb.instance.factory;

public class MyBean3Factory {
    public MyBean3Factory() {
    }
    //创建Bean3的实例方法
    public Bean3 createBean(){
        return new Bean3();
    }
}
