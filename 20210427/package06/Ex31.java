package package06;

public class Ex31 extends Ex29 {

	@Override
	void method1(int dan) {
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
	}

	@Override
	public void method2() {
		int startDan = 4;
		int endDan = 8;
		for(int dan = startDan; dan <= endDan; dan++) {
			for(int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
	}
	
}
