package package08;

import java.util.Scanner;

public class Ex38Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("프로그램 종료하려면 exit를 입력하세요 ");
			System.out.print("분모 값을 입력하세요 : ");
			String data1 = sc.nextLine();
			System.out.print("분자 값을 입력하세요 : ");
			String data2 = sc.nextLine();
			
			if(data1.equals("exit") || data2.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			try {
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			System.out.println(num2 / num1);
			} catch(NumberFormatException e) {
				System.out.println("숫자로 입력해주세요.");
			} catch(ArithmeticException e) {
				System.out.println("분모 값이 0이면 안됩니다.");
			}
		}
	}

}
