
public class StringClassMethods {

	public static void main(String[] args) {
//	String str1 = "AWelcome to Java";
//	String str2 = new String("Welcome to Java");
//	System.out.println(str1);
//	System.out.println(str2);
//	System.out.println(str1.length());
//	System.out.println(str1.charAt(0));
//	System.out.println(str1.codePointAt(0));
//	System.out.println(str1.toLowerCase());
//	System.out.println(str1.toUpperCase());
//	System.out.println(str1.substring(3));
//	System.out.println(str1.substring(3, 10));
		
	String str1 = "Raj";					// one memory created 
	String str2 = "raj";					// str1 and str2 refer to same memory string pooling  
	String str3 = new String("Raj");		// new memory 
	String str4 = new String("Raj");		// new memory 
	if(str1.equalsIgnoreCase(str2)) {
		System.out.println("Equal");
	}else {
		System.out.println("Not Equal");
	}
	}

}
