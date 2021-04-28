package package02;

import java.util.Scanner;

public class Ex07 {

	Scanner sc = new Scanner(System.in);

	public void div() throws ArrayIndexOutOfBoundsException, NumberFormatException, ArithmeticException {

		System.out.println("나눗셈 프로그램 시작");

		while (true) {
			System.out.println("프로그램 종료하려면 exit 입력");
			System.out.print("분자값 숫자로 입력 : ");
			String data1 = sc.nextLine();
			System.out.print("분모값 숫자로 입력 : ");
			String data2 = sc.nextLine();

			System.out.print("idx 값 입력 : ");
			String data3 = sc.nextLine();

			if (data1.equals("exit") || data2.equals("exit") || data3.equals("exit")) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}
			int idx = Integer.parseInt(data3);

			int[] num = new int[2];
			num[0] = Integer.parseInt(data1);
			num[idx] = Integer.parseInt(data2);

			System.out.println(num[0] / num[idx]);
		}
	}
}
