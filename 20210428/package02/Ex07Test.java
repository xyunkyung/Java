package package02;

public class Ex07Test {

	public static void main(String[] args) {
		Ex07 ex = new Ex07();
		try {
			ex.div();
		} catch (ArithmeticException e) {
			System.out.println("�и� �� ����!!");
		} catch (NumberFormatException e) {
			System.out.println("�Է� �� ����!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ũ�� ����!!");
		} catch (Exception e) {
			e.printStackTrace(); // ���� ó���� �Ǿ��� �� ��� �������� ���
		} finally {
			System.out.println("�ٽ� ����");
		}
	}

}
