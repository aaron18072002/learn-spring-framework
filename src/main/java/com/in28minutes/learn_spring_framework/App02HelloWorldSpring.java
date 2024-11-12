package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	public static void main(String[] args) {
		//1: Launch a Spring context
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Config things that we want Spring manage - @Configuration
		var bean = context.getBean("name"); 
		System.out.println(bean.toString());
		
		var rangeBean = context.getBean("ranga");
		System.out.println(rangeBean.toString());
		
		context.close();
	}
}
