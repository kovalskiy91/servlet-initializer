package com.kovalskiy91.selfdev.servletinitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes({ApplicationInitializer.class})
public class ApplicationServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) {
        ServletRegistration servletRegistration = ctx.addServlet("testServlet", TestServlet.class);
        servletRegistration.addMapping("/test");
    }
}
