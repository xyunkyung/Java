package package01;

public class Ex04Test {
	public static void main(String [] args) {
		int i  = 10;
		System.out.println("i : " + i);
		int j = i;
		intprint(i);
		
		int []i1 = new int[3];
		i1[0] = 1;
		i1[1] = 2;
		i1[2] = 3;
		intarrayprint(i1);
		
		Ex02 ex = new Ex02();
		Ex02 ex1 = ex;
		ex.num1 = 10;
		ex1.num2 = 20;
		ex.add();
		objprint(ex);
		
		Ex02 []ex2 = new Ex02[3];
		ex2[0] = new Ex02();
		ex2[1] = new Ex02();
		ex2[2] = new Ex02();
		Ex02 ex3 [] = ex2;
		ex2[0].num1 = 200;
		ex3[0].num2 = 100;
		ex3[0].add();
		objarrayprint(ex2);
		
		Ex02 ex5 [] = ex2;
		ex5[0].mul();
	}
	public static void intprint(int j) {
		System.out.println("j : " + j);
	}
	public static void intarrayprint(int []a) {
		System.out.println(a[0]);
	}
	public static void objprint(Ex02 a) {
		a.sub();
	}
	public static void objarrayprint(Ex02 a []) {
		a[0].add();
	}
}
