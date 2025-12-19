package objectclassexamples;

public class ConstrutorExamples {

	public static void main(String[] args) {
	// without writing constructor we can create the object. 
	Employee emp1 = new Employee();
	emp1.display();
	emp1.display();
	new Employee();		// memory created but no reference that memory we can't use further 
	new Employee().display();
	
	}

}
