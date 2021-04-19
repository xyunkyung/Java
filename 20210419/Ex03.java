
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2단 출력
		int dan = 2;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
		System.out.println();
		
		// 5단
		dan = 5;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
		System.out.println();
		
		// 7단
		dan = 5;
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println(dan + " x " + gop + " = " + dan * gop);
		}
		System.out.println();
		// 반복적인 코드가 있다면 한번만 정의해서 사용하도록 한다.
		
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
