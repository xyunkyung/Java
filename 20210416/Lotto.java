
public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lotto[] = new int[6];
		
		System.out.print("�ζ� ��ȣ : ");
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1;
			lotto[i] = num;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i] + " ");
		}

		/*
		int lotto[] = new int[6];

		// ��ȣ ����
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			// �ߺ� ��ȣ ����
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("�ζ� ��ȣ: ");

		// ��ȣ ���
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		*/

	}
}
		