
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 3000;
		if (money >= 3000) {
			System.out.println("�ýø� Ÿ�� ���ÿ�.");
		}
		else {
			System.out.println("�ɾ�ÿ�.");
		}
		
		int score = 78;
		if (score >= 60) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
		
		char gender = 'M';
		if (gender == 'M') {
			System.out.println("����");
		}
		else {
			System.out.println("����");
		}
		
		String str = gender == 'M' ? "����" : "����";
		System.out.println(str);
		
		
	}

}
