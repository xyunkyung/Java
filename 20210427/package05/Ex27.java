package package05;

public class Ex27 implements Ex25 {

	// �߻� �޼ҵ� ������
	@Override
	public void method1(int dan) {
		int startGop = 5;
		int endGop = 9;
		for (int gop = startGop; gop <= endGop; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
	}

	// default �޼ҵ� ������
	@Override
	public void method2() {
		int startDan = 4;
		int endDan = 8;
		for (int dan = startDan; dan < endDan; dan++) {
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}

	}
}
