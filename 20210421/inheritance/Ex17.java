package inheritance;

public class Ex17 extends Ex16 {

	public Ex17() {
		super();	// 부모 클래스의 default 생성자 호출
	}
	public Ex17(int num1) {
		super(num1);
	}
	public Ex17(int num1, int num2) {
		super(num1, num2);
	}
	public int mul() {
		return num1 * num2;
	}
	public int div() {
		return num1 /  num2;
	}
}
