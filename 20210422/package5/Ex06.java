package package5;

public class Ex06 extends Ex05 {

	Ex06(int num1, int num2) {
		super(num1, num2);
	}

	public int mul() {
		return num1 * num2;
	}

	public double div() {
		return num1 / num2;
	}
	/*
	 * 부모 클래스에 있는 매소드에 final이라고 주면 재정의를 할 수 없다. public int sub() { // 부모로부터 상속 받은
	 * 메소드를 재정의
	 * 
	 * return num2 - num1;
	 */
}
