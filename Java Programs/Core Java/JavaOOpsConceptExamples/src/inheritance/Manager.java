package inheritance;

public class Manager extends Employee{
private int numberOfEmp;
private Address add = new Address();			// Manager has Address 
public void readMgr() {
	System.out.println("Enter the number of employee working under him/her");
	this.numberOfEmp= sc.nextInt();
	add.readAdd();
}
public void disMgr() {
	System.out.println("Nmber of employees working under him/her "+numberOfEmp);
	add.disAdd();
}
}
