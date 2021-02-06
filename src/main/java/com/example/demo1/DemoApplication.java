package com.example.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =  new AnnotationConfigApplicationContext(ApplicationConfig.class);
		College college = (College) context.getBean("newBean");

		college.getBean();
	}
}
