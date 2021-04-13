
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 8; i++) {
			System.out.println(i + "번째 입니다.");
		}
		
		System.out.println("");
		
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
		
		System.out.println("");
		
		for(i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
		System.out.println("");
		
		for(i = 3; i <= 7; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		
		System.out.println("");
		
		for(i = 2; i <= 6; i++) {
			System.out.println(i + " * 3 = " + i * 3);
		}
		
		System.out.println("");
		
		for(i = 1; i <= 10; i++) {
			System.out.println(i + "번 찍었습니다.");
			if(i == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
		}
	}

}
