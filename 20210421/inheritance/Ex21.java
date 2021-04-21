package inheritance;

public class Ex21 extends Ex20 {

	String subject;
	
	public Ex21(int num1, int num2, String subject) {
		super(num1, num2);	// 생성자 먼저 실행
		this.subject = subject;
	}
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	// 부모 클래스에 있는 div()메소드는 사용하되 코드는 사용하고 싶지 않다
	// 자식 클래스에서 부모 클래스로부터 상속 받은 메소드를 수정한다. : 재정의
	// 메소드 오버라이딩
	public int div() {	// 부모 클래스에 있는 메소드 의미
		if(num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}
}
