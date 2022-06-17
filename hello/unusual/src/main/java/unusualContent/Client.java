package unusualContent;

import org.osgi.framework.*;
import usualContent.Greeting;

public class Client implements BundleActivator {

    public void start(BundleContext ctx) {
        ServiceReference ref =
                ctx.getServiceReference(Greeting.class.getName());

        ((Greeting) ctx.getService(ref)).sayHello();
    }

    public void stop(BundleContext ctx) {}
}
