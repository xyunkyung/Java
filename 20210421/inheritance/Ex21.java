package inheritance;

public class Ex21 extends Ex20 {

	String subject;
	
	public Ex21(int num1, int num2, String subject) {
		super(num1, num2);	// ������ ���� ����
		this.subject = subject;
	}
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	// �θ� Ŭ������ �ִ� div()�޼ҵ�� ����ϵ� �ڵ�� ����ϰ� ���� �ʴ�
	// �ڽ� Ŭ�������� �θ� Ŭ�����κ��� ��� ���� �޼ҵ带 �����Ѵ�. : ������
	// �޼ҵ� �������̵�
	public int div() {	// �θ� Ŭ������ �ִ� �޼ҵ� �ǹ�
		if(num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}
}
