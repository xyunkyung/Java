
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		System.out.println(+i);
		
		int j = 10;
		System.out.println(i + j);
		
		String str = "이숭무" + 1;
		System.out.println(str);
		
		System.out.println("i + j = " + (i + j));
		
		String str1 = "java version : " + 1.8;
		System.out.println(str1);
		
		
		i = 10;
		j = 20;
		boolean b = i > j;
		System.out.println("b = i > j : " + b);
		
		b= i == j;
		System.out.println("i == j : " + b);
		
		b = i < j;
		System.out.println("b = i < j : " + b);
		
		b = i <= j;
		System.out.println("b = i <= j : " + b);
		
		float f = 10.1f;	
		double d = 10.1;
		b = f == d;
		System.out.println("f == d : " + b);	// 정밀도 차이 때문에 false
		
		b = (double)f == d;
		System.out.println("f == d : " + b);
		
		b = f == (float)d;
		System.out.println("f == d : " + b);
		
		i = 1;
		d = 1.0;
		b = i == d;
		System.out.println("i == d : " + b);	// 값의 비교이기 때문에 true
		
	}

}
