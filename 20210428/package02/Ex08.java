package package02;

import java.util.Scanner;

public class Ex08 {

	public void gugu() throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���");
		
		while(true) {
			System.out.println("���α׷� �����Ϸ��� exit �Է�");
			
			System.out.print("ù �� �Է� : ");
			String data1 = sc.nextLine();
			System.out.print("������ �� �Է� : ");
			String data2 = sc.nextLine();
			System.out.print("���� �� �Է� : ");
			String data3 = sc.nextLine();
			System.out.print("������ �� �Է� : ");
			String data4 = sc.nextLine();
			
			if(data1.equals("exit") || data2.equals("exit") || data3.equals("exit") || data4.equals("exit")) {
				System.out.println("���α׷� ����");
				sc.close();
				break;
			}
				
			int startDan = Integer.parseInt(data1);
			int endDan = Integer.parseInt(data2);
			int startGop = Integer.parseInt(data3);
			int endGop = Integer.parseInt(data4);
			
			// 2�� ~ 9��
			for(int i = startDan; i <= endDan; i++) {
				for(int j = startGop; j <= endGop; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
				System.out.println();
			}
		}
	}
}
