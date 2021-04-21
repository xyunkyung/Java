package inheritance;

public class Ex14 {

	// private 상속 불가
	int num1;	// 멤버필드의 접근 지정자는 protected가 된다
	int num2;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
}
