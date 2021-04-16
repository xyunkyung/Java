
public class Ex01Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex01 ex = new Ex01();
		ex.name = "이현경";
		ex.height = 156.5;
		ex.age = 25;
		ex.addr = "경기도";
		
		System.out.println(ex.name);
		System.out.println(ex.height);
		System.out.println(ex.age);
		System.out.println(ex.addr);
		System.out.println();
		
		Ex01 ex1 = new Ex01();	// 다형성
		ex1.name = "이슬기";
		ex1.height = 162.0;
		ex1.age = 25;
		ex.addr = "인천";
		
		System.out.println(ex1.name);
		System.out.println(ex1.height);
		System.out.println(ex1.age);
		System.out.println(ex1.addr);
		System.out.println();
		
	}

}
