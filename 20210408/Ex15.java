
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (2 < 1) {
			System.out.println("2�� 1���� Ů�ϴ�.");
		} else {
			System.out.println("1�� ũ�ٰ� �߸� ������ �־����ϴ�.");
		}
		
		int i = 20;
		int j = 30;
		if (i == j) {
			System.out.println("x�� y���� ���� ����.");
		}
		else {
			System.out.println("x�� y���� ���� �ٸ���.");
		}
		
		// ī�尡 �ְų� ���� 3000�� �̻��̸� �ý� Ÿ�� �� �� ������ �ɾ�ÿ�.
		int money = 2000;
		boolean card = true;
		if (card == true || money >= 3000) {
			System.out.println("�ýø� Ÿ�� ���ÿ�.");
		}
		else {
			System.out.println("�ɾ�ÿ�.");
		}
		
		// ī�嵵 �ְ� ���� 3000�� �̻��� ������ �ý� Ÿ�� �ƴϸ� �ɾ�ÿ�.
		boolean b = money >= 3000 && card;
		System.out.println(b);
		
		if (money >= 3000 && card) {
			System.out.println("�ýø� Ÿ�� ���ÿ�.");
		}
		else {
			System.out.println("�ɾ�ÿ�.");
		}
		
	}

}
