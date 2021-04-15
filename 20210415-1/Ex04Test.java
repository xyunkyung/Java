
public class Ex04Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex04 ex = new Ex04();
		ex.setAge(15);
		// System.out.println(ex.age);	// 15
		
		// ex.age = 20;	// 은닉되어 있지 않다.
		System.out.println(ex.getAge());	// 20
	}

}
