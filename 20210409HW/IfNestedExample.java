
public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = (int)(Math.random() * 20) + 81;	// 81 ~ 100
		System.out.println("���� : " + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("���� : " + grade);
	}

}
