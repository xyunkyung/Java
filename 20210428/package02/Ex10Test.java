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
				System.out.println("���ڸ� �Է�!!");
			} finally {
				System.out.println("�ٽ� �����Ϸ��� �ƹ� Ű�� �Է�, �����Ϸ��� exit");
				String stop = sc.nextLine();
				if(stop.equals("exit")) {
					System.out.println("���α׷� ����");
					sc.close();
					ex.sc.close();
					break;
				}
			}
		}
	}

}
