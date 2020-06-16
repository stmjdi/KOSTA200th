package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class PersonTest {
	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/person.xml"));
//		PersonService person = (PersonService) factory.getBean("personService");
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("person.xml"); // 클래스의 실행 위치를 기준으로 xml파일을 찾음 
		ApplicationContext context = new FileSystemXmlApplicationContext("src/person.xml"); // 파일 시스템 root 기준으로 xml 파일을 찾음 
		PersonService person = (PersonService) context.getBean("personService");
		
		
		person.sayHello();
	}
}
