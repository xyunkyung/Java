
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stack, heap, method
		// stack : ����, ��
		// heap : ��
		int i = 10;	// stack ����	i : 10
		int j = 20;	// stack ���� j : 20
		double d = 10.5;	// stack ���� d : 10.5
		String str = "������";	// stack ���� str : �ּ� ��
								// heap ���� ������ : �޸� �ּ�
		String str1 = "������";	// stack ���� str1 : �ּ� ��
		// �ּҰ� ����Ǵ� ������ �ּ� ���� ( = ���� ���� )
		// ���� ���� : ���ڿ�, �迭, ������
		int [] i1 = {1, 2, 3, 4, 5};	// stack ���� i1 : �ּ� ��
										// heap ���� 1, 2, 3, 4, 5 : �ּ� ��
		System.out.println(i1);
		System.out.println(i1[0]);	// �ּҰ�[0]
		System.out.println(i1[1]); 	// �ּҰ�[1]
		System.out.println(i1[2]);	// �ּҰ�[2]
	}

}
