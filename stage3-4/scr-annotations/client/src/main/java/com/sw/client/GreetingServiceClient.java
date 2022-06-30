package com.sw.client;


import com.sw.service.GreetingService;
import org.apache.felix.scr.annotations.*;

@Component(name = "Client Component", immediate = true)
@Service(value = Object.class)
public class GreetingServiceClient {
    @Reference(bind = "setGreetingService", unbind = "removeGreetingService")
    private GreetingService greetingService;

    public GreetingServiceClient() {
        System.out.println("GreetingServiceClient instantiated");
    }

    @Activate
    private void activate() {
        System.out.println("GreetingServiceClient component activated");
        greetingService.sayHello("Greeting Service Client");
    }

    public void setGreetingService(GreetingService greetingService) {
        System.out.println("GreetingService injection");
        this.greetingService = greetingService;
    }

    public void removeGreetingService(GreetingService greetingService) {
        System.out.println("GreetingService removed");
    }

    @Deactivate
    public void deactivate() {
        System.out.println("GreetingServiceClient deactivated");
    }
}
