
public class Ex13Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex13 ex = new Ex13();
		ex.setAddr("경기도");
		ex.setAge(25);
		ex.setName("이현경");
		System.out.println(ex.getAddr());
		System.out.println(ex.getAge());
		System.out.println(ex.getName());
		
		Ex13 ex1 = new Ex13("이상범", "서울", 15);
		System.out.println(ex1.getAddr());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getName());
		
		ex1.setAddr("성남");
		System.out.println(ex1.getAddr());
	}

}
