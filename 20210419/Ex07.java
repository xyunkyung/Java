
public class Ex07 {

	static int num1 = 3;
	static int num2 = 4;
	static String firstName = "����";
	static String lastName = "��";
	static int radius = 3;
	static double pi = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4. �Ű������� ���� ��ȯ ���� ���� �޼���
		add();
		name();
		area();
		rangleArea();
	}

	public static void add() {
		System.out.println(num1 + num2);
	}
	public static void name() {
		System.out.println(lastName + firstName);
	}
	public static void area() {
		System.out.println(radius * radius * pi);
	}
	public static void rangleArea() {
		System.out.println(num1 * num2);
	}
}
