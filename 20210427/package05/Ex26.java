package package05;

public class Ex26 implements Ex25 {

	@Override
	public void method1(int dan) {
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);
		}
	}

	
}
