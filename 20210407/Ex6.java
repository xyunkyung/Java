
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = -127;
		int result1 = -i;	// -(-127)
		System.out.println(result1);	// result : 127
		
		result1 = +i;	// +(-127)
		System.out.println(result1);	// result : -127
	
		int a = 10;
		int b = 3;
		int result2;
		result2 = a + b;
		System.out.println(result2);	// result : 13
		
		result2 = a - b;
		System.out.println(result2);	// result : 7
		
		result2 = a * b;
		System.out.println(result2);	// result : 30
		
		result2 = a / b;
		System.out.println(result2);	// result : 3
		
		result2 = a % b;
		System.out.println(result2);	// result : 1
		
		short s = -10;
		int s1 = -s;
		System.out.println(s1);	// result : 10
		
		int j = 10;
		int k = 20;
		
		/*
		 double result3 = j / k;	// 4byte 연산 때문에 0.0 출력
		 System.out.println(result3);	// result : 0.0
		*/
		
		double result3 = (double)j / k;	// 연산 식 자동 형 변환 됨 따라서 한군데만 적어주면 됨
		System.out.println(result3);	// result : 0.5
		
	}

}
