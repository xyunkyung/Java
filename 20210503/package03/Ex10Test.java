package package03;

import java.util.Random;

public class Ex10Test {

	public static void main(String[] args) {
		double num = Math.random();
		
		int num1 = (int)Math.random();
		int num2 = (int)(0.25);
		int num3 = (int)(1.65);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println(num);
		System.out.println(num1);
		
		int num4 = (int)Math.random() * 3;
		// 0 ~ 2
		System.out.println(num4);
		
		int num5 = (int)Math.random() * 9;
		// 0 ~ 8
		int num6 = (int)Math.random() * 45;
		// 0 ~ 44
		int num7 = (int)Math.random() * 45 + 1;
		// 1 ~ 45
		
		Random rnd = new Random();
		int num8 = rnd.nextInt(45); // 0 ~ 44
		System.out.println("num8 : " + num8);
		
		int num9 = rnd.nextInt(45) + 1;	// 1 ~ 45
		System.out.println("num9 : " + num9);
		
	}

}
