
public class Ex04Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 생성 후에 멤버 필드에 값을 저장
		Ex04 ex = new Ex04();	// 객체 생성
		ex.setName("이현경");
		ex.setHeight(156.5);
		ex.setAge(25);
		
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println();
		
		Ex04 ex1;	// 객체변수 선언
		ex1 = new Ex04();	// 객체 생성
		
		// 객체가 만들어 질 때 멤버 필드에 값을 저장
		Ex04 ex2 = new Ex04("이슬기", 25, 162.0);
		System.out.println(ex2.getName());
		System.out.println(ex2.getAge());
		System.out.println(ex2.getHeight());
		System.out.println();
	}

}
