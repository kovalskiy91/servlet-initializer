package com.kovalskiy91.selfdev.servletinitializer;

import javax.servlet.ServletContext;

public class ApplicationInitializerImpl1 implements ApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        servletContext.addServlet("testServlet1", new TestServlet())
                .addMapping("/test1");
    }
}
