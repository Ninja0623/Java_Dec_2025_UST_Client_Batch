package inheritance;

import java.util.Scanner;

public class Employee {
private int id;
private String name;
private float salary;

Scanner sc = new Scanner(System.in);
public void readEmp() {
	System.out.println("Enter the id");
	this.id = sc.nextInt();
	System.out.println("Enter the name");
	this.name = sc.next();
	System.out.println("Enter the salary");
	this.salary = sc.nextFloat();
}

public void disEmp() {
	System.out.println("id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
}
}
