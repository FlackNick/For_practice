package contentt;


import content.GreetingService;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Reference;

@Component(immediate = true)
public class GreetingServiceClient {
    @Reference(unbind = "removeGreetingService")
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
