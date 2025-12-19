package inheritance;

public class Manager extends Employee{
private int numberOfEmp;

public void readMgr() {
	System.out.println("Enter the number of employee working under him/her");
	this.numberOfEmp= sc.nextInt();
}
public void disMgr() {
	System.out.println("Nmber of employees working under him/her "+numberOfEmp);
}
}
