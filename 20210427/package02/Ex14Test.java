package package02;

public class Ex14Test {

	public static void main(String[] args) {
		double d = 10.5;
		int i = (int)d;
		System.out.println(i);
		
		Ex09 ex;
		Ex08 ex1 = new Ex09();
		Ex08 ex2 = ex1;
		ex = (Ex09)ex2;
		ex.num1 = 300;
		ex.num2 = 400;
		ex.add();
		ex1.add();
		ex2.add();
		
		objprint(ex1);
		ex1.add();
		
		Ex08 []ex3 = new Ex08[3];
		ex3[0] = new Ex09();
		ex3[1] = new Ex09();
		ex3[2] = new Ex09();
		Ex08 [] ex4 = ex3;
		
		ex = (Ex09)ex4[0];
		ex.num1 = 10;
		ex.num2 = 30;
		ex.add();
		ex3[0].add();
		ex4[0].add();
		
		objarrayprint(ex3);
		ex3[0].add();
	}

	public static void objprint(Ex08 a) {
		Ex09 ex = (Ex09)a;
		ex.add();
		ex.num1 = 1500;
		ex.num2 = 2000;
	}
	public static void objarrayprint(Ex08 []ex04) {
		Ex09 ex = (Ex09)ex04[0];
		ex.add();
		ex.num1 = 300;
		ex.num2 = 500;
	}
}
