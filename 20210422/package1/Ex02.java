package package1;

public class Ex02 extends Ex01 {

	public Ex02() {
		super();	// �θ� Ŭ������ default �����ڸ� �����Ŵ
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
	public int div() {	// �θ�κ��� ���� �޼ҵ带 ������ : �޼ҵ� �������̵�
		if(num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}
}
