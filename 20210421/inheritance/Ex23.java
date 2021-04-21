package inheritance;

public class Ex23 extends Ex22 {

	String subject;
	
	public Ex23(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}
	
	// �θ� Ŭ�����κ��� ��� ���� �޼ҵ带 �ڽ� Ŭ�������� Math.PI�� ����ϵ��� ������ : �޼ҵ� �������̵�
	public double area() {
		return radius * radius * Math.PI;
	}
	// �޼ҵ� �����ε�
	public double area(double p) {
		return radius * radius * p;
	}
	
}
