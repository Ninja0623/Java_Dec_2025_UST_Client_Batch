
public class IfStatementExamples {

	public static void main(String[] args) {
//		byte age = 18;
//		if(age>=18) {
//			System.out.println("You can Vote!");
//		}else {
//			System.out.println("You Can't Vote!");
//		}
		
		int m1=67,m2=89,m3=75;
		float avg = (float)(m1+m2+m3)/3;
		//System.out.println(avg);
		if(avg>=90) {
			System.out.println("Grade is :A+");
		}else if(avg>=80) {
			System.out.println("Grade is :A");
		}else if(avg>=70) {
			System.out.println("Grade is :B");
		}else {
			System.out.println("Grade is :C ");
		}
	}

}
