package package5;

import java.awt.print.Printable;

public class EX15Test {

	static int i = 0;
	public static void main(String[] args) {
		for(int j = 1; j <= 5; j++) {
			run();
		}
	}
	public static void run() {
		print();
	}
	public static void print() {
		i++;
		System.out.println("run()에 의해서 " + i + "번 실행");
	}

}
