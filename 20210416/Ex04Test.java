
public class Ex04Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ü ���� �Ŀ� ��� �ʵ忡 ���� ����
		Ex04 ex = new Ex04();	// ��ü ����
		ex.setName("������");
		ex.setHeight(156.5);
		ex.setAge(25);
		
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println();
		
		Ex04 ex1;	// ��ü���� ����
		ex1 = new Ex04();	// ��ü ����
		
		// ��ü�� ����� �� �� ��� �ʵ忡 ���� ����
		Ex04 ex2 = new Ex04("�̽���", 25, 162.0);
		System.out.println(ex2.getName());
		System.out.println(ex2.getAge());
		System.out.println(ex2.getHeight());
		System.out.println();
	}

}
