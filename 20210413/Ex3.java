
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ȧ���� ��
		int sum = 0;
		for(int i = 1; i <= 10; i += 2) {
			sum += i;
		}
		System.out.println("1 ~ 10 �� Ȧ���� �� : " + sum);
	
		System.out.println("");
		
		// continue ����� Ȧ���� ��
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) continue;
			sum += i;
		}
		System.out.println("1 ~ 10 �� Ȧ���� �� : " + sum);
		
		System.out.println("");
		
		// if���� ����ؼ� Ȧ���� ��
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) sum +=i;
		}
		System.out.println("1 ~ 10 �� Ȧ���� �� : " + sum);
		
		System.out.println("");
		
		// 1 ~ 100 �� 10�� ����� ��
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 0) sum += i;
		}
		System.out.println("1 ~ 100 �� 10�� ����� �� : " + sum);
		
		System.out.println("");
		
		sum = 0;
		for(int i = 10; i <= 100; i += 10) {
			sum += i;
		}
		System.out.println("1 ~ 100 �� 10�� ����� �� : " + sum);
		
	}

}
