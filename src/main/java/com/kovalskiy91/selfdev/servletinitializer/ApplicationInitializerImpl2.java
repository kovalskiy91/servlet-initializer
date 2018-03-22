package com.kovalskiy91.selfdev.servletinitializer;

import javax.servlet.ServletContext;

public class ApplicationInitializerImpl2  implements ApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        servletContext.addServlet("testServlet2", new TestServlet())
                .addMapping("/test2");
    }
}
