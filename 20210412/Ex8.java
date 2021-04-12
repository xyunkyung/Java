
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 10까지의 합
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ 10까지의 합은 " + sum + "입니다.");
		
		// 1부터 100까지의 합
		sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100까지의 합은 " + sum + "입니다.");
		
		// 1부터 1000까지의 합
		sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("1 ~ 1000까지의 합은 " + sum + "입니다.");
	}

}
