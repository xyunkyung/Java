package package1;

public class Ex02 extends Ex01 {

	public Ex02() {
		super();	// 부모 클래스의 default 생성자를 실행시킴
	}
	public Ex02(int num1) {
		super(num1);
		num2 = 20;
	}
	public Ex02(int num1, int num2) {
		super(num1, num2);
	}
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	public int div() {	// 부모로부터 받은 메소드를 재정의 : 메소드 오버라이딩
		if(num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}
}
