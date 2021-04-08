
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 3000;
		if (money >= 3000) {
			System.out.println("택시를 타고 가시오.");
		}
		else {
			System.out.println("걸어가시오.");
		}
		
		int score = 78;
		if (score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		char gender = 'M';
		if (gender == 'M') {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
		
		String str = gender == 'M' ? "남자" : "여자";
		System.out.println(str);
		
		
	}

}
