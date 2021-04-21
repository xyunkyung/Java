package packageTest1;

import packageTest.Ex11;

public class Ex12 {

	public static void main(String [] args) {
		Ex11 ex = new Ex11();
		// ex.num = 10;	// private이므로 사용 불가
		// ex.pi = 3.141592;	// protected는 다른 패키지 내에서 사용 불가
		ex.name = "이현경";	// public은 어디서든지 사용 가능
		
	}
}
