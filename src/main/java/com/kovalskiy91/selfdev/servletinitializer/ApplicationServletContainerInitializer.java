package com.kovalskiy91.selfdev.servletinitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes({ApplicationInitializer.class})
public class ApplicationServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> handlers, ServletContext servletContext) {
        handlers.forEach(handler -> {
            if (ApplicationInitializer.class.isAssignableFrom(handler)) {
                try {
                    ApplicationInitializer initializer = (ApplicationInitializer) handler.newInstance();
                    initializer.onStartup(servletContext);
                } catch (Exception e) {
                    throw new RuntimeException("Initializer instantiation failed", e);
                }
            } else {
                throw new IllegalArgumentException("Illegal initializer type: " + handler);
            }
        });
    }
}
