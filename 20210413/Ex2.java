
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ȧ�� ����ϱ�
		for(int i = 1; i <= 9; i += 2) { 
				System.out.println(i + "��° �Դϴ�.");
		}
		
		System.out.println("");
		
		// continue ����ؼ� Ȧ���� ���
		for(int i = 0; i < 9; i++) {
			i++;
			if(i % 2 == 0) continue;
			System.out.println(i + "��° �Դϴ�.");
		}
		
		System.out.println("");
		
		// ¦�� ����ϱ�
		for(int i = 2; i <= 10; i += 2) {
			System.out.println(i + "��° �Դϴ�.");
		}
		
		System.out.println("");
		
		// continue ����ؼ� ¦���� ���
		for(int i = 0; i < 10; i++) {
			i++;
			if(i % 2 != 0) continue;
			System.out.println(i + "��° �Դϴ�.");
		}
		
	}

}
