package package01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("���α׷��� �����Ϸ��� exit�� ��������.");

			System.out.print("���� ���� �Է��ϼ��� : ");
			String data1 = sc.nextLine();

			System.out.print("�и� ���� �Է��ϼ��� : ");
			String data2 = sc.nextLine();

			System.out.print("�迭 ���ڸ� �Է��ϼ��� : ");
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
				System.out.println("�и� 0�� �ƴ� ���ڸ� �Է��ϼ���!!");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� ũ��� 1�̿��� �մϴ�!!");
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է� �����մϴ�.");
			}
		}
	}
}
