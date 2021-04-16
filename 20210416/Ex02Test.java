
public class Ex02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex02 ex = new Ex02();
		
		// 멤버필드를 직접 사용할 수 없는 것을 (정보)은닉이라고 함.
		ex.setName("이현경");	// ex.name = "이현경";
		ex.setAge(25);	// ex.age = 25;
		ex.setHeight(156.5);	// ex.height = 156.5;
		ex.setAddr("경기도");	// ex.addr = "경기도";
		
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println(ex.getAddr());
		System.out.println();

		Ex02 ex1 = new Ex02();
		ex1.print();	// 초기값 	: null 0.0 0 null
		
	}

}
