package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Address;
import com.bean.Employee;
import com.config.MyConfiguration;

public class DemoTest {

	public static void main(String[] args) {
		
//ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); // load the xml file 

AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);

Employee emp1 = (Employee)ac.getBean("employee");   // id for Employee class 
System.out.println(emp1);
emp1.setId(100);
emp1.setName("Raju");
emp1.setSalary(34000);
Address add = emp1.getAdd();
add.setCity("Bangalore");
add.setState("Kar");
emp1.setAdd(add);
System.out.println(emp1);
System.out.println("----------------------------");
Address add1 = (Address)ac.getBean("address");		// id for Address class 
System.out.println(add1);
	}

}
