package package3;

// 패키지가 다르면 import를 해주어야 함
import package1.Ex06;

public class Ex08Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex06 ex = new Ex06();
		// ex.name="이현경";	// private는 다른 패키지에서도 사용할 수 없음
		// ex.addr = "경기도";	// protected는 패키지가 다르면 접근할 수 없음
		// ex.height = 156.5;
		ex.phone = "010-0000-0000";	// public은 어디서든지 접근 가능
	
		// ex.print();	// 패키지가 다르기 때문에 접근할 수 없음
		
	}

}
