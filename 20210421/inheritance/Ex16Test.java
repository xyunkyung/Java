package inheritance;

public class Ex16Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex17 ex = new Ex17();	// Ex16();
		System.out.println(ex.num1);	// 20
		System.out.println(ex.num2);	// 10
		
		int result = ex.add();
		System.out.println(result);	// 30
		
		result = ex.mul();
		System.out.println(result);	// 200
		
		// this() 자신의 생성자
		// super() 부모 생성자
		
		Ex17 ex1 = new Ex17(20);	// super(num1);
		ex1.setNum2(20);
		
		Ex17 ex2 = new Ex17(20, 10);	// super(num1, num2);
		
		
	}

}
