package package12;

public class Ex15Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		intPrint(111);
		objPrint(new Ex14(20, 10));
	}
	
	public static void objPrint(Ex14 ex) {
		System.out.println(ex.add());
	}
	public static void intPrint(int i) {
		System.out.println(i);
	}
}
