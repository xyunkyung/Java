package package01;

public class Ex05Test {

	public static void main(String[] args) {
		Ex02 ex1 = new Ex02("������");
		ex1.setId("������");
		Ex02 ex2 = new Ex02("������");
		Ex02 ex3 = new Ex02("������");
		Ex04 ex4 = new Ex04();
		
		if(ex1.equals(ex2)) {
			System.out.println("ex1�� ex2�� ������ ���� ������.");
		} else {
			System.out.println("ex1�� ex2�� ������ ���� �ƴմϴ�.");
		}
		
		if(ex1.equals(ex3)) {
			System.out.println("ex1�� ex3�� ������ ���� ������.");
		} else {
			System.out.println("ex1�� ex3�� ������ ���� �ƴմϴ�.");
		}
		
		if(ex1.equals(ex4)) {
			System.out.println("���� Ŭ������ ���� ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Ŭ������ ���� ��ü�Դϴ�.");
		}
	}

}
