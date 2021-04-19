
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 매개변수의 개수를 모르는 경우
		add(3, 4);
		// 매개변수와 매개변수에 전달되는 값의 개수는 같아야 한다.
		int [] val = {1, 2, 3, 4, 5};
		sum(val);
		sum2(1, 2, 3, 4, 5);
		sum2(1, 2, 3);
		sum2(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void sum(int [] i) {
		int sum = 0;
		for(int j : i) {
			sum += j;
		}
		System.out.println(sum);
	}
	public static void sum2(int ... i) {
		int sum = 0;
		for(int j : i) {
			sum += j;
		}
		System.out.println(sum);
	}
}
