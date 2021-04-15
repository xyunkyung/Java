
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("10");
		System.out.println(10);
		System.out.println("Hello java");
		
		// 정수형 리터널
		byte b = 1;
		char c = 1;
		short s = 1;
		int i = 1;
		long l = 1;
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		// 실수형 리터널
		float f = 10.5f;
		double d = 10.5;
		System.out.println(f);
		System.out.println(d);
		
		// 문자형 리터널
		char c1 = 65;
		char c2 = 'A';
		System.out.println(c1);
		System.out.println(c2);
		
		// 문자열 리터널
		String str = "hello java";
		String name = "이승무";
		System.out.println(str);
		System.out.println(name);
		
		int i1 = 10;	// 선언 동시에 값 초기화
		int i2;			// 선언
		i2 = 10;
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(10);
		System.out.println("i3");
		
		int i3 = 0;
		System.out.println(i3);
		
		// 변수 명은 대소문자 구분
		String firstName;
		String FirstName;
		
		char ch1 = '가';
		System.out.println(ch1);
		
		int value;
		value = 10;
		int result = value + 1;
		System.out.println(result);
		
		// 논리형 리터널
		boolean b1 = true;
		System.out.println(b1);
		
		// 자동 형 변환
		b = 100;	// 1byte
		System.out.println(b);
		
		s = b;		// 2byte
		i = s;		// 4byte
		System.out.println(i);
		
		// 강제 형 변환
		i = 100;
		b = (byte)i;
		System.out.println(b);
		
	}

}
