package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
	System.out.println("Employee class code");
	Employee emp1 = new Employee();
	emp1.readEmp();
	emp1.disEmp();
	
	System.out.println("----------------");
	Manager mgr1 = new Manager();
	mgr1.readEmp();   // id,name,salary
	mgr1.readMgr();  // enter the number of emp
	
	mgr1.disEmp();
	mgr1.disMgr();
	}

}
