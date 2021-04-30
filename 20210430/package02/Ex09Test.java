package package02;

import java.util.Scanner;

public class Ex09Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("strat gugudan program");

		while (true) {
			System.out.println("if stop program, input exit");
			System.out.print("input startDan : ");
			String data1 = sc.nextLine();
			System.out.print("input endDan : ");
			String data2 = sc.nextLine();

			if(data1.equals("exit") || data2.equals("exit")) {
				System.out.println("stop program");
				sc.close();
				// break;	// stop only if loop
				System.exit(0); 	// use stop program
			}
			int startDan = Integer.parseInt(data1);
			int endDan = Integer.parseInt(data2);

			for (int dan = startDan; dan <= endDan; dan++) {
				for (int gop = 1; gop <= 9; gop++) {
					System.out.println(dan + " x " + gop + " = " + dan * gop);
				}
				System.out.println();
			}
		}
		// System.out.println("stop if loop");	// do not execute
	}

}
