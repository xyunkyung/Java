package package9;

public class ChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		// parent.method3();	// �ڵ� �� ��ȯ�� ���� �� �ڽ��� ������ �ִ� �޼���� �θ� ����� �� ����.
	}

}
