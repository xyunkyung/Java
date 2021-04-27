package package02;

public class Ex13Test {

	public static void main(String [] args) {
		Ex09 ex;
		Ex08 ex1 = new Ex09();
		Ex08 ex2 = ex1;
		ex = (Ex09)ex2;
		ex.num1 = 100;
		ex.num2 = 200;
		ex2.add();
		ex1.add();
		
		objprint(ex1);
	}
	
	public static void objprint(Ex08 a) {
		Ex09 ex = (Ex09)a;
		ex.num1 = 200;
		ex.num2 = 300;
		ex.add();
	}
}
