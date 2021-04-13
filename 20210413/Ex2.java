
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 홀수 출력하기
		for(int i = 1; i <= 9; i += 2) { 
				System.out.println(i + "번째 입니다.");
		}
		
		System.out.println("");
		
		// continue 사용해서 홀수만 출력
		for(int i = 0; i < 9; i++) {
			i++;
			if(i % 2 == 0) continue;
			System.out.println(i + "번째 입니다.");
		}
		
		System.out.println("");
		
		// 짝수 출력하기
		for(int i = 2; i <= 10; i += 2) {
			System.out.println(i + "번째 입니다.");
		}
		
		System.out.println("");
		
		// continue 사용해서 짝수만 출력
		for(int i = 0; i < 10; i++) {
			i++;
			if(i % 2 != 0) continue;
			System.out.println(i + "번째 입니다.");
		}
		
	}

}
