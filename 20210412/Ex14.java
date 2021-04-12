
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 입니다.");
		}
		
		int i = 1;
		while (i <= 10) {	// 조건에 만족하지 않으면 반복을 멈추게 된다.
			System.out.println(i + "번째 입니다.");
			i++;
		}
		
		// 5단 출력
		for (i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		
		i = 1;
		while (i <= 9) {
			System.out.println("5 * " + i + " = " + 5 * i);
			i++;
		}
		
		// 3단 3곱 ~ 7곱 까지만 출력
		for (i = 3; i <= 7; i++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
		i = 3;
		while (i <= 7) {
			System.out.println("3 * " + i + " = " + 3 * i);
			i++;
		}
	}

}
