package packageTest;

public class Ex11Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex11 ex = new Ex11();
		// ex.num = 1;	// private 접근할 수 없음
		ex.pi = 3.141592;	// protected이기 때문에 같은 패키지 내 접근 가능
		ex.name = "이현경";	// public이므로 접근 가능
		
	}

}
