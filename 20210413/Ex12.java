
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// do ~ while
		int num1, num2, num3, num4, num5, num6;

		num1 = (int) (Math.random() * 45) + 1;
		System.out.println(num1);

		do {
			num2 = (int) (Math.random() * 45) + 1;
			System.out.println(num2);
		} while (num1 == num2);

		do {
			num3 = (int) (Math.random() * 45) + 1;
			System.out.println(num3);
		} while (num1 == num3 || num2 == num3);
		
		do {
			num4 = (int) (Math.random() * 45) + 1;
			System.out.println(num4);
		} while (num1 == num4 || num2 == num4 || num3 == num4);
		
		do {
			num5 = (int) (Math.random() * 45) + 1;
			System.out.println(num5);
		} while (num1 == num5 || num2 == num5 || num3 == num5 || num4 == num5);
		
		do {
			num6 = (int) (Math.random() * 45) + 1;
			System.out.println(num6);
		} while (num1 == num6 || num2 == num6 || num3 == num6 || num4 == num6 || num5 == num6);
	
		System.out.println("");
		
		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6);
		
		System.out.println("");
		
		// for문으로 로또 프로그램 만들기
		
		
	}

}
