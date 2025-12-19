package objectclassexamples;

public class App {
	App() {
		System.out.println("App class object created...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Main method");
//		System.out.println("--------------");
//		//start();
//		Car innova = new Car();
//		innova.start();
//		innova.stop();
//		System.out.println("----------------");
//		Car ertiga = new Car();
//		ertiga.start();
//		ertiga.stop();
		
//		Car innova = new Car();			// new memory created 
//			//innova.displayCarDetails();
//		innova.wheel=4;
//		innova.price=3500000;
//		//System.out.println("After set value for innova");
//		innova.colour="White";
//		innova.displayCarDetails("Innova");
//		System.out.println("------------------");
//		Car ertiga = new Car();			// new memory created 
//			//ertiga.displayCarDetails();
//		ertiga.wheel=4;
//		ertiga.price=1500000;
//		ertiga.colour="Gray";
//		ertiga.displayCarDetails("Ertiga");
		
		Car innova  = new Car();		// when ever memory created it will call automatically 
		innova.price=3800000;
		innova.colour="White";
		innova.displayCarDetails("innova");
		
		System.out.println("---------------");
		Car ertiga = new Car();		// again constructor get called..
		ertiga.price=1500000;
		ertiga.colour="Gray";
		ertiga.displayCarDetails("Ertiga");
		
		
		System.out.println("---------------");
		Car santro = new Car(4,950000,"Red");		// call parameterized constructor 
		santro.displayCarDetails("Santro");
		
		System.out.println("---------------");
		Car kia = new Car();
		kia.setValue(4, 1350000, "White");
		kia.displayCarDetails("Kia");
		
		kia.setValue(4, 1550000, "White");
		kia.displayCarDetails("Kia");
	}

}
