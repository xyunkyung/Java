
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2�� while
		// 2��
		int dan = 2;
		int i = 1;
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}

		System.out.println("");

		// 3��
		dan = 3;
		i = 1;
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}

		System.out.println("");

		// 4��
		dan = 4;
		i = 1;
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}

		System.out.println("");

		// ���� while������ ������
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
