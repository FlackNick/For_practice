package com.sw.service.impl;

import com.sw.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {

    void GreetingImpl() {
        sayHello();
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }
}
