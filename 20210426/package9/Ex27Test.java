package package9;

public class Ex27Test {

	public static void main(String[] args) {
		Ex26 ex = new Ex26();
		print(ex);

		Ex25 ex1 = new Ex26();
		print(ex1);
		
		Ex26 [] ex2 = new Ex26[3];
		print(ex2);
		
		Ex25 [] ex3 = new Ex26[3];
		print(ex3);
	}

	public static void print(Ex26 a) {
		a.num1 = 20;
		a.num2 = 30;
		a.div();
	}
	
	public static void print(Ex25 a) {	// 부모 클래스를 매개변수로 받음
		Ex26 ex = (Ex26)a;
		ex.num1 = 20;
		ex.num2 = 30;
		ex.add();
	}
	
	public static void print(Ex26 [] a) {
		a[0] = new Ex26();
		a[0].num1 = 20;
		a[0].num2 = 30;
		a[0].sub();
	}
	
	public static void print(Ex25 [] a) {
		a[0] = new Ex26();
		Ex26 b = (Ex26)a[0];
		b.num1 = 20;
		b.num2 = 30;
		b.sub();
	}
}
