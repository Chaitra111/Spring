package com.Spring_1.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("required.xml");
	      Student student = (Student) context.getBean("student");
	      System.out.println("Name : " + student.getName() );
	      System.out.println("Age : " + student.getAge() );
	   }
	}