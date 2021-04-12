
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 10까지 홀수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue;
			System.out.println(i + "번째 입니다.");
		}
		
		System.out.println("");
		
		int i = 1;
		while (i <= 10) {
			if (i % 2 != 0) {
			System.out.println(i + "번째 입니다.");
			}
			i++;
		}
		
		// 짝수를 출력
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "번째 입니다.");
			}
		}
	}

}
