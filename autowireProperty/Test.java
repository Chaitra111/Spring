package com.Spring_1.autowireProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("autowireProperty.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	   }
	}