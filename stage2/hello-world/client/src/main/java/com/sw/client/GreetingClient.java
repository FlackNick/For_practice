package com.sw.client;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class GreetingClient implements BundleActivator {
    public void start(BundleContext ctx) {
        ServiceReference ref =
                ctx.getServiceReference(GreetingService.class.getName());

        if (ref != null && ctx.getService(ref) != null){
            ((GreetingService) ctx.getService(ref)).sayHello();
        } else {
            System.out.println("Our reference is null");
        }
    }

    public void stop(BundleContext ctx) {}
}
