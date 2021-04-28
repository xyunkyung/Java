package package02;

import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		Ex10 ex = new Ex10();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				ex.gugu();
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력!!");
			} finally {
				System.out.println("다시 시작하려면 아무 키가 입력, 종료하려면 exit");
				String stop = sc.nextLine();
				if(stop.equals("exit")) {
					System.out.println("프로그램 종료");
					sc.close();
					ex.sc.close();
					break;
				}
			}
		}
	}

}
