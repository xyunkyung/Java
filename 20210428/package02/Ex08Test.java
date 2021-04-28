package package02;

public class Ex08Test {

	public static void main(String[] args) {
		Ex08 ex = new Ex08();
		try {
			ex.gugu();
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력!!");
		} finally {
			System.out.println("다시 시작");
		}
	}

}
