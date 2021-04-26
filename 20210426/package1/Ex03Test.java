package package1;

public class Ex03Test {

	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		ex.num1 = 20;
		ex.num2 = 10;
		ex.add();
		ex.sub();
		ex.mul();
		ex.div();

		ex.num2 = 0;
		System.out.println(ex.num1);
		System.out.println(ex.num2);
		ex.div();
		
		Ex01 ex1 = new Ex02();	// 자동 형 변환
		ex1.num1 = 30;
		ex1.num2 = 15;
		ex1.div();	// 부모 클래스에 있는 메소드
		ex1.mul();	// 부모 클래스에 있는 메소드
		// ex1.add();	// 자식 클래스에 있는 메소드 사용 불가
		
		Ex02 ex2 = (Ex02)ex1;	// 강제 형 변환
		ex2.add();
	}

}
