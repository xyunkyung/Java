package package02;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// int com1 = (int)(Math.random() * 3) + 1;
		Random rnd = new Random(3);
		int com1 = rnd.nextInt(3) + 1;
		
		System.out.println("rock scissors paper game");
		System.out.println("scissors : 1, rock : 2, paper : 3");
		
		int saram = sc.nextInt();
		switch(com1) {
		case 1:
			switch(saram) {
			case 1: System.out.println("draw"); break;
			case 2: System.out.println("win");
			case 3: System.out.println("lose");
			}
			break;
		case 2:
			switch(saram) {
			case 1: System.out.println("lose");
			case 2: System.out.println("draw"); break;
			case 3: System.out.println("win");
			}
			break;
		case 3:
			switch(saram) {
			case 1: System.out.println("win");
			case 2: System.out.println("lose");
			case 3: System.out.println("draw"); break;
			}
			break;
		}
	}

}
