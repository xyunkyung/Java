
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while n�� ������ϴ�.
		int i = 1;
		while(i <= 10) {
			System.out.println(i + "�� ������ϴ�.");
			if(i == 10) System.out.println("������ �Ѿ�ϴ�.");
			i++;
		}
		
		System.out.println("");
		
		// n��° �Դϴ�.
		i = 1;
		while(i <= 10) {
			System.out.println(i + "��° �Դϴ�.");
			i++;
		}
		
		System.out.println("");
		
		// 1 ~ 10������ ��
		i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ 10������ ���� : " + sum);
	
		System.out.println("");
		
		i = 1;
		int end = 10;
		sum = 0;
		
		while(i <= end) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ 10������ ���� : " + sum);
		
		System.out.println("");
		
		// ������
		i = 1;
		while(i <= 9) {
			System.out.println("3 * " + i + " = " + 3 * i);
			i++;
		}
		
		System.out.println("");
		
		// ������ Ȧ���� ���
		i = 1;
		while(i <= 9) {
			if(i % 2 != 0) {
				System.out.println("3 * " + i + " = " + 3 * i);
			}
			i++;
		}
		
		System.out.println("");
		
		// continue ������ Ȧ�� ���
		i = 0;
		while(i < 9) {
			i++;
			if(i % 2 == 0) continue;
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
		System.out.println("");
		
		// 100 ~ 1000������ ��
		i = 100;
		end = 1000;
		sum = 0;
		
		while(i <= end) {
			sum += i;
			i++;
		}
		System.out.println("100 ~ 1000������ ���� : " + sum);
		
		System.out.println("");
	}

}
