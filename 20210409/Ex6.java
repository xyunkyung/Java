
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 90�� �̻� A 80�� �̻� B 70�� �̻� C 60�� �̻� D �ƴϸ� F
		int score = 78;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		System.out.println("=================");
		
		int num = (int)(Math.random()*6) + 1;
		System.out.println(num);
		// num�� 1�̸� 1�Դϴ�. ���
		// num�� 2�̸� 2�Դϴ�. ��� 
		// num�� 3�̸� 3�Դϴ�. ��� 
		// num�� 4�̸� 4�Դϴ�. ��� 
		// num�� 5�̸� 5�Դϴ�. ��� 
		// num�� 6�̸� 6�Դϴ�. ���
		if (num == 1) {
			System.out.println("1�Դϴ�.");
		} else if (num == 2) {
			System.out.println("2�Դϴ�.");
		} else if (num == 3) {
			System.out.println("3�Դϴ�.");
		} else if (num == 4) {
			System.out.println("4�Դϴ�.");
		} else if (num == 5) {
			System.out.println("5�Դϴ�.");
		} else {
			System.out.println("6�Դϴ�.");
		}
		
		System.out.println("==== switch ====");
		
		switch(num) {
		case 1 :
			System.out.println("1�Դϴ�.");
			break;
		case 2 :
			System.out.println("2�Դϴ�.");
			break;
		case 3 :
			System.out.println("3�Դϴ�.");
			break;
		case 4 :
			System.out.println("4�Դϴ�.");
			break;
		case 5 :
			System.out.println("5�Դϴ�.");
			break;
		case 6 :
			System.out.println("6�Դϴ�.");
			break;
		}
		
	}

}
