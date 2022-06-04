package com.example.Spring2;

public class MyBean {
    public String sayHello() {
        System.out.println("Calling inner method of"+MyBean.class.getCanonicalName());
        return "Hello";
    }
}
