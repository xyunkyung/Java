
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 100������ Ȧ���� ���� ���Ͻÿ�.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "�� ¦���Դϴ�.");
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("");
		
		// ¦���� ���� ���Ͻÿ�.
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i %2 != 0) {
				System.out.println(i + "�� Ȧ���Դϴ�.");
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("");
		
		sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.println("");
		
		// Ȧ���� ���� ���Ͻÿ�.
		sum = 0;
		int i = 1;
		while(i <= 100) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		System.out.println("");
		
		// 1~10���� ����Ͻÿ�. while
		i = 0;
		while(i < 10) {
			i++;
			System.out.println(i);
		}
		
	}

}
