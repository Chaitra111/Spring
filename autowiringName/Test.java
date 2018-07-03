package com.Spring_1.autowiringName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("byName.xml");
	      TextEditor te = (TextEditor) context.getBean("textEditor");
	      te.spellCheck();
	   }
	}