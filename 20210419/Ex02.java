
public class Ex02 {

	public static void main(String [] args) {
		// �޼��尡 �ʿ��� ����
		// 4��
		for(int i = 1; i <= 9; i++) {
			System.out.println("4 x " + i + " = " + 4 * i);
		}
		System.out.println();
		
		// 5��
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 x " + i + " = " + 5 * i);
		}
		System.out.println();
		
		// 6��
		for(int i = 1; i <= 9; i++) {
			System.out.println("6 x " + i + " = " + 6 * i);
		}
		System.out.println();
		
		// 4�� ~ 6��
		for(int dan = 4; dan <= 6; dan++) {
			for(int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " x " + gop + " = " + dan * gop);
			}
		}
		System.out.println();
		
		// 2�� 5�� 8��
		// 2�� ���
		int dan = 8;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
		System.out.println();
		// �ݺ������� �����ؼ� ����ϴ� �ڵ尡 �ִٸ� �ѹ��� �����ؼ� ���
	
		gugu(2);
		gugu(5);
		gugu(7);
	}
	
	public static void gugu(int dan) {	// ��ȣ�� �޼���
		// �ݺ����� �ڵ带 �޼��� �ȿ� ����
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
	}
	
	// �޼����� ����
	// 1. ���� �����Ѵ�.
	// 2. ���� �޾ƿ´�.
	// 3. �ݺ����� �ڵ带 �ѹ��� �����ؼ� ����� �� �ִ�.
}
