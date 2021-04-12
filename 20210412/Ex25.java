
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 4; i++) {
			System.out.println(i + "번째 입니다.");
		}
		
		System.out.println("");
		
		// 4단 
		for(int i = 1; i <= 9; i++) {
			System.out.println("4 * " + i + " = " + 4 * i);
		}
		
		// 5단
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		
		// 6단
		for(int i = 1; i <= 9; i++) {
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		
		System.out.println("");
		
		for(int i = 4; i <= 6; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
	}

}
