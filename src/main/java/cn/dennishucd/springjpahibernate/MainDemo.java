package cn.dennishucd.springjpahibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.dennishucd.springjpahibernate.service.PersonService;


public class MainDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:app-context.xml");
		
		PersonService personService = (PersonService)ctx.getBean(PersonService.class);
		
		personService.sendSMS();
	}
}
