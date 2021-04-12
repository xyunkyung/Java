
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 10까지 반복하는데 3의 배수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("");
		
		int i = 1;
		
		while (i <= 10) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
