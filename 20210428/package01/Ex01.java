package package01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 예외 처리 : 실행할 때 발생하는 오류를 제거한다. (실행 오류)
		// 오류 : 컴파일 시 발생하는 오류 (코드 오류) : javac
		// 		프로그램 실행 시 발생할 수 있는 오류 (실행 오류) : java : jvm
		Scanner sc = new Scanner(System.in); // 키보드 값을 받아오는 API

		while (true) {
			System.out.print("분자를 숫자로 입력하세요 : ");
			String data1 = sc.nextLine();

			System.out.print("분모를 숫자로 입력하세요 : ");
			String data2 = sc.nextLine();

			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			try {
				// 실행 오류 발생 시에는 실행되지 않는다.
			System.out.println(num1 / num2);
			} catch(ArithmeticException e) {
				// 실행 오류가 발생할 때 실행되는 블럭
				System.out.println(0);
				System.out.println("분모에는 0이 아닌 숫자를 입력하세요.");
				// e.printStackTrace();
			}
		}
	}

}
