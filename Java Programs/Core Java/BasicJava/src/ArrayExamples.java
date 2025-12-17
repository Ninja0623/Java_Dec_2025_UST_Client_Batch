
public class ArrayExamples {

	public static void main(String[] args) {
//		int abc[];
//		int a;
//		System.out.println(abc);
//		System.out.println(a);
		int a=10;
		int num[]= {10,20,30,40,50,84,65,12,3,4,56,87,54,34,23,90};
		System.out.println(a);
		System.out.println(num);
		System.out.println("0 index position "+num[0]);
		System.out.println("1 index position "+num[1]);
		System.out.println("size of the array "+num.length);
		System.out.println("retrieve the elements from array using loop");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		//System.out.println(num[-1]);
		//System.out.println(num[18]);
		System.out.println("retrieve element from array using enhanced loop");
		for(int n:num) {
			System.out.println(n);
		}
	}

}
