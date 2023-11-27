package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollections {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employees employee1=(Employees) context.getBean("employee1");
		System.out.println(employee1.getEmpName());
		System.out.println(employee1.getEmpPhones());
		System.out.println(employee1.getEmpAddress());
		System.out.println(employee1.getCourses());
	}

}
