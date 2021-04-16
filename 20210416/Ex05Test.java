
public class Ex05Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex05 ex = new Ex05("이현경", 25, 156.5);
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println();
		
		Ex05 ex1 = new Ex05();	// default 생성자 실행
		ex1.setAge(25);
		ex1.setHeiggh(162.0);
		ex1.setName("이슬기");
		
		System.out.println(ex1.getName());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
	}

}
