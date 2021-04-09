
public class OperationCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short s = 10;	// 00000000 00001010
		int i = 65537;	// 00000000 00000001 00000000 00001010
		int i1 = s + i;	// 2byte + 4byte (자동 형 변환 발생)
		System.out.println(i1);	// result : 65547
		
		int i2 = 10;
		double d = 170.5;
		double d1 = i2 + d;	// 4byte + 8byte (자동 형 변환 발생)
		System.out.println(d1);	// result : 180.5
		
		System.out.println(10 + 20);	// 4byte + 4byte
		
		byte b = 10;
		byte b1 = 20;
		// byte b2 = b + b1;	// 2byte + 2byte 이므로 연산 불가
		int b2 = b + b1;
		System.out.println(b2);	// result : 30
		
		short s1 = 10;
		short s2 = 20;
		int i3 = s1 + s2;
		System.out.println(i3);
		
		float f1 = 10.5f;
		float f2 = 20.5f;
		float d2 = f1 + f2;
		System.out.println(d2);	// result : 31.0
		
		double d3 = f1 + 100.5;	// 4byte + 8byte (자동 형 변환 발생)
		System.out.println(d3);	// result : 111.0
		
		int x, y, z;
		x = y = z = 10;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
