package objectclassexamples;

import java.awt.Color;

public class Car {
	int wheel;
	float price;
	String colour;		// instance variable 
	
	void start() {
		System.out.println("Car Started");
	}
	void stop() {
		System.out.println("Car Stop");
	}
	
	
	void displayCarDetails(String cname) {
		String msg="Car Details :";
		System.out.println(msg+cname);
		System.out.println("Wheel "+wheel);	//0
		System.out.println("Price "+price);	//0.0
		System.out.println("Colour "+colour);	// null
	}
	// Empty constructor 
	Car() {
		System.out.println("object created...with empty");
		this.wheel = 4;
		this.price = 800000;
		this.colour = "dont' known";		// whenever memory created we can do some initialization 
	}
	// parameter constructor 
//	Car(int wheel1, float price1, String colour1){	// wheel1, price1, colour1 are local or parameter variable 
//		System.out.println("object created...with parameter");
//		wheel=wheel1;			// set the value of instance variable. 
//		price = price1;
//		colour = colour1;
//	}
	
	// parameter constructor with this keyword. 
		Car(int wheel, float price, String colour){	// wheel, price, colour are local or parameter variable 
			System.out.println("object created...with parameter");
			this.wheel=wheel;			// this.wheel is instance and wheel is local 
			this.price = price;
			this.colour = colour;
		}
		
		// parameter method to set the value with this keyword. 
		void setValue(int wheel, float price, String colour){	// wheel, price, colour are local or parameter variable 
				this.wheel=wheel;			// this.wheel is instance and wheel is local 
				this.price = price;
				this.colour = colour;
		}
		
}
