
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2�� ���
		int dan = 2;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
		System.out.println();
		
		// 5��
		dan = 5;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
		System.out.println();
		
		// 7��
		dan = 5;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
		System.out.println();
		// �ݺ����� �ڵ尡 �ִٸ� �ѹ��� �����ؼ� ����ϵ��� �Ѵ�.
		
		gugu(2);
		gugu(5);
		gugu(7);
	}
	public static void gugu(int dan) {
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
	}

}
