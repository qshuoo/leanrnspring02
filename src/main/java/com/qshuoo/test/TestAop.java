package com.qshuoo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qshuoo.aop.HelloWorld;
import com.qshuoo.aop.PrintHello;
import com.qshuoo.aop.SayHello;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		SayHello helloWorld = (SayHello) app.getBean("helloWorld");
		helloWorld.hello();
		
		PrintHello printHello = (PrintHello) app.getBean("printHello");
		printHello.hello();
	}

}
