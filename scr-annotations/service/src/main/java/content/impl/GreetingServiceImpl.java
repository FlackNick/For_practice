package content.impl;

import content.GreetingService;
import org.apache.felix.scr.annotations.Component;

@Component(immediate = true)
public class GreetingServiceImpl implements GreetingService {
    public void sayHello(String name) {
        if (!(name == null || name.isEmpty())) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("This service cannot greet the nameless");
        }
    }
}
