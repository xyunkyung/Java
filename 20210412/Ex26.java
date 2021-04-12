
public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 7단 출력
		for(int i = 1; i <= 9; i++) {
			System.out.println("7 * " + i + " = " + 7 * i);
		}
		
		// 8단
		for(int i = 1; i <= 9; i++) {
			System.out.println("8 * " + i + " = " + 8 * i);
		}
		
		// 9단
		for(int i = 1; i <= 9; i++) {
			System.out.println("9 * " + i + " = " + 9 * i);
		}
		
		System.out.println("");
		
		for(int i = 7; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		System.out.println("");
		
		// 3단부터 6단, 2곱 부터 5곱
		for(int i = 3; i <= 6; i ++) {
			for(int j = 2; j <= 5; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
