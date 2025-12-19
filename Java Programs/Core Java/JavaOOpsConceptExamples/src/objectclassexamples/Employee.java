package objectclassexamples;

public class Employee {
	int id;
	String name;
	float salary;
	
	Employee() {
		System.out.println("emp class empty object created");
	}
	
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
