
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ±¸±¸´Ü 4´Ü Ãâ·Â,  5°ö ~ 8°ö
		for(int i = 5; i <= 8; i++) {
			System.out.println("4 * " + i + " = " + 4 * i);
		}
		
		// 6´Ü Ãâ·Â, 5°ö ~ 8°ö
		for(int i = 5; i <= 8; i++) {
			System.out.println("6 * " + i + " = " + 6 * i);
		}
		
		System.out.println("");
		
		for(int i = 4; i <= 6; i++) {
			for(int j = 5; j <= 8; j++)
				System.out.println(i + " * " + j + " = " + i * j);
		}
	}

}
