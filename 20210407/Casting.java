
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;			// 00000000 00000000 00000000 00001010
		short s = (short)i;	// 00000000 00001010
		System.out.println(i); // 결과 값 : 10
		
		i = 65537;		// 00000000 00000001 00000000 00000001
		s = (short)i;	// 00000000 00000001
		System.out.println(s); // 결과 값 : 1

		float f = 15.5f;
		int i1 = (int)f;
		System.out.println(i1);	// 결과 값 : 15
		
	}

}
