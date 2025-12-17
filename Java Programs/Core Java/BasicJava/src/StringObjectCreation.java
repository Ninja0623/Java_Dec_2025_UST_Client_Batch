import java.util.Scanner;

public class StringObjectCreation {

	public static void main(String[] args) {
		String str1 = "Welcome to Java";
		String str2 = new String("Welcome to Java");
		System.out.println(str1);
		System.out.println(str2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		//String fname = sc.next();// it ignore space character 
		//String fname = sc.nextLine();  // it receive the value till enter key 
		//System.out.println("your name is "+fname);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		sc.nextLine();		// to hold enter key 
		System.out.println("Enter the name");
		String fname = sc.nextLine();
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
		System.out.println("id is "+id);
		System.out.println("name is "+fname);
		System.out.println("salary is "+salary);
	}

}
