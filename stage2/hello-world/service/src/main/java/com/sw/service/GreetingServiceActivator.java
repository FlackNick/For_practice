package com.sw.service;

import com.sw.service.impl.GreetingServiceImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class GreetingServiceActivator implements BundleActivator {
    public void start(BundleContext ctx) {
        ctx.registerService(GreetingService.class.getName(),
                new GreetingServiceImpl(), null);
    }

    public void stop(BundleContext ctx) {}
}
