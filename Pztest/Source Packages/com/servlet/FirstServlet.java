package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{
	ServletConfig conf;
	//life cycle methods
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating Object...");
	}
	
	public void service(ServletRequest req,ServletResponse res) throws IOException {
		System.out.println("Servicing.....");
		//set the content type of the request
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is my output from the servlet method::</h1>");
		out.println("<h1>Todays date and time is ::" +new Date().toString()+"</h1>");
	}
	
	public void destroy() {
		System.out.println("Going to destroy Servlet object");
	}
	
	//Non Life Cycle mehtods
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "this servlet is created ";
	}

}
