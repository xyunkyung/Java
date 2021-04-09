
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1;	// 65 + 1 = 66
		System.out.println(c1);	// B
		
		char c2 = 'A';
		System.out.println(c2);	// A
		
		int c3 = c2 + 1;
		System.out.println(c3);	// 66
		
		char c4 = (char)(c2 + 1);
		System.out.println(c4);	// B
		
		short s1 = 65 + 35;
		System.out.println(s1);	// 100
		
		short s2 = 10;
		short s3 = 20;
		short s4 = (short)(s2 + s3);	// 30
		System.out.println(s4);
		
		int i7 = s2 + s3;
		System.out.println(i7);	// 30
		
		char ch1 = 65;
		char ch2 = 'B' + 1;
		System.out.println(ch2);	// C
		
		char ch3 = (char)(ch2 + 1);
		System.out.println(ch3);	// D
		
		int i8 = ch2 + 1;
		System.out.println(i8);	//68

	}

}
