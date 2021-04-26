package package8;

public class Ex23Test {

	public static void main(String [] args) {
		int i = 10;
		int j = i;
		Ex21 ex = new Ex21();
		Ex21 ex1 = ex;
		
		int i1[] = {1, 2, 3, 4, 5};
		int j1[] = i1;
		Ex21 [] ex2 = new Ex21[3];
		Ex21 [] ex3 = ex2;
		
		print(j);
		objprint(ex);
		arrayprint(j1);
		arrayobjprint(ex3);
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void objprint(Ex21 a) {
		a.num1 = 10;
		a.num2 = 20;
		a.sub();
	}
	
	public static void arrayprint(int [] a) {
		System.out.println(a[0]);
	}
	
	public static void arrayobjprint(Ex21 [] a) {
		a[0] = new Ex21();
		a[0].num1 = 10;
		a[0].num2 = 20;
		a[0].sum();
	}
}
