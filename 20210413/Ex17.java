
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열을 만드는 유형
		int i [] = {10, 20, 30};
		
		int i1[];
		i1 = new int[] {10, 20, 30};
		
		int i2[] = new int[3];	// 배열의 크기를 명시
		i2[0] = 10;
		i2[1] = 20;
		i2[2] = 30;
		
		int i3[];
		i3 = new int[3];
		i3[0] = 10;
		i3[1] = 20;
		i3[2] = 30;
		
		int i4[];
		i4 = new int[3];
		System.out.println(i4[0]);	// 0
		System.out.println(i4[1]);	// 0
		System.out.println(i4[2]);	// 0
		// 배열이 만들어지면 정수형은 0으로 초기화 되어있음
		
		long i5[];
		i5 = new long[3];
		System.out.println(i5[0]);	// 0
		System.out.println(i5[1]);	// 0
		System.out.println(i5[2]);	// 0
		
		float i6[];
		i6 = new float[3];
		System.out.println(i6[0]);	// 0.0
		System.out.println(i6[1]);	// 0.0
		System.out.println(i6[2]);	// 0.0
		
		double i7[];
		i7 = new double[3];
		System.out.println(i7[0]);	// 0.0
		System.out.println(i7[1]);	// 0.0
		System.out.println(i7[2]);	// 0.0
		
		boolean i8[];
		i8 = new boolean[3];
		System.out.println(i8[0]);	// false
		System.out.println(i8[1]);	// false
		System.out.println(i8[2]);	// false
		
		int [] i9 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 배열의 크기 확인
		System.out.println(i9.length);
		
		int sum = 0;
		for(int j = 0; j <10; j++) {
			sum += i9[j];
		}
		System.out.println(sum);
		
		sum = 0;
		for(int j = 0; j < i9.length; j++) {
			sum += i9[j];
		}
		System.out.println(sum);
	}

}
