package com.qshuoo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qshuoo.aop.PrintHello;
import com.qshuoo.aop.SayHello;
import com.qshuoo.pojo.ConnMsg;
import com.qshuoo.pojo.School;
import com.qshuoo.pojo.Student;
import com.qshuoo.pojo.User;
import com.qshuoo.service.StudentService;

public class SpringTest {
	
	
	@Test
	public void iocTest() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		School school = (School) applicationContext.getBean("school");
		System.out.println(user);
		System.out.println(school);
		ConnMsg connMsg = (ConnMsg) applicationContext.getBean("connMsg");
		System.out.println(connMsg);
	}
	
	@Test
	public void aopTest() {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		SayHello helloWorld = (SayHello) app.getBean("helloWorld");
		helloWorld.hello();
		PrintHello printHello = (PrintHello) app.getBean("printHello");
		printHello.hello();
	}
	

	@Test
	public void ormTest() {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContextOrm.xml");
		StudentService studentService = (StudentService)app.getBean("stuservice");
		Student stu = new Student();
		stu.setName("lf");
		studentService.saveStudent(stu);
	}

}
