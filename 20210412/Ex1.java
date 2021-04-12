
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		
		if (num == 1) {
			System.out.println("1입니다.");
		} else if (num == 2) {
			System.out.println("2입니다.");
		} else if (num == 3) {
			System.out.println("3입니다.");
		} else {
			System.out.println("4 이상 입니다.");
		}
		
		System.out.println("===== switch =====");
		
		switch(num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("4 이상 입니다.");
			break;
		}
	}

}
