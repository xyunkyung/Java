
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (2 < 1) {
			System.out.println("2가 1보다 큽니다.");
		} else {
			System.out.println("1이 크다고 잘못 조건을 주었습니다.");
		}
		
		int i = 20;
		int j = 30;
		if (i == j) {
			System.out.println("x와 y값은 서로 같다.");
		}
		else {
			System.out.println("x와 y값은 서로 다르다.");
		}
		
		// 카드가 있거나 돈이 3000원 이상이면 택시 타고 둘 다 없으면 걸어가시오.
		int money = 2000;
		boolean card = true;
		if (card == true || money >= 3000) {
			System.out.println("택시를 타고 가시오.");
		}
		else {
			System.out.println("걸어가시오.");
		}
		
		// 카드도 있고 돈도 3000원 이상이 있으면 택시 타고 아니면 걸어가시오.
		boolean b = money >= 3000 && card;
		System.out.println(b);
		
		if (money >= 3000 && card) {
			System.out.println("택시를 타고 가시오.");
		}
		else {
			System.out.println("걸어가시오.");
		}
		
	}

}
