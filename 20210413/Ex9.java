
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2중 while
		// 2단
		int dan = 2;
		int i = 1;
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}

		System.out.println("");

		// 3단
		dan = 3;
		i = 1;
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}

		System.out.println("");

		// 4단
		dan = 4;
		i = 1;
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}

		System.out.println("");

		// 이중 while문으로 구구단
		dan = 2;
		while(dan <= 4) {
			i = 1;
			while(i <= 9) {
				System.out.println(dan + " * " + i + " = " + dan * i);
				i++;
			}
			dan++;
		}
		
		System.out.println("");
		
	}

}
