
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while n번 찍었습니다.
		int i = 1;
		while(i <= 10) {
			System.out.println(i + "번 찍었습니다.");
			if(i == 10) System.out.println("나무가 넘어갑니다.");
			i++;
		}
		
		System.out.println("");
		
		// n번째 입니다.
		i = 1;
		while(i <= 10) {
			System.out.println(i + "번째 입니다.");
			i++;
		}
		
		System.out.println("");
		
		// 1 ~ 10까지의 합
		i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ 10까지의 합은 : " + sum);
	
		System.out.println("");
		
		i = 1;
		int end = 10;
		sum = 0;
		
		while(i <= end) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ 10까지의 합은 : " + sum);
		
		System.out.println("");
		
		// 구구단
		i = 1;
		while(i <= 9) {
			System.out.println("3 * " + i + " = " + 3 * i);
			i++;
		}
		
		System.out.println("");
		
		// 구구단 홀수만 출력
		i = 1;
		while(i <= 9) {
			if(i % 2 != 0) {
				System.out.println("3 * " + i + " = " + 3 * i);
			}
			i++;
		}
		
		System.out.println("");
		
		// continue 구구단 홀수 출력
		i = 0;
		while(i < 9) {
			i++;
			if(i % 2 == 0) continue;
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
		System.out.println("");
		
		// 100 ~ 1000까지의 합
		i = 100;
		end = 1000;
		sum = 0;
		
		while(i <= end) {
			sum += i;
			i++;
		}
		System.out.println("100 ~ 1000까지의 합은 : " + sum);
		
		System.out.println("");
	}

}
