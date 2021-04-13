
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int sum = 0;
		
		sum = sum + i1;
		sum = sum + i2;
		sum = sum + i3;
		sum = sum + i4;
		
		System.out.println(sum + "\n");
		
		// 배열 사용
		int [] a = {10, 20, 30, 40};
		sum = 0;
		for(int i = 0; i <= 3; i++) {
			sum += a[i];
		}
		System.out.println(sum + "\n");
		
	}

}
