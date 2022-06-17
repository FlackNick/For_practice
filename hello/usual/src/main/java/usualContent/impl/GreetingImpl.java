package usualContent.impl;

import usualContent.Greeting;

public class GreetingImpl implements Greeting {
    final String m_name;

    GreetingImpl() {
        m_name = "Hello World!";
        sayHello();
    }

    public void sayHello() {
        System.out.println(m_name);
    }
}
