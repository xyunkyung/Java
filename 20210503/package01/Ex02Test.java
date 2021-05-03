package package01;

import java.util.Scanner;

public class Ex02Test {

	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("startDan : ");
		int startDan = sc.nextInt();

		System.out.print("endDan : ");
		int endDan = sc.nextInt();
		
		System.out.print("startGop : ");
		int startGop = sc.nextInt();
		
		System.out.print("endGop : ");
		int endGop = sc.nextInt();
		
		ex.gugu(startDan, endDan, startGop, endGop);
	}

}
