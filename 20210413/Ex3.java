
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 홀수의 합
		int sum = 0;
		for(int i = 1; i <= 10; i += 2) {
			sum += i;
		}
		System.out.println("1 ~ 10 중 홀수의 합 : " + sum);
	
		System.out.println("");
		
		// continue 사용한 홀수의 합
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) continue;
			sum += i;
		}
		System.out.println("1 ~ 10 중 홀수의 합 : " + sum);
		
		System.out.println("");
		
		// if문만 사용해서 홀수의 합
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) sum +=i;
		}
		System.out.println("1 ~ 10 중 홀수의 합 : " + sum);
		
		System.out.println("");
		
		// 1 ~ 100 중 10의 배수의 합
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 0) sum += i;
		}
		System.out.println("1 ~ 100 중 10의 배수의 합 : " + sum);
		
		System.out.println("");
		
		sum = 0;
		for(int i = 10; i <= 100; i += 10) {
			sum += i;
		}
		System.out.println("1 ~ 100 중 10의 배수의 합 : " + sum);
		
	}

}
