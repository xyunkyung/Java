
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("");
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("");
		
		i = 1;
		int j = 12;
		while (true) {	// 무한루프
			System.out.println(i);
			if(i == j) break;
			i++;
		}
		
		System.out.println("");
		
	}

}
