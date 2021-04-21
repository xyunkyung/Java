package inheritance;

public class Ex23Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex23 ex = new Ex23(3, 3.141592, "test1");
		System.out.println(ex.subject);
		double result = ex.area();
		System.out.println(result);
		System.out.println(Math.PI);
		result = ex.area(Math.PI);
		System.out.println(result);
	}

}
