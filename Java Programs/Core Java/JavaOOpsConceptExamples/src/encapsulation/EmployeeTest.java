package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		//emp1.id=100;
		//emp1.name="John";
		//emp1.salary=-15000.50f;
		emp1.setValue(100, "john", -15000);
		emp1.displayEmployeeInfo();

	}

}
