package package02;

import java.util.Scanner;

public class Ex08 {

	public void gugu() throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 출력");
		
		while(true) {
			System.out.println("프로그램 종료하려면 exit 입력");
			
			System.out.print("첫 단 입력 : ");
			String data1 = sc.nextLine();
			System.out.print("마지막 단 입력 : ");
			String data2 = sc.nextLine();
			System.out.print("시작 곱 입력 : ");
			String data3 = sc.nextLine();
			System.out.print("마지막 곱 입력 : ");
			String data4 = sc.nextLine();
			
			if(data1.equals("exit") || data2.equals("exit") || data3.equals("exit") || data4.equals("exit")) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}
				
			int startDan = Integer.parseInt(data1);
			int endDan = Integer.parseInt(data2);
			int startGop = Integer.parseInt(data3);
			int endGop = Integer.parseInt(data4);
			
			// 2단 ~ 9단
			for(int i = startDan; i <= endDan; i++) {
				for(int j = startGop; j <= endGop; j++) {
					System.out.println(i + " x " + j + " = " + i * j);
				}
				System.out.println();
			}
		}
	}
}
