
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "��° �Դϴ�.");
		}
		
		int i = 1;
		while (i <= 10) {	// ���ǿ� �������� ������ �ݺ��� ���߰� �ȴ�.
			System.out.println(i + "��° �Դϴ�.");
			i++;
		}
		
		// 5�� ���
		for (i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + 5 * i);
		}
		
		i = 1;
		while (i <= 9) {
			System.out.println("5 * " + i + " = " + 5 * i);
			i++;
		}
		
		// 3�� 3�� ~ 7�� ������ ���
		for (i = 3; i <= 7; i++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
		i = 3;
		while (i <= 7) {
			System.out.println("3 * " + i + " = " + 3 * i);
			i++;
		}
	}

}
