package com.Spring_1.autowireConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("byConstructor.xml");
	      TextEditor te = (TextEditor) context.getBean("texteditor");
	      te.spellCheck();
	   }
	}