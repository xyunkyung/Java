package package8;

public class Ex22Test {

	public static void main(String[] args) {
		int [] i = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		Ex21 ex1 = new Ex21();
		
		Ex21 [] ex = new Ex21[3];
		ex[0] = new Ex21();
		ex[1] = new Ex21();
		ex[2] = new Ex21();
		
		print(i);
		exPrint(ex1);
		objPrint(ex);
	}
	
	public static void print(int [] j) {
		System.out.println(j[0]);
		System.out.println(j[1]);
		System.out.println(j[2]);
	}

	public static void exPrint(Ex21 a) {
		a.num1 = 10;
		a.num2 = 20;
		a.sum();
	}
	
	public static void objPrint(Ex21 [] a) {
		
	}
}
