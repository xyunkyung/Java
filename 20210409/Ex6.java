
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 90점 이상 A 80점 이상 B 70점 이상 C 60점 이상 D 아니면 F
		int score = 78;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		System.out.println("=================");
		
		int num = (int)(Math.random()*6) + 1;
		System.out.println(num);
		// num이 1이면 1입니다. 출력
		// num이 2이면 2입니다. 출력 
		// num이 3이면 3입니다. 출력 
		// num이 4이면 4입니다. 출력 
		// num이 5이면 5입니다. 출력 
		// num이 6이면 6입니다. 출력
		if (num == 1) {
			System.out.println("1입니다.");
		} else if (num == 2) {
			System.out.println("2입니다.");
		} else if (num == 3) {
			System.out.println("3입니다.");
		} else if (num == 4) {
			System.out.println("4입니다.");
		} else if (num == 5) {
			System.out.println("5입니다.");
		} else {
			System.out.println("6입니다.");
		}
		
		System.out.println("==== switch ====");
		
		switch(num) {
		case 1 :
			System.out.println("1입니다.");
			break;
		case 2 :
			System.out.println("2입니다.");
			break;
		case 3 :
			System.out.println("3입니다.");
			break;
		case 4 :
			System.out.println("4입니다.");
			break;
		case 5 :
			System.out.println("5입니다.");
			break;
		case 6 :
			System.out.println("6입니다.");
			break;
		}
		
	}

}
