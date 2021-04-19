
public class Ex01Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex01 ex = new Ex01();
		ex.setNum(1); 
		// 실행코드를 가지고 있지 않고 메서드 명만 가지고 있는 메서드를 호출 메서드
		System.out.println(ex.getNum());
		
		Ex01 ex1 = new Ex01(1, "이현경");
		// 생성자가 하는 역할은 객체 생성 시에 멤버필드에 값을 초기화한다.
		
	}

}
