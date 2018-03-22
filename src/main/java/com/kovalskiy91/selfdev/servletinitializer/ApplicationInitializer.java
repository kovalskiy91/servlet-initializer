package com.kovalskiy91.selfdev.servletinitializer;

import javax.servlet.ServletContext;

public interface ApplicationInitializer {

    void onStartup(ServletContext servletContext);

}
