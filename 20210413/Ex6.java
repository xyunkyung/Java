
public class Ex6 {

	public static void main(String [] args) {
		
		// 4�� ���
		int dan = 4;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
		System.out.println("");
		
		// 5�� ���
		dan = 5;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
		System.out.println("");
		
		// 6�� ���
		dan = 6;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
		System.out.println("");
		
		// ���� �������� 4 ~ 6�� ���
		for(int i = 4; i <= 6; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		System.out.println("");
	}
}
