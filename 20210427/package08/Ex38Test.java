package package08;

import java.util.Scanner;

public class Ex38Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���α׷� �����Ϸ��� exit�� �Է��ϼ��� ");
			System.out.print("�и� ���� �Է��ϼ��� : ");
			String data1 = sc.nextLine();
			System.out.print("���� ���� �Է��ϼ��� : ");
			String data2 = sc.nextLine();
			
			if(data1.equals("exit") || data2.equals("exit")) {
				System.out.println("���α׷� ����");
				break;
			}
			
			try {
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			System.out.println(num2 / num1);
			} catch(NumberFormatException e) {
				System.out.println("���ڷ� �Է����ּ���.");
			} catch(ArithmeticException e) {
				System.out.println("�и� ���� 0�̸� �ȵ˴ϴ�.");
			}
		}
	}

}
