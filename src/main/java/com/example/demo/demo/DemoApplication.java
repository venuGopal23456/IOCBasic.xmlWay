package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Bean Got Created");
		Student display = context.getBean("cheated",Student.class);
		display.Display();

	}

	}

