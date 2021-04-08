
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		--i;	
		System.out.println(i);		// 9 
		
		--i;
		System.out.println(i);		// 8
		
		--i;
		System.out.println(i);		// 7
		
		System.out.println(--i);	// 6
		
		System.out.println(i--);	// 6
		
		System.out.println(i);		// 5
		
		System.out.println("=========================");
		
		i = 10;
		int j = 10;
		int z = ++i + j++;
		System.out.println("z = " + z);	// 21
		System.out.println("i = " + i);	// 11
		System.out.println("j = " + j);	// 11
		
	}

}
