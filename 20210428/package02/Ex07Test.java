package package02;

public class Ex07Test {

	public static void main(String[] args) {
		Ex07 ex = new Ex07();
		try {
			ex.div();
		} catch (ArithmeticException e) {
			System.out.println("분모 값 에러!!");
		} catch (NumberFormatException e) {
			System.out.println("입력 값 에러!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기 에러!!");
		} catch (Exception e) {
			e.printStackTrace(); // 예외 처리가 되었을 때 어떠한 오류인지 출력
		} finally {
			System.out.println("다시 시작");
		}
	}

}
