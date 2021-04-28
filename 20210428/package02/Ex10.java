package package02;

import java.util.Scanner;

public class Ex10 {

	Scanner sc = new Scanner(System.in);
	public void gugu() throws NumberFormatException {
		System.out.print("시작 단 입력 : ");
		String data1 = sc.nextLine();
		System.out.print("끝 단 입력 : ");
		String data2 = sc.nextLine();
		System.out.print("시작 곱 입력 : ");
		String data3 = sc.nextLine();
		System.out.print("끝 곱 입력 : ");
		String data4 = sc.nextLine();
		
		int startDan = Integer.parseInt(data1);
		int endDan = Integer.parseInt(data2);
		int startGop = Integer.parseInt(data3);
		int endGop = Integer.parseInt(data4);
		
		for(int dan = startDan; dan <= endDan; dan++) {
			for(int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " x " + gop + " = " + dan * gop);
			}
			System.out.println();
		}
	}
}
