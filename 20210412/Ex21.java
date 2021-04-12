
public class Ex21 {

	public static void main(String [] args) {
		// 1부터 100까지 출력하시오 while
		int i = 0;
		while (i < 100) {
			i++;
			System.out.println(i);
		}
		
		System.out.println("");
		
		// 3부터 95까지 출력하시오. 
		i = 2;
		while (i < 95) {
			i++;
			System.out.println(i);
		}
		
		System.out.println("");
		
		// 1부터 100중 3의 배수만 출력하시오.
		i = 0;
		while(i < 100) {
			i++;
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("");
		
		// 4배수만 출력하시오.
		i = 0;
		while(i < 100) {
			i++;
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
	}
}
