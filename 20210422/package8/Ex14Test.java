package package8;

public class Ex14Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// �θ�� �ڽ� ��ü�� ������ �� �ִ�.
		A a = b;
		a = c;
		a = d;	// Ŭ���� �������� �� ��ȯ(���θ�)
		a = e;  // Ŭ���� �������� �� ��ȯ(���θ�)
		
		B b1 = new B();
		b = d;
		
		C c1 = new C();
		c = e;
	}

}
