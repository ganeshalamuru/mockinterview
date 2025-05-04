package com.gan.mockinterview.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class AppConfig {

//    @Bean
//    public ServletRegistrationBean<DispatcherServlet> restServlet() {
//        DispatcherServlet dispatcherServlet = new DispatcherServlet();
//        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
//        dispatcherServlet.setApplicationContext(applicationContext);
//        ServletRegistrationBean<DispatcherServlet> servletServletRegistrationBean = new ServletRegistrationBean<>();
//        servletServletRegistrationBean.setServlet(dispatcherServlet);
//        servletServletRegistrationBean.addUrlMappings("/mi/*");
//        servletServletRegistrationBean.setLoadOnStartup(0);
//        return servletServletRegistrationBean;
//    }

}
