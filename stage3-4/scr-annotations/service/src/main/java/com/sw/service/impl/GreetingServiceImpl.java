package com.sw.service.impl;

import com.sw.service.GreetingService;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;

@Component(immediate = true)
@Service(value = GreetingService.class)
public class GreetingServiceImpl implements GreetingService {
    @Override
    public void sayHello(String name) {
        if (!(name == null || name.isEmpty())) {
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("This service cannot greet the nameless");
        }
    }
    @Activate
    public void sayHellooo() {
        System.out.println("GreetingService Activted");
    }
    @Deactivate
    public void sayHelloooo() {
        System.out.println("GreetingService Deactivated");
    }
}
