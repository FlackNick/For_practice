package usualContent.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import usualContent.Greeting;

public class Activator implements BundleActivator {

    public void start(BundleContext ctx) {
        ctx.registerService(Greeting.class.getName(),
                new GreetingImpl(), null);
    }

    public void stop(BundleContext ctx) {}
}
