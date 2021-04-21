package inheritance;

public class Ex14Test {

	// 멤버 필드는 기본 접근 지정자가 protected
	// 생성자의 기본 접근 지정자는 default가 할당
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex15 ex = new Ex15();
		ex.setNum1(10);
		ex.setNum2(20);
		System.out.println(ex.num1);
		System.out.println(ex.num2);
		
		int i = ex.sub();	// Ex14에 있는 것을 Ex15를 이용해서 가져옴
		System.out.println(i);
		
		i = ex.div();	// Ex15
		System.out.println(i);
	}

}
