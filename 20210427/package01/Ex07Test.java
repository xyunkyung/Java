package package01;

public class Ex07Test {

	public static void main(String[] args) {
		Ex01 ex = new Ex02();
		Ex01 ex1 = ex;
		ex.num1 = 200;
		ex1.num2 = 300;
		ex.add();
		ex1.add();
		
		Ex01[]ex2 = new Ex01[3];
		ex2[0] = new Ex02();
		ex2[1] = new Ex02();
		ex2[2] = new Ex02();
		
		Ex01 []ex3 = ex2;
		ex2[0].num1 = 200;
		ex2[0].num2 = 300;
		ex2[0].add();
		ex3[0].add();
		
		objprint(ex);
		ex.div();
		
		objarrayprint(ex2);
		ex2[0].add();
	}

	public static void objprint(Ex01 a) {
		a.div();
		a.num1 = 250;
		a.num2 = 10;
	}
	public static void objarrayprint(Ex01 [] a) {
		a[0].add();
		a[0].num1 = 250;
		a[0].num2 = 10;
	}
}
