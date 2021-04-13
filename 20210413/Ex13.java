
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = (int)(Math.random() * 3) + 1;
		int num2;
		do {
			num2 = (int)(Math.random() * 3) + 1;
		} while(num1 == num2);
		
	}

}
