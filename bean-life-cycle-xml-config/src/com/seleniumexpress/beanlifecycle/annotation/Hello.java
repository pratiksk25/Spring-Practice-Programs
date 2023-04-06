package com.seleniumexpress.beanlifecycle.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean,DisposableBean{
	
	/*public void init() {
		System.out.println("init() for hello");
	}
	
	public void destroy() {
		System.out.println("destroy() for hello");
	}*/

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after property set -->  init()");
		
	}
	
	public void sapmle() {
		System.out.println("this is the simple code");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("after property set -->  destroy()");
		
	}
}
