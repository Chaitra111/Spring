package com.Spring_1.autowiringType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
	     
	      ApplicationContext context = new ClassPathXmlApplicationContext("Bytype.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	   }
	}