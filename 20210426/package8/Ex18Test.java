package package8;

public class Ex18Test {

	public static void main(String [] args) {
		int i = 10;
		int j = 1;
		
		int [] i1 = {1, 2, 3, 4, 5};
		int [] k = i1;
		
		print(10);
		print(i);
		arrayPrint(i1);
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	public static void arrayPrint(int [] l) {
		int sum = 0;
		for(int z : l) {
			sum += z;
		}
		System.out.println(sum);
	}
}
