package package8;

public class Ex14Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 부모는 자식 객체를 참조할 수 있다.
		A a = b;
		a = c;
		a = d;	// 클래스 내에서의 형 변환(조부모)
		a = e;  // 클래스 내에서의 형 변환(조부모)
		
		B b1 = new B();
		b = d;
		
		C c1 = new C();
		c = e;
	}

}
