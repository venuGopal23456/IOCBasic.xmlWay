package com.example.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {


//Cheating cheating = new Cheating();
//Student student = new Student();
//cheating.setStudent(student);
//cheating.getCheating();

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Cheating cheat = context.getBean("cheat",Cheating.class);
		cheat.getCheating();
		AnotherCheating cheat2 = context.getBean("cheat2",AnotherCheating.class);
		cheat2.another();

	}

	}

