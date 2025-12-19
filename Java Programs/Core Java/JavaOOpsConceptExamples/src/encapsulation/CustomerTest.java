package encapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1  = new Customer();		// object created with empty constructor 
		c1.setCid(100);
		c1.setCname("John");
		c1.setAge(21);
		
		Customer c2 = new Customer(101, "Raj",23);
		
		
		System.out.println("id is "+c1.getCid());
		System.out.println("name is "+c1.getCname());
		System.out.println("age is "+c1.getAge());
		
		System.out.println("id is "+c2.getCid());
		System.out.println("name is "+c2.getCname());
		System.out.println("age is "+c2.getAge());
	}

}
