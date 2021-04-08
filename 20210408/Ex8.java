
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 65;
		int j = 70;
		int z = 80;
		boolean b = i < j;	// true
		boolean b1 = i > z;	// false
		
		boolean result = b && b1;	// true AND false
		System.out.println(result);	// false
		
		result = i < j && i > z;
		System.out.println(result);
		
	}

}
