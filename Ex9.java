
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 65;
		int z = 70;
		
		boolean b = i > j;
		boolean b1 = j == z;
		boolean b2 = b && b1;
		System.out.println(b2);
		
		b2 = i > j && j == z;
		System.out.println(b2);
		System.out.println(i > j && j == z);
		
		b = i < j;
		b1 = j < z;
		b2 = b && b1;
		System.out.println(b2);
		System.out.println(i < j && j < z);
		
		i = 65;
		j = 55;
		z = 90;
		
		b = i == j;
		b1 = j > z;
		b2 = b || b1;
		System.out.println(b2);
		
		b2 = i == j || j > z;
		System.out.println(b2);
		System.out.println(i == j || j > z);
		
		b = i > j;
		b1 = j > z;
		b2 = b || b1;
		System.out.println(b2);
		
	}

}
