
public class Ex02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex02 ex = new Ex02();
		
		// ����ʵ带 ���� ����� �� ���� ���� (����)�����̶�� ��.
		ex.setName("������");	// ex.name = "������";
		ex.setAge(25);	// ex.age = 25;
		ex.setHeight(156.5);	// ex.height = 156.5;
		ex.setAddr("��⵵");	// ex.addr = "��⵵";
		
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println(ex.getAddr());
		System.out.println();

		Ex02 ex1 = new Ex02();
		ex1.print();	// �ʱⰪ 	: null 0.0 0 null
		
	}

}
