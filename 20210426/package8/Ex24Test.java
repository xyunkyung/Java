package package8;

public class Ex24Test {

	public static void main(String[] args) {
		int i = 10;
		int []j = {1, 2, 3, 4, 5};
		Ex21 ex = new Ex21();
		Ex21 [] ex1 = new Ex21[3];

		intprint(i);
		arrayprint(j);
		objprint(ex);
		objarrayprint(ex1);
		
	}
	public static void intprint(int a) {
		System.out.println(a);
	}
	
	public static void arrayprint(int [] a) {
		System.out.println(a[0]);
	}
	
	public static void objprint(Ex21 a) {
		a.num1 = 20;
		a.num2 = 30;
		a.sum();
	}
	
	public static void objarrayprint(Ex21 [] a) {
		a[0] = new Ex21();
		a[0].num1 = 20;
		a[0].num2 = 10;
		a[0].sum();
	}

}
