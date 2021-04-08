
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 60점 합격 아니면 불합격. 60점 이상일때만 학점 출력
		int score = 78;
		if (score >= 60) {
			System.out.println("합격");
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else {
				System.out.println("D");
			}
		} else {
			System.out.println("불합격");
		}
		
	}

}
