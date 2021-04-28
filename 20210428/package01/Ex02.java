package package01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("프로그램을 종료하려면 exit를 적으세요.");

			System.out.print("분자 값을 입력하세요 : ");
			String data1 = sc.nextLine();

			System.out.print("분모 값을 입력하세요 : ");
			String data2 = sc.nextLine();

			System.out.print("배열 숫자를 입력하세요 : ");
			String data3 = sc.nextLine();
			int idx = Integer.parseInt(data3);

			int[] num = new int[2];
			Exception ex = new ArithmeticException();
			ex = new ArrayIndexOutOfBoundsException();
			try {
				num[0] = Integer.parseInt(data1); // parsing
				num[idx] = Integer.parseInt(data2);
				System.out.println(num[0] / num[1]);
			} catch (ArithmeticException e) {
				System.out.println("분모에 0이 아닌 숫자를 입력하세요!!");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 크기는 1이여야 합니다!!");
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}
		}
	}
}
