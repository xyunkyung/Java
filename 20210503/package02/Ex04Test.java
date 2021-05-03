package package02;

public class Ex04Test {

	public static void main(String[] args) {
		String s1 = "123";
		Integer i1 = Integer.parseInt(s1);
		Integer i2 = new Integer(s1);
		System.out.println(i1);
		System.out.println(i2);
		
		String s2 = "10.5";
		// Integer i3 = Integer.parseInt(s2);
		// System.out.println(i3);
		
		int i4 = 123;
		if(i4 == i1) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		if(i1.equals(i4)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		System.out.println("Max : " + Integer.MAX_VALUE);
		System.out.println("Min : " + Integer.MIN_VALUE);
	}
}
