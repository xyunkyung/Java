package package01;

public class Ex06Test {

	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		Ex02 ex3 = ex;
		
		Ex02 []ex1 = new Ex02[3];
		ex1[0] = new Ex02();
		ex1[1] = new Ex02();
		ex1[2] = new Ex02();
		Ex02 []ex2 = ex1;
		
		objprint(ex);
		ex.add();
		
		objarrayprint(ex1);
		ex1[0].add();
	}

	public static void objprint(Ex02 a) {
		a.num1 = 200;
		a.num2 = 100;
		a.add();
	}
	
	public static void objarrayprint(Ex02 [] a) {
		a[0].num1 = 100;
		a[0].num2 = 300;
		a[0].add();
	}

}
