package inheritance;

public class Ex14Test {

	// ��� �ʵ�� �⺻ ���� �����ڰ� protected
	// �������� �⺻ ���� �����ڴ� default�� �Ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex15 ex = new Ex15();
		ex.setNum1(10);
		ex.setNum2(20);
		System.out.println(ex.num1);
		System.out.println(ex.num2);
		
		int i = ex.sub();	// Ex14�� �ִ� ���� Ex15�� �̿��ؼ� ������
		System.out.println(i);
		
		i = ex.div();	// Ex15
		System.out.println(i);
	}

}