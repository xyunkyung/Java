
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 8; i++) {
			System.out.println(i + "��° �Դϴ�.");
		}
		
		System.out.println("");
		
		int i = 1;
		int sum = 0;
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1���� 10������ �� : " + sum);
		
		System.out.println("");
		
		for(i = 1; i <= 9; i++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
		System.out.println("");
		
		for(i = 3; i <= 7; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		
		System.out.println("");
		
		for(i = 2; i <= 6; i++) {
			System.out.println(i + " * 3 = " + i * 3);
		}
		
		System.out.println("");
		
		for(i = 1; i <= 10; i++) {
			System.out.println(i + "�� ������ϴ�.");
			if(i == 10) {
				System.out.println("������ �Ѿ�ϴ�.");
			}
		}
	}

}
