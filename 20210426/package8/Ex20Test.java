package package8;

public class Ex20Test {

	public static void main(String [] args) {
		int i[]= {1, 2, 3, 4, 5};
		print(i);
		print1(1000);
	}
	public static void print(int [] i) {
		int sum = 0;
		for(int z : i) {
			sum += z;
		}
		System.out.println(sum);
	}
	public static void print1(int i) {
		System.out.println(i);
	}
}
