
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 10������ ��
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ 10������ ���� " + sum + "�Դϴ�.");
		
		// 1���� 100������ ��
		sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100������ ���� " + sum + "�Դϴ�.");
		
		// 1���� 1000������ ��
		sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("1 ~ 1000������ ���� " + sum + "�Դϴ�.");
	}

}
