package package1;

public class Ex03Test {

	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		ex.num1 = 20;
		ex.num2 = 10;
		ex.add();
		ex.sub();
		ex.mul();
		ex.div();

		ex.num2 = 0;
		System.out.println(ex.num1);
		System.out.println(ex.num2);
		ex.div();
		
		Ex01 ex1 = new Ex02();	// �ڵ� �� ��ȯ
		ex1.num1 = 30;
		ex1.num2 = 15;
		ex1.div();	// �θ� Ŭ������ �ִ� �޼ҵ�
		ex1.mul();	// �θ� Ŭ������ �ִ� �޼ҵ�
		// ex1.add();	// �ڽ� Ŭ������ �ִ� �޼ҵ� ��� �Ұ�
		
		Ex02 ex2 = (Ex02)ex1;	// ���� �� ��ȯ
		ex2.add();
	}

}
