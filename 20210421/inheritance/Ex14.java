package inheritance;

public class Ex14 {

	// private ��� �Ұ�
	int num1;	// ����ʵ��� ���� �����ڴ� protected�� �ȴ�
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
