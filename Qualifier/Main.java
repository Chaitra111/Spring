package com.Spring_1.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("qualifier.xml");

	      Profile profile = (Profile) context.getBean("profile");
	      profile.printAge();
	      profile.printName();
	   }
	}

