
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 60;
		int j = 70;
		boolean b = i > 50;
		boolean b1 = j < 60;
		boolean b2 = b && b1;
		System.out.println(b2);
		System.out.println(i > 50 && j < 60);
		
		b2 = b || b1;
		System.out.println(b2);
		System.out.println(i < 50 || j < 60);
		
		b = i < 50;
		b1 = j > 90;
		b2 = b || b1;
		System.out.println(b2);
		System.out.println(!b2);
		
	}

}
