package com.sw.service;

import org.apache.felix.scr.annotations.*;

@Component(immediate = true)
@Service(value = Object.class)
@Properties({
        @Property(name="osgi.command.scope",value="practice"),
        @Property(name="osgi.command.function",value="hello")
})
public class CommandService {
    public void hello() {
        System.out.println("Command 'hello' was without parameter");
    }

    public void hello(String parameter) {
        System.out.println("Hello, " + parameter + "!");
    }
}
