package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer //implements WebApplicationInitializer 
{
	public void onStartup(ServletContext servletContext) throws ServletException {

		//XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		//webApplicationContext.setConfigLocation("classpath:application-config.xml");
		
		
		
		// create a dispatcher servlet object

		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		// registered dispatcher servlet with servlet context
		ServletRegistration.Dynamic myCustomeDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);

		myCustomeDispatcherServlet.setLoadOnStartup(1);
		myCustomeDispatcherServlet.addMapping("/mywebsite.com/*");

	}
}
