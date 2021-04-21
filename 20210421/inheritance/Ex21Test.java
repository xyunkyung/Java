package inheritance;

public class Ex21Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex21 ex = new Ex21(20, 10, "테스트");
		System.out.println(ex.subject);
		int result = ex.add();
		System.out.println(result);
		result = ex.div();
		System.out.println(result);
		
		Ex21 ex1 = new Ex21(0, 20, "테스트1");
		System.out.println(ex1.subject);
		result = ex1.add();
		System.out.println(result);
		result = ex1.div();	// 0 / 20 : 부정
		System.out.println(result);
		
		Ex21 ex2 = new Ex21(20, 0, "테스트2");
		System.out.println(ex1.subject);
		result = ex2.add();
		System.out.println(result);
		result = ex2.div();	// 20 / 0 : 불능
		System.out.println(result);
	}

}
