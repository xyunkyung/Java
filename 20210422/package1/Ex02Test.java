package package1;

public class Ex02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex02 ex = new Ex02();	// �ڽ� Ŭ������ default ������ ����
		int result = ex.add();
		System.out.println(result);
		
		Ex02 ex1 = new Ex02(30);	// �Ű������� �ϳ��� ������ ����
		result = ex1.mul();
		System.out.println(result);
		
		Ex02 ex2 = new Ex02(20, 10);
		result = ex2.div();
		System.out.println(result);
		
		Ex02 ex3 = new Ex02(0, 20);
		result = ex3.div();
		System.out.println(result);
		
		Ex02 ex4 = new Ex02(20, 0);
		result = ex4.div();
		System.out.println(result);	// �Ҵ�
	}

}
