
public class Ex08Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex08 ex = new Ex08("������", 25, 156.5);
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println();
		
		// �����ڸ� ���ؼ� �Ϻ� ��� �ʵ� ���� �ʱ�ȭ ��Ű�� ���߿� �������� ���� ����
		Ex08 ex1 = new Ex08("������", 19);
		ex1.setHeight(154.0);
		System.out.println(ex1.getName());
		System.out.println(ex1.getAge());
		System.out.println(ex1.getHeight());
	}

}
