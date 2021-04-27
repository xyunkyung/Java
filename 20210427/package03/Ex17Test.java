package package03;

public class Ex17Test {

	public static void main(String[] args) {
		Ex16 ex = new Ex16();
		ex.num1 = 300;
		ex.num2 = 500;
		ex.add();
	
		Ex16 exx;
		Ex15 ex1 = new Ex16();
		Ex15 ex2 = ex1;
		exx = (Ex16)ex2;
		exx.num1 = 10;
		exx.num2 = 20;
		ex1.add();
		ex2.add();
		exx.add();
		
		objprint(ex1);
		ex1.add();
		
		Ex15 []ex3 = new Ex15[3];
		ex3[0] = new Ex16();
		ex3[1] = new Ex16();
		ex3[2] = new Ex16();
		Ex15 [] ex4 = ex3;
		exx = (Ex16)ex4[0];
		exx.num1 = 30;
		exx.num2 = 50;
		exx.add();
		ex4[0].add();
		ex3[0].add();
		
		objarrayprint(ex3);
		exx.add();
		ex4[0].add();
		ex3[0].add();
	}

	public static void objprint(Ex15 a) {
		Ex16 ex = (Ex16)a;
		ex.add();
		ex.num1 = 300;
		ex.num2 = 500;
	}
	
	public static void objarrayprint(Ex15 []a) {
		Ex16 ex = (Ex16)a[0];
		ex.add();
		ex.num1 = 300;
		ex.num2 = 500;
	}
}
