
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� 10���� Ȧ���� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue;
			System.out.println(i + "��° �Դϴ�.");
		}
		
		System.out.println("");
		
		int i = 1;
		while (i <= 10) {
			if (i % 2 != 0) {
			System.out.println(i + "��° �Դϴ�.");
			}
			i++;
		}
		
		// ¦���� ���
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "��° �Դϴ�.");
			}
		}
	}

}
