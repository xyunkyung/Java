
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int i1 = 3;
		int result = i % i1;
		System.out.println(result);
		
		i = 10;
		i1 = 20;
		double d = i / i1;		// 4byte ����
		System.out.println(d);	// 0.0

		d = (double) i / i1;	// 8byte �� ��ȯ
		System.out.println(d);	// 0.5
		
		byte b1 = 127;
		byte b2 = 2;
		int result1 = b1 + b2;
		System.out.println(result1);	// 129
		
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);			// -127
		
		i = 2000000000;
		i1 = 2000000000;
		result1 = i + i1;
		System.out.println(result1);	// �����÷ο� �߻�
		
		long l = (long)i + (long)i1;
		System.out.println(l);	// 4000000000
		
		char ch1 = 'A' + 1;	// ������ �� ������ ��� ũ�� ����� ������ ���� �߻� x
		char ch2 = 'A';
		// char ch3 = ch2 + 1;	// 4byte ����
		int i2 = ch2 + 1;
		System.out.println(i2);	// 66
		
		char ch3 = (char)(ch2 + 1);
		System.out.println(ch3);	// B
		
		short s1 = -10;
		short s2 = 10;
		System.out.println(-s1);	// 10
		
		// short s3 = -s1;	// ������ 4byte ���� ���� ���� �߻�
		int result2 = -s1;
		System.out.println(result2);	// 10
		
		char ch5 = 'A' + 5;
		System.out.println(ch5);	// F
		
		char ch6 = 'D';
		int i6 = ch6;
		System.out.println(i6);	//68
		
		char ch7 = (char)(ch6 + 10);
		System.out.println(ch7);	// N
		
		
	}

}
