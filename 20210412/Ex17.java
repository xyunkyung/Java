
public class Ex17 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println("������ " + i + "�� ������ϴ�.");
			i++;
		}

		System.out.println("");

		// 1���� 100���� ���Ͻÿ�
		i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		System.out.println("");

		sum = 0;

		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);

		System.out.println("");

		// 1~100���� �� Ȧ���� ���Ͻÿ�.
		i = 0;
		sum = 0;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
	}
}
