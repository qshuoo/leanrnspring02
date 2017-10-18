package com.qshuoo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qshuoo.pojo.ConnMsg;
import com.qshuoo.pojo.School;
import com.qshuoo.pojo.User;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		School school = (School) applicationContext.getBean("school");
		System.out.println(user);
		System.out.println(school);
		
		ConnMsg connMsg = (ConnMsg) applicationContext.getBean("connMsg");
		System.out.println(connMsg);
	}
	
	
	
	

}
