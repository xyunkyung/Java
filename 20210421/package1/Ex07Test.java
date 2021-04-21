package package1;

public class Ex07Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex06 ex = new Ex06();
		// ex.name = "이현경";	// private는 직접 접근할 수 없음
		// ex.age = 25;
		ex.addr = "시흥";		// protected는 직접 접근이 가능
		ex.height = 156.5; 	// 접근 지정이 없어도 접근 가능
		ex.phone = "010-0000-0000";
		
		ex.print();
		

		
	}

}
